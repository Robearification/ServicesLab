package com.example.robert.serviceslab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private Button mStart;
    private Button mStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //startService(new Intent(this, RSSService.class));

        mStart = (Button) findViewById(R.id.start_button);
        mStop = (Button) findViewById(R.id.stop_button);

    }
}
