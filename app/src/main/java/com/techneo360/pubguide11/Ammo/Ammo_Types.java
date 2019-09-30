package com.techneo360.pubguide11.Ammo;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
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
public class Ammo_Types extends Fragment {

    List<Book> lstBook ;


    public Ammo_Types() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_ammo__types, container, false);





        lstBook = new ArrayList<>();
        lstBook.add(new Book("Flare","AMMO",
                "-------------------------------------------------------------------------\n\n"+"Weight:-"+"\t"+"0.5\n\n"+
                        "Weapon:-Flare Gun & Light ammo\n\n" +
                        "-------------------------------------------------------------------------\n\n"+
                        "*Can only be used by flare guns in special games\n\n" +
                        "*If torches are fired directly into the air, they request care packages to be dropped at this point\n\n" +
                        "*Wear as many as you can find"
                ,R.drawable.flaregun));

        lstBook.add(new Book("Blot","AMMO",
                "-------------------------------------------------------------------------\n\n"+"Weight:-"+"\t"+"2\n\n"+
                "Weapon:-Crossbow"+"\n\n" +
                        "-------------------------------------------------------------------------\n\n"+
                        "*The heaviest ammunition in PUBG\n\n" +
                        "*Can only be used by the crossbow\n\n" +
                        "*Limited to near range as the bolt is too heavy to travel very far\n\n" +
                        "*Wear only about 20 screws each"
                ,R.drawable.bolt));

        lstBook.add(new Book(".300 Magnum","AMMO",
                "-------------------------------------------------------------------------\n\n"+"Weight:-"+"\t"+"0.5\n\n"+
                        "Weapon:-AWM & Heavy balls used by the AWM\n\n" +
                        "-------------------------------------------------------------------------\n\n"+
                        "*Only breed in care packages\n\n" +
                        "*Wear as many balls as you can find"
                ,R.drawable.magnum));


        lstBook.add(new Book("12 Guage","Categorie : AMMO",
                "-------------------------------------------------------------------------\n\n"+"Weight:-"+"\t"+"1.25\n\n"+
                        "Weapon:- S1897, S12K, S686, Sawed-off & Heavy shells\n" +
                        "-------------------------------------------------------------------------\n\n"+
                        "*Used by all shotguns\n\n" +
                        "*Restricted close range, as the pellets spread in each shell during firing\n\n" +
                        "*Take only 15 shells, max"
                ,R.drawable.guage));

        lstBook.add(new Book(".45 ACP","AMMO",
                "-------------------------------------------------------------------------\n\n"+"Weight:-"+"\t"+"0.4\n\n"+
                        "Weapon:- P1911, R45, Tommy Gun, Vector, Win94 & Light balls\n" +
                        "-------------------------------------------------------------------------\n\n"+
                        "*Used by a variety of weapons - from pistols to submachine guns to sniper rifles\n\n" +
                        "*Deadly at close range because they are smaller bullets that move quickly\n\n" +
                        "*Wear about 100 bullets for a SMG, 50 for the sniper, 20 for the pistols"
                ,R.drawable.acp));

        lstBook.add(new Book("9mm","AMMO",
                "-------------------------------------------------------------------------\n\n"+"Weight:-"+"\t"+"0.38\n\n"+
                "Weapon:- Micro Uzi, P92, UMP9, VSS, P18C, Skorpion & \tThe lightest ammunition in PUBG\n" +
                        "-------------------------------------------------------------------------\n\n"+
                        "*Used by half of pistols, half of submachine guns and VSS\n\n" +
                        "*Limited to medium range because the balls are too light and small to fly far\n\n" +
                        "*Wear about 20 bullets for the pistols, 100 for the SMGs and 150 for the VSS"
                ,R.drawable.mm));

        lstBook.add(new Book("7.62mm","AMMO",
                "-------------------------------------------------------------------------\n\n"+"Weight:- "+"\t"+"0.7\n\n"+
                        "Weapon:- AKM, Beryl M762, DP-28, Groza, Kar98k, M24, Mk14, Mk47, R1895, SKS, SLR & Something heavy balls\n\n" +
                        "-------------------------------------------------------------------------\n\n"+
                        "*Used by a variety of weapons - from pistols, assault rifles, rifle guns to sniper rifles\n\n" +
                        "*Can be used with the assault rifles at medium to medium range or with the designated sniper and sniper rifles at medium to long distance\n\n" +
                        "*Wear 100 bullets for ARs and DMRs, 50 for SRs and 15 for pistols.\n\n"
                ,R.drawable.seven));

        lstBook.add(new Book("5.56mm","AMMO",
                "-------------------------------------------------------------------------\n\n"+"Weight:-"+"\t"+"0.5\n\n"+
                "Weapon:- AUG A3, M16A4, M249, M416, Mini-14, QBZ, QBU, SCAR-L & Light balls\n\n" +
                        "-------------------------------------------------------------------------\n\n"+
                        "*Used by half of assault rifles and rifle rifles\n\n" +
                        "*Good for close combat\n\n" +
                        "*Carry about 100 bullets per weapon\n\n"
                ,R.drawable.five));

        RecyclerView myrv = (RecyclerView) v.findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(getContext(),lstBook);
        myrv.setLayoutManager(new GridLayoutManager(getContext(),3));
        myrv.setAdapter(myAdapter);






        return v;
    }

}
