package com.android.example.ithelpdesk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TicketCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_category);

        populateTicketCategoryList();

        ListView listView = (ListView)findViewById(R.id.lvTicketCategory);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(TicketCategory.this,Subcategory.class);
                startActivity(intent);


            }
        });
    }

    private void populateTicketCategoryList()
    {
        ArrayList<CompTicketCategory> arrayOfTicket = CompTicketCategory.getTicket();

        CompTicketCategoryAdapter adapter = new CompTicketCategoryAdapter(this, arrayOfTicket);
        ListView listView = (ListView) findViewById(R.id.lvTicketCategory);
        listView.setAdapter(adapter);

    }



}
