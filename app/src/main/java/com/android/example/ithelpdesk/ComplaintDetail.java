package com.android.example.ithelpdesk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ComplaintDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint_detail);


        final Button butt = findViewById(R.id.review);
        butt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(ComplaintDetail.this, Review.class);
                startActivity(intent);
            }
        });

        final Button button = findViewById(R.id.close);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(ComplaintDetail.this, "This ticket is closed!!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}

