package com.assignment2_mit3206_22550119;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView dateView;
    Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dateView = findViewById(R.id.dateView);
        updateDateTime();

        dateView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDateTime();
            }
        });
    }

    private void updateDateTime() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
        String currentDateandTime = sdf.format(new Date());
        dateView.setText(currentDateandTime);
    }
}