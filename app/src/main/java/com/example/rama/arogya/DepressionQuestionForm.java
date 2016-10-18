package com.example.rama.arogya;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.File;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.util.Date;


public class DepressionQuestionForm extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depression_question_form);

        Button createLog = (Button)findViewById(R.id.button_createLog);
        createLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String log = DateFormat.getDateTimeInstance().format(new Date())+"\n";
                EditText cause = (EditText)findViewById(R.id.editText_cause);
                log = log+ cause.getText().toString()+"\n";
                EditText length = (EditText)findViewById(R.id.editText_length);
                log = log+length.getText().toString()+"\n";
                EditText feeling = (EditText)findViewById(R.id.editText_feelingOfWorth);
                log = log+feeling.getText().toString()+"\n";
                EditText decision = (EditText)findViewById(R.id.editText_decision);
                log = log+decision.getText().toString()+"\n";
                EditText more = (EditText)findViewById(R.id.editText_more);
                log = log+more.getText().toString()+"\n";


               File f = new File("Arogya");
                //FileOutputStream stream = openFileOutput()


            }
        });
    }


}
