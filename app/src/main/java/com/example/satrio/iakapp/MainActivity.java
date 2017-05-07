package com.example.satrio.iakapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView share, isi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        share = (TextView) findViewById(R.id.share);
        isi = (TextView) findViewById(R.id.isi);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT,isi.getText().toString());
                i.setType("text/plain");
                startActivity(i);
            }
        });
    }
}
