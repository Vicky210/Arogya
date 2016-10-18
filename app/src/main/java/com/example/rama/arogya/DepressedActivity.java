package com.example.rama.arogya;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class DepressedActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depressed);

        ImageView img_depression = (ImageView)findViewById(R.id.imageView_disappoint);
        img_depression.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DepressedActivity.this, "We are sorry to know that you are Sad", Toast.LENGTH_LONG).show();
                Intent i = new Intent(DepressedActivity.this,DepressionQuestionForm.class);
                startActivity(i);
            }
        });
    }


}
