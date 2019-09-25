package com.techneo360.pubguide11.Weapons;


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
public class Weapons extends Fragment {
    List<Book> lstBook ;


    public Weapons() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_weapons, container, false);





        lstBook = new ArrayList<>();
        lstBook.add(new Book("The 12Guage","Categorie AMMO",
                "Damage:"+"\n"+"=>The per shot damage without any multipliers applied."+"\n"+
                "Magazine Capacity:"+"\n"+"=>The amount of Ammo you can fit into your gun at one time."+"\n"+
                "Fire Rate:"+"\n"+"=>The effective rate of fire, in other words, the time between each bullet shot."+"\n"+
                "Range:\t"+"\n"+"=>The effective range before the damage is reduced to 0. (Measured using Zeroing)"+"\n"+
                "Bullet Speed:\t"+"\n"+"=>The speed in which the bullet travels from the barrel of the gun to aimed location. " +
                        "(The Higher the Number the less you will need to lead your shoots.)"+"\n"+
                "The AKM has always been a fearsome weapon at every stage " +
                        "of a match, boasting the joint-highest damage per" +
                        " hit of all the assault rifles. Discounting damage" +
                        " drop-off, 2 headshots or 5 body shots will kill someone " +
                        "clad in Level 3 armour. However, it’s a tricky AR to master," +
                        " due to its heavy recoil and bullet drop. Best advice is to " +
                        "spend time in PUBG’s training mode getting used to the AKM before" +
                        " laying claim to it each match.",R.drawable.akm));











        lstBook.add(new Book("The 45-acp","Categorie AMMO","" + ""+"\n"+"",R.drawable.augnew));
        lstBook.add(new Book("The 9mm","Categorie AMMO","Description AMMO",R.drawable.groza));
        lstBook.add(new Book("The 7.62","Categorie AMMO","Description AMMO",R.drawable.m416));
        lstBook.add(new Book("The 12Guage","Categorie AMMO","Description AMMO",R.drawable.m16a4));
        lstBook.add(new Book("The 45-acp","Categorie AMMO","Description AMMO",R.drawable.mk47));
        lstBook.add(new Book("The 9mm","Categorie AMMO","Description AMMO",R.drawable.qbz));
        lstBook.add(new Book("The 7.62","Categorie AMMO","Description AMMO",R.drawable.skrl));
        lstBook.add(new Book("The 12Guage","Categorie AMMO","Description AMMO",R.drawable.awm));
        lstBook.add(new Book("The 45-acp","Categorie AMMO","Description AMMO",R.drawable.slr));
        lstBook.add(new Book("The 9mm","Categorie AMMO","Description AMMO",R.drawable.kar98));
        lstBook.add(new Book("The 7.62","Categorie AMMO","Description AMMO",R.drawable.mini14));
        lstBook.add(new Book("The 12Guage","Categorie AMMO","Description AMMO",R.drawable.mk14));
        lstBook.add(new Book("The 45-acp","Categorie AMMO","Description AMMO",R.drawable.qbu));
        lstBook.add(new Book("The 9mm","Categorie AMMO","Description AMMO",R.drawable.sks));
        lstBook.add(new Book("The 7.62","Categorie AMMO","Description AMMO",R.drawable.vss));
        lstBook.add(new Book("The 12Guage","Categorie AMMO","Description AMMO",R.drawable.win94));
        lstBook.add(new Book("The 45-acp","Categorie AMMO","Description AMMO",R.drawable.s686));
        lstBook.add(new Book("The 9mm","Categorie AMMO","Description AMMO",R.drawable.s1897));
        lstBook.add(new Book("The 7.62","Categorie AMMO","Description AMMO",R.drawable.s12k));
        lstBook.add(new Book("The 12Guage","Categorie AMMO","Description AMMO",R.drawable.sawnoff));
        lstBook.add(new Book("The 45-acp","Categorie AMMO","Description AMMO",R.drawable.crossbow));
        lstBook.add(new Book("The 9mm","Categorie AMMO","Description AMMO",R.drawable.dp));
        lstBook.add(new Book("The 7.62","Categorie AMMO","Description AMMO",R.drawable.m249));
        lstBook.add(new Book("The 12Guage","Categorie AMMO","Description AMMO",R.drawable.p18c));
        lstBook.add(new Book("The 45-acp","Categorie AMMO","Description AMMO",R.drawable.p1911));
        lstBook.add(new Book("The 9mm","Categorie AMMO","Description AMMO",R.drawable.p92));
        lstBook.add(new Book("The 7.62","Categorie AMMO","Description AMMO",R.drawable.r45));
        lstBook.add(new Book("The 12Guage","Categorie AMMO","Description AMMO",R.drawable.skorpion));
        lstBook.add(new Book("The 45-acp","Categorie AMMO","Description AMMO",R.drawable.mp5k));
        lstBook.add(new Book("The 9mm","Categorie AMMO","Description AMMO",R.drawable.thompson));
        lstBook.add(new Book("The 7.62","Categorie AMMO","Description AMMO",R.drawable.uzi));
        lstBook.add(new Book("The 12Guage","Categorie AMMO","Description AMMO",R.drawable.ump));
        lstBook.add(new Book("The 45-acp","Categorie AMMO","Description AMMO",R.drawable.vector));


        RecyclerView myrv = (RecyclerView) v.findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(getContext(),lstBook);
        myrv.setLayoutManager(new GridLayoutManager(getContext(),3));
        myrv.setAdapter(myAdapter);





        return v;
    }

}
