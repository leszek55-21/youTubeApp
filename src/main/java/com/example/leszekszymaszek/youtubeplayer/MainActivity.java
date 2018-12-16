package com.example.leszekszymaszek.youtubeplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPlaySingle = findViewById(R.id.btnPlaySingle);
        Button btnStandalone = findViewById(R.id.btnStandalone);

        btnPlaySingle.setOnClickListener(this);
        btnStandalone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch (v.getId()) {
            case R.id.btnPlaySingle :
                intent = new Intent(this, YouTubeActivity.class);
                break;
            case R.id.btnStandalone :
                intent = new Intent(this, StandaloneActivity.class);
                break;
            default:
        }
        if(intent != null) {
            startActivity(intent);
        }
    }
}
