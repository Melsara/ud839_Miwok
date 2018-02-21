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

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        String [] engNumbers = new String [10];
        engNumbers[0] = getString(R.string.eng_1);
        engNumbers[1] = getString(R.string.eng_2);
        engNumbers[2] = getString(R.string.eng_3);
        engNumbers[3] = getString(R.string.eng_4);
        engNumbers[4] = getString(R.string.eng_5);
        engNumbers[5] = getString(R.string.eng_6);
        engNumbers[6] = getString(R.string.eng_7);
        engNumbers[7] = getString(R.string.eng_8);
        engNumbers[8] = getString(R.string.eng_9);
        engNumbers[9] = getString(R.string.eng_10);

        Log.v("NumbersActivity", "Word at index 0 = " + engNumbers[0]);
        Log.v("NumbersActivity", "Word at index 1 = " + engNumbers[1]);
        Log.v("NumbersActivity", "Word at index 2 = " + engNumbers[2]);
        Log.v("NumbersActivity", "Word at index 3 = " + engNumbers[3]);
        Log.v("NumbersActivity", "Word at index 4 = " + engNumbers[4]);
        Log.v("NumbersActivity", "Word at index 5 = " + engNumbers[5]);
        Log.v("NumbersActivity", "Word at index 6 = " + engNumbers[6]);
        Log.v("NumbersActivity", "Word at index 7 = " + engNumbers[7]);
        Log.v("NumbersActivity", "Word at index 8 = " + engNumbers[8]);
        Log.v("NumbersActivity", "Word at index 9 = " + engNumbers[9]);
    }
}
