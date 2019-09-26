package com.techneo360.pubguide11.Health;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.techneo360.pubguide11.Book;
import com.techneo360.pubguide11.R;
import com.techneo360.pubguide11.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Health_Items extends Fragment {

    List<Book> lstBook ;


    public Health_Items() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_health__items, container, false);





        lstBook = new ArrayList<>();
        lstBook.add(new Book("Energy Drink","Categorie AMMO","-------------------------------------------------------------------------\n\n*Increases a player's boost by 40 instantly. Performing certain actions while using this item will cancel it"+"\n"+"\n"+"*Boosted players can run faster and fully heal over time",R.drawable.energy));
        lstBook.add(new Book("Painkiller","Categorie AMMO","-------------------------------------------------------------------------\n\n*Increases a player's boost by 60 instantly"+"\n"+"\n"+"*Performing certain actions while using this item will cancel it. Boosted players can run faster and fully heal over time",R.drawable.painkiller));
        lstBook.add(new Book("Adrenaline Syringe","Categorie AMMO","-------------------------------------------------------------------------\n\n*Increases a player's boost by 100 instantly"+"\n"+"\n"+"*Performing certain actions while using this item will cancel it"+"\n"+"\n"+"*Boosted players can run faster and fully heal over time",R.drawable.syringe));
        lstBook.add(new Book("Med Kit","Categorie AMMO","-------------------------------------------------------------------------\n\n*Heals a player's health to 100 instantly."+"\n"+"\n"+"*Performing certain actions while using this item will cancel it",R.drawable.medkit));
        lstBook.add(new Book("First Aid Kit","Categorie AMMO","-------------------------------------------------------------------------\n\n*Heals a player's health to 75 instantly"+"\n"+"\n"+"*Performing certain actions while using this item will cancel it"+"\n"+"\n"+"*This item cannot be used when a player's health is over 75",R.drawable.firstaid));

        RecyclerView myrv = (RecyclerView) v.findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(getContext(),lstBook);
        myrv.setLayoutManager(new GridLayoutManager(getContext(),3));
        myrv.setAdapter(myAdapter);





        return v;
    }

}
