package com.android.example.ithelpdesk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Review extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        final Button butt = findViewById(R.id.revSubmit);
        butt.setOnClickListener(new View.OnClickListener()

        {
            public void onClick (View view){
                Toast.makeText(getApplicationContext(), "The ticket has been submitted", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
