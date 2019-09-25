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
        lstBook.add(new Book("The 12Guage","Categorie AMMO","Description AMMO",R.drawable.painkiller));
        lstBook.add(new Book("The 45-acp","Categorie AMMO","Description AMMO",R.drawable.energy));
        lstBook.add(new Book("The 9mm","Categorie AMMO","Description AMMO",R.drawable.syringe));
        lstBook.add(new Book("The 7.62","Categorie AMMO","Description AMMO",R.drawable.medkit));
        lstBook.add(new Book("The 5.56","Categorie AMMO","Description AMMO",R.drawable.firstaid));

        RecyclerView myrv = (RecyclerView) v.findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(getContext(),lstBook);
        myrv.setLayoutManager(new GridLayoutManager(getContext(),3));
        myrv.setAdapter(myAdapter);





        return v;
    }

}
