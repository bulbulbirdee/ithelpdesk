package com.android.example.ithelpdesk;

import java.util.ArrayList;

public class Ticket
{
    public String TicketCategory;
    public String Subcategory;
    public int priority;
    public String status;


    public Ticket (String TicketCategory,String Subcategory, int priority, String status)
    {
        this.TicketCategory = TicketCategory;
        this.Subcategory = Subcategory;
        this.priority = priority;
        this.status = status;
    }


    public String getTicketCategory() {
        return TicketCategory;
    }

    public String getSubcategory() {
        return Subcategory;
    }

    public int getPriority() {
        return priority;
    }

    public String getStatus() {
       return status;
    }

    public static ArrayList<Ticket> getTicket()
    {
        ArrayList<Ticket> tickets = new ArrayList<Ticket>();
        tickets.add(new Ticket ("Password issue", "password expired", 1,"submitted"));
        tickets.add(new Ticket ("System issue", "Desktop not working", 3,"work in progress"));

        return tickets;
    }


}
