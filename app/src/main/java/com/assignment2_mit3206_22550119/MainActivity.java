package com.assignment2_mit3206_22550119;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.os.Bundle;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity<actionEvent> extends AppCompatActivity {

    TextView dateView;
    Calendar calendar;
    View actionEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView dateView=findViewById(R.id.dateView);
        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
        String currentDateandTime = sdf.format(new Date());
        dateView.setText(currentDateandTime);
        actionEvent = findViewById(R.id.dateView);
        actionEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
                TextView dateView=findViewById(R.id.dateView);
                Calendar calendar=Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
                String currentDateandTime = sdf.format(new Date());
                dateView.setText(currentDateandTime);
            }
        });
    }

}