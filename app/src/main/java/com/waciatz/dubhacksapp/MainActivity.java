package com.waciatz.dubhacksapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bandaid; // index 0
    Button temp; // index 1
    Button cond;// index 2
    ImageButton submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bandaid = (Button) findViewById(R.id.button_bandaid);
        temp = (Button) findViewById( R.id.button_pad);
        cond = (Button) findViewById(R.id.button_condom);
        submit = (ImageButton) findViewById(R.id.button_submit);
        bandaid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                //Intent activityChangeIntent = new Intent(MainActivity.this, BandaidActivity.class);

                // currentContext.startActivity(activityChangeIntent);

                //startActivity(activityChangeIntent);
                setContentView(R.layout.activity_band_aid_layer);
            }
        });
        temp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                //Intent activityChangeIntent = new Intent(MainActivity.this, TempActivity.class);

                // currentContext.startActivity(activityChangeIntent);
                setContentView(R.layout.activity_pad_layer);
                //startActivity(activityChangeIntent);
            }
        });
        cond.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                //Intent activityChangeIntent = new Intent(MainActivity.this, CondActivity.class);

                // currentContext.startActivity(activityChangeIntent);
                setContentView(R.layout.activity_condom_layer);
                //startActivity(activityChangeIntent);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Toast.makeText(MainActivity.this, "Please Select an Item First!",
                        Toast.LENGTH_LONG).show();
            }
        });

    }
}
