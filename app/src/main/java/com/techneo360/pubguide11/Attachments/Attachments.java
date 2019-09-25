package com.techneo360.pubguide11.Attachments;


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
public class Attachments extends Fragment {
    List<Book> lstBook ;


    public Attachments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_attachments, container, false);





        lstBook = new ArrayList<>();
        lstBook.add(new Book("2x Aimpoint Scope","Scope","+10.00% Faster ADS"+"\n"+"\n"+"1.80X Magnification",R.drawable.twox));
        lstBook.add(new Book("3X","Scope",""+"\n"+"\n"+"",R.drawable.threex));
        lstBook.add(new Book("4x ACOG Scope","Scope","4.00X Magnification"+"\n"+"\n"+"",R.drawable.fourx));
        lstBook.add(new Book("The 7.62","Scope",""+"\n"+"\n"+"",R.drawable.sixx));
        lstBook.add(new Book("8x CQBSS Scope","Scope","7.25X Magnification"+"\n"+"\n"+"",R.drawable.eightx));

        RecyclerView myrv = (RecyclerView) v.findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(getContext(),lstBook);
        myrv.setLayoutManager(new GridLayoutManager(getContext(),3));
        myrv.setAdapter(myAdapter);





        return v;
    }

}
