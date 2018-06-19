package com.android.example.ithelpdesk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.ArrayList;

public class StatusImage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setImage();


    }

  /*  public String getStatus() {
        return status;
    }
*/
    public static ArrayList<Ticket> getTicket() {
        ArrayList<Ticket> tickets = new ArrayList<Ticket>();
        tickets.add(new Ticket("Password issue", "password expired", 1, "submitted"));
        tickets.add(new Ticket("email issue", "account expired", 3, "work in progress"));

        return tickets;
    }


        public void setImage()
        {

        String Status = null;

        // Ticket status = new Ticket();
        //Status = status.getStatus();

        Intent i = new Intent(getApplicationContext(), Ticket.class);
        i.putExtra("status", "work in progress");
        startActivity(i);

        //step 3: add to activity you want to pull variables from
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Status = extras.getString("status");
        }


        if (Status.equals("work in progress")) {
            ImageView imageView = (ImageView) findViewById(R.id.status);
            imageView.setImageResource(R.drawable.red);
        }

        if (Status.equals("Submitted")) {
            ImageView imageView = (ImageView) findViewById(R.id.status);
            imageView.setImageResource(R.drawable.yellow);
        }
    }



}
