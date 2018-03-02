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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(getString(R.string.miw_father), getString(R.string.eng_father)));
        words.add(new Word(getString(R.string.miw_mother), getString(R.string.eng_mother)));
        words.add(new Word(getString(R.string.miw_son), getString(R.string.eng_son)));
        words.add(new Word(getString(R.string.miw_daughter), getString(R.string.eng_daughter)));
        words.add(new Word(getString(R.string.miw_older_brother), getString(R.string.eng_older_brother)));
        words.add(new Word(getString(R.string.miw_younger_brother), getString(R.string.eng_younger_brother)));
        words.add(new Word(getString(R.string.miw_older_sister), getString(R.string.eng_older_sister)));
        words.add(new Word(getString(R.string.miw_younger_sister), getString(R.string.eng_younger_sister)));
        words.add(new Word(getString(R.string.miw_grandmother), getString(R.string.eng_grandmother)));
        words.add(new Word(getString(R.string.miw_grandfather), getString(R.string.eng_grandfather)));

        WordAdapter wordsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(wordsAdapter);

    }
}
