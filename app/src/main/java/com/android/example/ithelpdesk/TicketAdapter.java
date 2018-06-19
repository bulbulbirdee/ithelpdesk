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

public class TicketAdapter extends ArrayAdapter<Ticket> {

    TicketAdapter(Context context, ArrayList<Ticket> tickets) {
        super(context, 0, tickets);
    }

    @SuppressLint("SetTextI18n")
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        Ticket ticket = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.tickets, parent, false);
        }

        TextView tvCategory = (TextView) convertView.findViewById(R.id.TicketCategory);
        TextView tvSubcategory = (TextView) convertView.findViewById(R.id.Subcategory);
        TextView tvPriority = (TextView) convertView.findViewById(R.id.priority);


        assert ticket != null;
        tvCategory.setText(ticket.TicketCategory);
        tvSubcategory.setText(ticket.Subcategory);
        tvPriority.setText(Integer.toString(ticket.priority));


        return convertView;

    }


}



