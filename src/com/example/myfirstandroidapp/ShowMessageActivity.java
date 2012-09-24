package com.example.myfirstandroidapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class ShowMessageActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);
        Intent startingIntent = getIntent(); 
        String userText = startingIntent.getStringExtra(MainActivity.class.getName());
        TextView textView = (TextView) findViewById(R.id.display_text);
        textView.setText(userText);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_show_message, menu);
        return true;
    }
}
