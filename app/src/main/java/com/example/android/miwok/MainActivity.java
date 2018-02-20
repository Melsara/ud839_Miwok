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

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView numbersCat;
    TextView familyCat;
    TextView colorsCat;
    TextView phrasesCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numbersCat = (TextView) findViewById(R.id.numbers);
        familyCat = (TextView) findViewById(R.id.family);
        colorsCat = (TextView) findViewById(R.id.colors);
        phrasesCat = (TextView) findViewById(R.id.phrases);

        if (numbersCat != null) {
            numbersCat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openNumbersList(numbersCat);
                }
            });

        }

        if (familyCat != null) {
            familyCat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openFamilyList(familyCat);
                }
            });
        }

        if (colorsCat != null) {
            colorsCat.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    openColorsList(colorsCat);
                }
            });
        }

        if (phrasesCat != null) {
            phrasesCat.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    openPhrasesList(phrasesCat);
                }
            });
        }
    }

    public void openNumbersList (View view){
        Intent numbersList = new Intent (this, NumbersActivity.class);
        startActivity(numbersList);
    }

    public void openFamilyList (View view)  {
        Intent familyList = new Intent(this, FamilyActivity.class);
        startActivity(familyList);
    }

    public void openColorsList (View view) {
        Intent colorsList = new Intent (this, ColorsActivity.class);
        startActivity(colorsList);
    }

    public void openPhrasesList (View view) {
        Intent phrasesList = new Intent (this, PhrasesActivity.class);
        startActivity(phrasesList);
    }

}
