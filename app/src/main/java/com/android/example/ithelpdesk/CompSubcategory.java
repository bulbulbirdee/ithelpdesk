package com.android.example.ithelpdesk;

import java.util.ArrayList;

public class CompSubcategory {

    public String Subcategory;

    public CompSubcategory(String Subcategory)
    {
        this.Subcategory = Subcategory;
    }

    public String getSubcategory()
    {
        return Subcategory;
    }

    public static ArrayList<CompSubcategory> getSub()
    {
        ArrayList<CompSubcategory> subcategories = new ArrayList<CompSubcategory>();
        subcategories.add(new CompSubcategory("Desktop not working"));
        subcategories.add(new CompSubcategory("Laptop is not working") );
        subcategories.add(new CompSubcategory("Laptop charger is not working") );
        subcategories.add(new CompSubcategory("Power chord is not working") );
        subcategories.add(new CompSubcategory("Display is not working") );


        return subcategories;
    }

}
