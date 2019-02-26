package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
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

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, R.layout.list_item, numbersEnglish);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
