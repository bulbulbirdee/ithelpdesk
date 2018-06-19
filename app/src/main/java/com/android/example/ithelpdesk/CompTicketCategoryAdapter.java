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

public class CompTicketCategoryAdapter extends ArrayAdapter<CompTicketCategory>
{
    CompTicketCategoryAdapter(Context context, ArrayList<CompTicketCategory> ticketCategories) {
        super(context, 0, ticketCategories);
    }

    @SuppressLint("SetTextI18n")
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        CompTicketCategory ticket = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_ticket_category, parent, false);

        }

        TextView tvTicketCategory = (TextView) convertView.findViewById(R.id.complaint_category);

        assert ticket != null;

        tvTicketCategory.setText(ticket.Category);

        return convertView;
    }

    }
