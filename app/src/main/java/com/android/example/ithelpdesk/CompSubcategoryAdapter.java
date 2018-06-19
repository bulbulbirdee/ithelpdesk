package com.android.example.ithelpdesk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CompSubcategoryAdapter extends ArrayAdapter<CompSubcategory> {

    CompSubcategoryAdapter(Context context, ArrayList<CompSubcategory> subcategories)
    {
        super(context, 0, subcategories);

    }

    @SuppressLint("SetTextI18n")
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent)
    {
        CompSubcategory sub = getItem(position);
        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_subcategory, parent, false);
        }
        TextView tvTicketSubcategory = (TextView)convertView.findViewById(R.id.complaint_subcategory);
        assert sub != null;

        tvTicketSubcategory.setText(sub.Subcategory);
        return convertView;

    }
}



