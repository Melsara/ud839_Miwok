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
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(getString(R.string.miw_1), getString(R.string.eng_1)));
        words.add(new Word(getString(R.string.miw_2), getString(R.string.eng_2)));
        words.add(new Word(getString(R.string.miw_3), getString(R.string.eng_3)));
        words.add(new Word(getString(R.string.miw_4), getString(R.string.eng_4)));
        words.add(new Word(getString(R.string.miw_5), getString(R.string.eng_5)));
        words.add(new Word(getString(R.string.miw_6), getString(R.string.eng_6)));
        words.add(new Word(getString(R.string.miw_7), getString(R.string.eng_7)));
        words.add(new Word(getString(R.string.miw_8), getString(R.string.eng_8)));
        words.add(new Word(getString(R.string.miw_9), getString(R.string.eng_9)));
        words.add(new Word(getString(R.string.miw_10), getString(R.string.eng_10)));

        WordAdapter wordsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(wordsAdapter);



    }
}
