package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> numbersEnglish = new ArrayList<>();
        numbersEnglish.add("one");
        numbersEnglish.add("two");
        numbersEnglish.add("three");
        numbersEnglish.add("four");
        numbersEnglish.add("five");
        numbersEnglish.add("six");
        numbersEnglish.add("seven");
        numbersEnglish.add("eight");
        numbersEnglish.add("nine");
        numbersEnglish.add("ten");

        LinearLayout rootView = findViewById(R.id.rootView);

        for (int index = 0; index < numbersEnglish.size(); index++) {
            TextView numbersView = new TextView(this);
            numbersView.setText(numbersEnglish.get(index));
            rootView.addView(numbersView);
        }
    }
}
