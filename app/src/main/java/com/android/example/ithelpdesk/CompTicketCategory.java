package com.android.example.ithelpdesk;

import java.util.ArrayList;

public class CompTicketCategory {

    public String Category;

    public CompTicketCategory(String Category)
    {
        this.Category = Category;
    }

    public String getCategory() {
        return Category;
    }


    public static ArrayList<CompTicketCategory> getTicket()
    {
        ArrayList<CompTicketCategory> tickets = new ArrayList<CompTicketCategory>();
        tickets.add(new CompTicketCategory("Password expired"));
        tickets.add(new CompTicketCategory("Account locked"));
        tickets.add(new CompTicketCategory("Printer issue"));
        tickets.add(new CompTicketCategory("VPN issue"));
        tickets.add(new CompTicketCategory("Emails issue"));

        return tickets;
    }

}
