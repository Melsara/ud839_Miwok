package com.example.android.miwok;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorsFragment extends Fragment {

    private MediaPlayer mediaPlayer;
    private AudioManager mAudioManager;

    private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
                    focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                mediaPlayer.pause();
                mediaPlayer.seekTo(0);
            } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                mediaPlayer.start();
            } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                releaseMediaPlayer();
            }
        }
    };

    private MediaPlayer.OnCompletionListener completionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };

    public ColorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_words, container, false);

        mAudioManager = (AudioManager) getActivity().getSystemService(Context.AUDIO_SERVICE);
        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(getString(R.string.miw_red), getString(R.string.eng_red), R.drawable.color_red, R.raw.color_red));
        words.add(new Word(getString(R.string.miw_green), getString(R.string.eng_green), R.drawable.color_green, R.raw.color_green));
        words.add(new Word(getString(R.string.miw_brown), getString(R.string.eng_brown), R.drawable.color_brown, R.raw.color_brown));
        words.add(new Word(getString(R.string.miw_grey), getString(R.string.eng_grey), R.drawable.color_gray, R.raw.color_gray));
        words.add(new Word(getString(R.string.miw_black), getString(R.string.eng_black), R.drawable.color_black, R.raw.color_black));
        words.add(new Word(getString(R.string.miw_white), getString(R.string.eng_white), R.drawable.color_white, R.raw.color_white));
        words.add(new Word(getString(R.string.miw_dust_yellow), getString(R.string.eng_dust_yellow), R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        words.add(new Word(getString(R.string.miw_mustard_yellow), getString(R.string.eng_mustard_yellow), R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        WordAdapter wordsAdapter = new WordAdapter(getActivity(), words, R.color.category_colors);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(wordsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                releaseMediaPlayer();
                Word word = words.get(i);

                int resultAudioFocus = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,
                        AudioManager.STREAM_MUSIC,
                        AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

                if (resultAudioFocus == AudioManager.AUDIOFOCUS_REQUEST_GRANTED){
                    mediaPlayer = MediaPlayer.create(getActivity(), word.getAudioResourceId());
                    mediaPlayer.start();
                    mediaPlayer.setOnCompletionListener(completionListener);
                }

            }
        });

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    private void releaseMediaPlayer () {
        if (mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
        }
    }

}
