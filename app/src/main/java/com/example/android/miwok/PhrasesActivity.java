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

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(getString(R.string.miw_phrase1), getString(R.string.eng_phrase1), R.raw.phrase_where_are_you_going));
        words.add(new Word(getString(R.string.miw_phrase2), getString(R.string.eng_phrase2), R.raw.phrase_what_is_your_name));
        words.add(new Word(getString(R.string.miw_phrase3), getString(R.string.eng_phrase3), R.raw.phrase_my_name_is));
        words.add(new Word(getString(R.string.miw_phrase4), getString(R.string.eng_phrase4), R.raw.phrase_how_are_you_feeling));
        words.add(new Word(getString(R.string.miw_phrase5), getString(R.string.eng_phrase5), R.raw.phrase_im_feeling_good));
        words.add(new Word(getString(R.string.miw_phrase6), getString(R.string.eng_phrase6), R.raw.phrase_are_you_coming));
        words.add(new Word(getString(R.string.miw_phrase7), getString(R.string.eng_phrase7), R.raw.phrase_yes_im_coming));
        words.add(new Word(getString(R.string.miw_phrase8), getString(R.string.eng_phrase8), R.raw.phrase_im_coming));
        words.add(new Word(getString(R.string.miw_phrase9), getString(R.string.eng_phrase9), R.raw.phrase_lets_go));
        words.add(new Word(getString(R.string.miw_phrase10), getString(R.string.eng_phrase10), R.raw.phrase_come_here));

        WordAdapter wordsAdapter = new WordAdapter(this, words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(wordsAdapter);

    }
}
