package com.rawtalent.workshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        TextView textView=findViewById(R.id.showhistory);
        SharedPreferences sharedPreferences=getSharedPreferences("HISTORY", Context.MODE_PRIVATE);
        String res=sharedPreferences.getString("HISTORY","");
        textView.setText(res);
    }
}