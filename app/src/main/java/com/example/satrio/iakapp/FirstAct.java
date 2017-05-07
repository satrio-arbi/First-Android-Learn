package com.example.satrio.iakapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FirstAct extends AppCompatActivity {
    Button monggo;
    ImageView background;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        monggo = (Button) findViewById(R.id.monggo);
        monggo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(FirstAct.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
