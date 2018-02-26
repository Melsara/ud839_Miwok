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

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> engNumbers = new ArrayList<String>();
        engNumbers.add(getString(R.string.eng_1));
        engNumbers.add(getString(R.string.eng_2));
        engNumbers.add(getString(R.string.eng_3));
        engNumbers.add(getString(R.string.eng_4));
        engNumbers.add(getString(R.string.eng_5));
        engNumbers.add(getString(R.string.eng_6));
        engNumbers.add(getString(R.string.eng_7));
        engNumbers.add(getString(R.string.eng_8));
        engNumbers.add(getString(R.string.eng_9));
        engNumbers.add(getString(R.string.eng_10));

        Log.v("NumbersActivity", "Word at index 0 = " + engNumbers.get(0));
        Log.v("NumbersActivity", "Word at index 1 = " + engNumbers.get(1));
        Log.v("NumbersActivity", "Word at index 2 = " + engNumbers.get(2));
        Log.v("NumbersActivity", "Word at index 3 = " + engNumbers.get(3));
        Log.v("NumbersActivity", "Word at index 4 = " + engNumbers.get(4));
        Log.v("NumbersActivity", "Word at index 5 = " + engNumbers.get(5));
        Log.v("NumbersActivity", "Word at index 6 = " + engNumbers.get(6));
        Log.v("NumbersActivity", "Word at index 7 = " + engNumbers.get(7));
        Log.v("NumbersActivity", "Word at index 8 = " + engNumbers.get(8));
        Log.v("NumbersActivity", "Word at index 9 = " + engNumbers.get(9));


    }
}
