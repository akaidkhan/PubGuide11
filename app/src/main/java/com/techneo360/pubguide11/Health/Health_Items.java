package com.techneo360.pubguide11.Health;


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
        lstBook.add(new Book("Bandage_Infobox","Health Items","-------------------------------------------------------------------------\n\n" +
                "*Increases a player's boost by 40 instantly. Performing certain actions " +
                "while using this item will cancel it"+"\n"+"\n"+"*Boosted players " +
                "can run faster and fully heal over time\n\n" +
                "-------------------------------------------------------------------------\n\n"+
                "The bandage is a common item that takes 4 seconds to cast, restoring " +
                "health by 10 over 4 seconds. Bandages are the most common medical item " +
                "in Battlegrounds, healing much slower than a First Aid Kit and taking longer " +
                "to use. Unlike the other instant healing consumables however, bandages can be" +
                " used in moving vehicles allowing health recovery on the move, although rough " +
                "terrain will often cancel the usage animation. Since bandages heal a smaller" +
                " amount of health than First Aid Kits, they should be used when minor healing is" +
                " required. However, as with the First Aid Kit, bandages cannot heal past 75 health," +
                " requiring boosters to restore the remaining 25 health."
                ,R.drawable.bandage));


        lstBook.add(new Book("Energy_Drink","Health Items","-------------------------------------------------------------------------\n\n" +
                "*Increases a player's boost by 60 instantly"+"\n"+"\n"+"*Performing certain actions" +
                " while using this item will cancel it. Boosted players can run faster and fully heal over time"
                +
                "\n\n-------------------------------------------------------------------------\n\n"+
                "The Energy Drink is a consumable item in BATTLEGROUNDS. Beverages loaded with" +
                " ingredients purported to have the same effects as caffeine or sugar, their apparent" +
                " effect appears to manifest as health regeneration and potentially increased movement" +
                " speed in BATTLEGROUNDS, essential things that contribute to a possible chicken " +
                "dinner.",R.drawable.energydrink));


        lstBook.add(new Book("Painkiller","Health Items","-------------------------------------------------------------------------\n\n" +
                "*Increases a player's boost by 60 instantly"+
                "\n"+"\n"+"*Performing certain actions while using this item will cancel it." +
                " Boosted players can run faster and fully heal over time"
                +
                "\n\n-------------------------------------------------------------------------\n\n"+
                "Painkillers instantly increase a character's boost by 60, granting health regeneration" +
                " and increased movement speed. Performing certain actions while casting this item — " +
                "such as jumping, or unholstering a weapon — will cancel its use. The effects of a" +
                " single bottle will last approximately 3 minutes with a total of approximately 40" +
                " health restored.Painkillers instantly increase a character's boost by 60, granting" +
                " health regeneration and increased movement speed. Performing certain actions while" +
                " casting this item — such as jumping, or unholstering a weapon — will cancel its use." +
                " The effects of a single bottle will last approximately 3 minutes with a total " +
                "of approximately 40 health restored.",R.drawable.painkiller));


        lstBook.add(new Book("Adrenaline_Syringe","Health Items","-------------------------------------------------------------------------\n\n" +
                "*Increases a player's boost by 100 instantly"+"\n"+"\n"+
                "*Performing certain actions while using this item will cancel it"+"\n"+"\n"+"" +
                "*Boosted players can run faster and fully heal over time"+
                "\n\n-------------------------------------------------------------------------\n\n"+
                "The Adrenaline Syringe is an item that can be found in air drops and as of Update 12," +
                " as very rare loot on the map.[1] Compared to the Energy Drink and Painkillers," +
                " the Adrenaline Syringe is a much more potent booster, taking 6 seconds to administer" +
                " and completely filling the boost bar. Filling the boost bar will grant you" +
                " heath regeneration and faster running speed for a limited time. The boost " +
                "duration will last approximately 5 minutes with total health regeneration" +
                " of approximately 86% and an extra 6.2% movement speed increase.",R.drawable.adrenalinesyringe));



        lstBook.add(new Book("Heal_MedKit","Health Items","-------------------------------------------------------------------------\n\n" +
                "*Heals a player's health to 100 instantly."+"\n"
                +"\n"+"*Performing certain actions while using this item will cancel it "
                +
                "\n\n-------------------------------------------------------------------------\n\n"+
                "The Med Kit is a rare consumable that is found primarily in Air Drops and rarely " +
                "as random loot. A Med Kit can be extremely useful as it completely restores all " +
                "health instantly after an 8 second cast time. The Med Kit is the only consumable " +
                "that can instantly restore all health, as boost items recover health over time." +
                " Med Kits are an effective way to regain lost health but can also be very dangerous" +
                " as the 8 seconds required to use it makes one a sitting duck in a firefight.",R.drawable.medkit));


        lstBook.add(new Book("First Aid Kit","Health Items","-------------------------------------------------------------------------\n\n*Heals a player's health to 75 instantly"+"\n"+"\n"+"*Performing certain actions while using this item will cancel it"+"\n"+"\n"+"*This item cannot be used when a player's health is over 75"
                +
                "\n\n-------------------------------------------------------------------------\n\n"+"The First Aid Kit is a less common, but more potent healing item than bandages. It is the mid tier instant healing item behind the Med Kit. The First Aid Kit is best used for times where immediate healing is needed, otherwise bandages should be used first. First aid kits restore significantly more health than bandages, but will still take 6 seconds to cast, therefore this item should be used with caution while under fire. Boosters used before gunfights and coupled with bandages during battles can help reduce the reliance on first aid kits to restore health.",R.drawable.firstaidkit));

        lstBook.add(new Book("Helmet_Repair_Kit","Health Items","-------------------------------------------------------------------------\n\n"
                +
                "\n\n-------------------------------------------------------------------------\n\n"+"The Helmet Repair Kit is a consumable item for players equipment in BATTLEGROUNDS.",R.drawable.helmetkit));

        lstBook.add(new Book("Hermostatic_Device","Health Items","-------------------------------------------------------------------------\n\n"
                +
                "\n\n-------------------------------------------------------------------------\n\n"+"The Hermostatic Device (Critical Response Kit) is a consumable item in BATTLEGROUNDS.\n" +
                "\n" +
                "Item is currently only available for Custom Matches.",R.drawable.hermonesticdevicve));

        lstBook.add(new Book("Vehicle_Repair_Kit","Health Items","-------------------------------------------------------------------------\n\n"
                +
                "\n\n-------------------------------------------------------------------------\n\n"+"The Vehicle Repair Kit (Mechanic’s Toolbox) is a consumable item for vehicles in BATTLEGROUNDS.\n" +
                "\n" +
                "Item is currently only available for Custom Matches",R.drawable.vehiclerepair));

        lstBook.add(new Book("Vest_Repair_Kit","Health Items","-------------------------------------------------------------------------\n\n"
                +
                "\n\n-------------------------------------------------------------------------\n\n"+"The Vest Repair Kit is a consumable item for players equipment in BATTLEGROUNDS.",R.drawable.vestrepair));

        lstBook.add(new Book("Gas Can","Health Items","-------------------------------------------------------------------------\n\n"
                +
                "\n\n-------------------------------------------------------------------------\n\n"+"The Gas Can is a consumable item for vehicles in BATTLEGROUNDS.Contains a random amount of gas which can be used to refuel a vehicle. Because a random amount of fuel is added to the vehicle, it is best to refuel the vehicle when less than half full. Gas cans can only be used while inside a stationary vehicle by right clicking the item in your inventory.",R.drawable.jerrycan));










        RecyclerView myrv = (RecyclerView) v.findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(getContext(),lstBook);
        myrv.setLayoutManager(new GridLayoutManager(getContext(),3));
        myrv.setAdapter(myAdapter);





        return v;
    }

}
