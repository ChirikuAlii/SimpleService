package com.example.chiriku711.myservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnStartService , btnIntentService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartService = findViewById(R.id.btn_start_service);
        btnStartService.setOnClickListener(this);

        btnIntentService = findViewById(R.id.btn_start_intent_service);
        btnIntentService.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn_start_service){
            Intent mStartService = new Intent(MainActivity.this , OriginService.class);
            startService(mStartService);
        }

        if (v.getId() == R.id.btn_start_intent_service){
            Intent mStartIntentService = new Intent(MainActivity.this , MyIntentService.class);
            mStartIntentService.putExtra(MyIntentService.EXTRA_DURATION,5000);
            startService(mStartIntentService);

        }


    }
}
