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

public class BandaidActivity extends AppCompatActivity {
    Button temp;
    Button cond;
    ImageButton submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_band_aid_layer);
        temp = (Button) findViewById( R.id.button_pad);
        cond = (Button) findViewById(R.id.button_condom);
        submit = (ImageButton) findViewById(R.id.button_submit);
        temp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(BandaidActivity.this, TempActivity.class);

                // currentContext.startActivity(activityChangeIntent);

                startActivity(activityChangeIntent);
            }
        });
        cond.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(BandaidActivity.this, CondActivity.class);

                // currentContext.startActivity(activityChangeIntent);

                startActivity(activityChangeIntent);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Toast.makeText(BandaidActivity.this, "Please Select an Item First!",
                        Toast.LENGTH_LONG).show();
            }
        });

    }
}

