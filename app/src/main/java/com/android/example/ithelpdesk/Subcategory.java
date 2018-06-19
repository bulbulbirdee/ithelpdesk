package com.android.example.ithelpdesk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Subcategory extends AppCompatActivity{

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subcategory);

        populateSubcategoryList();

        ListView listView = (ListView)findViewById(R.id.lvSubcategory);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Subcategory.this,SubmitTicket.class);
                startActivity(intent);


            }
        });
    }

    private void populateSubcategoryList()
    {
        ArrayList<CompSubcategory> arrayOfTicket = CompSubcategory.getSub();

        CompSubcategoryAdapter adapter = new CompSubcategoryAdapter(this, arrayOfTicket);
        ListView listView = (ListView) findViewById(R.id.lvSubcategory);
        listView.setAdapter(adapter);

    }
}
