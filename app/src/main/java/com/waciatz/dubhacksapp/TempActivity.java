package com.waciatz.dubhacksapp;

/**
 * Created by Juan on 10/22/2017.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class TempActivity extends AppCompatActivity {
    Button bandaid;
    Button cond;
    ImageButton submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pad_layer);
        bandaid = (Button) findViewById(R.id.button_bandaid);
        cond = (Button) findViewById(R.id.button_condom);
        submit = (ImageButton) findViewById(R.id.button_submit);
        bandaid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(TempActivity.this, BandaidActivity.class);

                // currentContext.startActivity(activityChangeIntent);

                startActivity(activityChangeIntent);
            }
        });
        cond.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(TempActivity.this, CondActivity.class);

                // currentContext.startActivity(activityChangeIntent);

                startActivity(activityChangeIntent);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Toast.makeText(TempActivity.this, "Please Select an Item First!",
                        Toast.LENGTH_LONG).show();
            }
        });

    }
}
