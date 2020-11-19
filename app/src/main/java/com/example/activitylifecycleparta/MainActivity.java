package com.example.activitylifecycleparta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /*
                TO-DOlIST
                1. MainActivity extend the activity/AppcompactActivity
                2. Implement the call back function4
                3. Observe how the callbacks are called

         */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "App is created state", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "App is visible state", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume(){ //when we come back to app..thn it wl be in paused and thn move to onresume state
        super.onResume();
        Toast.makeText(this, "App is Interactive state", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause(){//when we go back app will be paused and go to stopeed state
        super.onPause();
        Toast.makeText(this, "App is Paused state", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "App is Stopped  state", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, "App is Paused state", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "App is Paused state", Toast.LENGTH_LONG).show();
    }


}