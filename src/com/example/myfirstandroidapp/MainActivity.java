package com.example.myfirstandroidapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    public void displayMessage(View view){
    	Toast.makeText(this, "You clicked display", Toast.LENGTH_SHORT).show();
    	Intent displayActivityIntent = new Intent(this, ShowMessageActivity.class);
    	EditText edittext = (EditText) findViewById(R.id.edit_text);
    	String userText = edittext.getText().toString();
    	displayActivityIntent.putExtra(this.getClass().getName(), userText); 
    	startActivity(displayActivityIntent);
    	
    }
    
}
