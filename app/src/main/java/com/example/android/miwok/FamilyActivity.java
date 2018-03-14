/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private MediaPlayer.OnCompletionListener completionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(getString(R.string.miw_father), getString(R.string.eng_father), R.drawable.family_father, R.raw.family_father));
        words.add(new Word(getString(R.string.miw_mother), getString(R.string.eng_mother), R.drawable.family_mother, R.raw.family_mother));
        words.add(new Word(getString(R.string.miw_son), getString(R.string.eng_son), R.drawable.family_son, R.raw.family_son));
        words.add(new Word(getString(R.string.miw_daughter), getString(R.string.eng_daughter), R.drawable.family_daughter, R.raw.family_daughter));
        words.add(new Word(getString(R.string.miw_older_brother), getString(R.string.eng_older_brother), R.drawable.family_older_brother, R.raw.family_older_brother));
        words.add(new Word(getString(R.string.miw_younger_brother), getString(R.string.eng_younger_brother), R.drawable.family_younger_brother, R.raw.family_younger_brother));
        words.add(new Word(getString(R.string.miw_older_sister), getString(R.string.eng_older_sister), R.drawable.family_older_sister, R.raw.family_older_sister));
        words.add(new Word(getString(R.string.miw_younger_sister), getString(R.string.eng_younger_sister), R.drawable.family_younger_sister, R.raw.family_younger_sister));
        words.add(new Word(getString(R.string.miw_grandmother), getString(R.string.eng_grandmother), R.drawable.family_grandmother, R.raw.family_grandmother));
        words.add(new Word(getString(R.string.miw_grandfather), getString(R.string.eng_grandfather), R.drawable.family_grandfather, R.raw.family_grandfather));

        WordAdapter wordsAdapter = new WordAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(wordsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = words.get(i);
                releaseMediaPlayer();
                MediaPlayer mediaPlayer = MediaPlayer.create(FamilyActivity.this, word.getAudioResourceId());
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(completionListener);
            }
        });

    }

    private void releaseMediaPlayer () {
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
