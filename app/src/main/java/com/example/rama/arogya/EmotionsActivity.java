package com.example.rama.arogya;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class EmotionsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emotions);

        ImageView img_depression = (ImageView)findViewById(R.id.imageView_Sad);
        img_depression.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(EmotionsActivity.this,"We are sorry to know that you are Sad",Toast.LENGTH_LONG).show();
                Intent i = new Intent(EmotionsActivity.this,DepressedActivity.class);
                startActivity(i);
            }
        });

        ImageView img_love = (ImageView)findViewById(R.id.imageView_love);
        img_love.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EmotionsActivity.this,"Glad to know that you are happy",Toast.LENGTH_LONG).show();
                Intent i1 = new Intent(EmotionsActivity.this,LoveActivity.class);
                startActivity(i1);
            }
        });



    }


}
