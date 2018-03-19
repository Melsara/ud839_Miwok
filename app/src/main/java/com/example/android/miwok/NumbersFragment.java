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
public class NumbersFragment extends Fragment {
    private MediaPlayer mediaPlayer;
    private AudioManager mAudioManager;

    private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener = (new AudioManager.OnAudioFocusChangeListener() {
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
    });

    private MediaPlayer.OnCompletionListener completionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };

    public NumbersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_words, container, false);
        mAudioManager = (AudioManager) getActivity().getSystemService(Context.AUDIO_SERVICE);
        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(getString(R.string.miw_1), getString(R.string.eng_1), R.drawable.number_one, R.raw.number_one));
        words.add(new Word(getString(R.string.miw_2), getString(R.string.eng_2), R.drawable.number_two, R.raw.number_two));
        words.add(new Word(getString(R.string.miw_3), getString(R.string.eng_3), R.drawable.number_three, R.raw.number_three));
        words.add(new Word(getString(R.string.miw_4), getString(R.string.eng_4), R.drawable.number_four, R.raw.number_four));
        words.add(new Word(getString(R.string.miw_5), getString(R.string.eng_5), R.drawable.number_five, R.raw.number_five));
        words.add(new Word(getString(R.string.miw_6), getString(R.string.eng_6), R.drawable.number_six, R.raw.number_six));
        words.add(new Word(getString(R.string.miw_7), getString(R.string.eng_7), R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word(getString(R.string.miw_8), getString(R.string.eng_8), R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word(getString(R.string.miw_9), getString(R.string.eng_9), R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word(getString(R.string.miw_10), getString(R.string.eng_10), R.drawable.number_ten, R.raw.number_ten));

        WordAdapter wordsAdapter = new WordAdapter(getActivity(), words, R.color.category_numbers);

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

                if (resultAudioFocus == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
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
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
        }
    }
}
