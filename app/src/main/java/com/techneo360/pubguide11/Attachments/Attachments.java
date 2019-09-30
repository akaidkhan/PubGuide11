package com.techneo360.pubguide11.Attachments;


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
        lstBook.add(new Book("Red Dot Sight","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "UMP45, AKM, M16A4, M416, SCAR-L, S12K, M249, Kar98k, M24, AWM, SKS, Crossbow, Vector, Groza, P18C, P1911, P92, Mk14 EBR\u200E, Mini 14, DP-28, AUG A3, R45, SLR, QBZ95, QBU, Beryl M762, Mk47, Skorpion, G36C, MP5K, Deagle\u200E, Micro UZI"+"\n\n-------------------------------------------------------------------------\n\n"+"An open holographic sight that projects a red dot in the center of a glass or acrylic pane. It also speeds up the time it takes to aim down the sights by 20%. Compared to the holographic sight, the red dot sight has a less bulkier frame, although the reticle is somewhat blurrier. Nevertheless, the red dot sight is a good addition to any gun that can accept it as it has no major downsides over iron sights. Featuring adjustable reticle brightness and shape when not attached to a pistol, the red dot sight can be altered to suit the user's needs on the fly.",R.drawable.reddot));




        lstBook.add(new Book("Holographic Sight","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "AKM, AUG A3, AWM, Beryl M762, Crossbow, DP-28, G36C, Groza, Kar98k, M16A4, M249, M24, M416, MP5K, Mini 14, Mk14 EBR, Mk47 Mutant, P18C, P1911, P92, PP-19 Bizon, QBU, QBZ95, R45, S12K, SCAR-L, SKS, SLR, Skorpion, UMP9, Vector, MP5K, Deagle\u200E, Micro UZI"+"\n\n-------------------------------------------------------------------------\n\n"+"A reflex sight with a sharp reticle, although the bulky frame can reduce some situational awareness compared to the red dot sight. Recommended for closer range fights. The reticle's brightness can be adjusted by rolling the mouse wheel, and its color changed between either green or red with the zeroing keys. At 100 meters, a standing person will fit within the outer circle of the reticle, allowing for quick rangefinding.",R.drawable.holograp));
        lstBook.add(new Book("2x Aimpoint Scope Aimpoint Scope","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "UMP9, AKM, M16A4, M416, SCAR-L, SKS, S12K, M249, Kar98k, M24, AWM, KRISS Vector, OTs-14 Groza, Mk14 EBR\u200E, Mini 14, DP-28, AUG A3, SLR, QBZ95, QBU, Beryl M762, Mk47, G36C, MP5K"+"\n\n-------------------------------------------------------------------------\n\n"+"While this scope appears mediocre in regard to its zoom power and reticle, the reticle allows the user an improvised method of rangefinding - a standing person 100 meters away will fit perfectly between the top and bottom of the outer circle, and a standing person 200 meters away will fit between the center dot and the outer circle. At 300 meters, the width of a standing person will be obscured by the center dot. Keeping this in mind, aim can then be adjusted for whichever range the target is at to deal precision shots and as most engagements typically take place within 300 meters, the usefulness of this scope is often underestimated. The brightness of the reticle can also be adjusted to current lighting conditions.\n" +
                "\n" + "Because the 2x scope's magnification sets the field of view to 40°,[1] players using a default field of view value higher than 80° will technically get slightly more than 2x magnification power due to the greater difference in FOV values.",R.drawable.twox));
        lstBook.add(new Book("3x Backlit Scope","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "UMP9, AKM, M16A4, M416, SCAR-L, SKS, S12K, M249, Kar98k, M24, AWM, KRISS Vector, OTs-14 Groza, Mk14 EBR\u200E, Mini 14, DP-28, AUG A3, SLR, QBZ95, QBU, Beryl M762, Mk47, G36C, MP5K"+"\n\n-------------------------------------------------------------------------\n\n"+"The 3x scope represents a compromise between the 2x and 4x scopes. The reticle can be used as a rangefinder for targets between 100 meters out to 400 meters by using the shoulder width of a target and matching it up with the horizontal lines. The reticle brightness can also be adjusted to current lighting conditions.\n" +
                "\n" +
                "Because the 3x scope's magnification sets the field of view to 26.66°,[1] players using a default field of view value higher than 80° will technically get slightly more than 3x magnification power due to the greater difference in FOV values.",R.drawable.threex));
        lstBook.add(new Book("4x ACOG Scope","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "UMP9, AKM, M16A4, M416, SCAR-L, SKS, S12K, M249, Kar98k, M24, AWM, KRISS Vector, Groza, SKS, Mk14 EBR\u200E, Mini 14, DP-28, AUG A3, SLR, Crossbow, QBZ95, QBU, Beryl M762, Mk47, G36C, MP5K"+"\n\n-------------------------------------------------------------------------\n\n"+"The ACOG scope allows for the user to engage targets at medium to long ranges. With a built in rangefinder, and its 4x zoom, the ACOG scope is one of the most useful attachments a player can come across, as such it is highly recommended to take it, even if you do not have a weapon that can accept it.\n" +
                "\n" +
                "As of the miramar_map update, the 4x, along with Red Dot Sight and Holographic Sight, no longer have adjustable zeroing distance, setting the gun to a fixed 100 meter zero.\n" +
                "\n" +
                "It should be noted that while the name of this attachment would imply 4x magnification, because it magnifies the field of view down to 19° instead of 20°, this means that with the minimum field of view setting of 80°, the magnification power of this optic is actually closer to 4.21x",R.drawable.fourx));
        lstBook.add(new Book("6x Scope","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "Crossbow, UMP45, AKM, M16A4, M416, SCAR-L, SKS, S12K, M249, Kar98k, M24, AWM, KRISS Vector, OTs-14 Groza, Mk14 EBR\u200E, Mini 14, DP-28, AUG A3, SLR, QBZ95, QBU, Beryl M762, Mk47, G36C, MP5K"+"\n\n-------------------------------------------------------------------------\n\n"+"The 6x scope is a rare world spawn, being the highest powered scope for guns that don't fall into the category of DMR or sniper rifle. The reticle also features a stadiametric rangefinder suitable for standing targets between 300 to 800 meters. This scope is very versatile due to its simple rangefinder and ability to zoom out to 3x magnification, as well as its compatibility with assault rifles and submachine guns, greatly extending the range at which opponents can be attacked at.\n" +
                "\n" +
                "Because the 6x scope's magnification sets the field of view to 13.33°,[1] players using a default field of view value higher than 80° will technically get slightly more than 6x magnification power due to the greater difference in FOV values.",R.drawable.sixx));
        lstBook.add(new Book("8x CQBSS Scope","Scope","-------------------------------------------------------------------------\n\n"+"Details\n" +
                "Attachable Weapons\n" +
                "SKS, M249, Kar98k, M24, AWM, Mk14 EBR\u200E, Mini 14, SLR, QBU"+"\n\n-------------------------------------------------------------------------\n\n"+"This variable power scope is a must-have for anyone wishing to engage targets at long ranges. It is ideal for weapons with high muzzle velocities as compensation of gravity and bullet speed is not required as much compared to weapons with slower bullet velocities. Scope sway may be an issue at further ranges, therefore it is recommended to hold one's breath before firing.\n" +
                "\n" +
                "Due to its rarity and usefulness, this attachment should be taken whenever possible, although when not fixed to a weapon it does take up a fair amount of inventory space - as much as a gas can. During the later stages of a match, the 8x scope proves less useful due to the closer ranges that engagements typically occur at in both situations.\n" +
                "\n" +
                "Because the 8x scope's magnification sets the field of view to 10°,[1] players using a default field of view value higher than 80° will technically get slightly more than 8x magnification power due to the greater difference in FOV values.",R.drawable.eightx));





        lstBook.add(new Book("Choke (SG)","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "Sawed-off, S1897, S686"+"\n\n-------------------------------------------------------------------------\n\n"+"Appearing as relatively common loot found on the map, this attachment reduces pellet spread by 25%, creating a tighter shot cone for a greater effective range.",R.drawable.muzzle_choke));
        lstBook.add(new Book("Compensator (AR, DMR, S12K)","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "M24, AWM, SKS, Kar98k, Mk14 EBR, Mini 14, SLR, QBU"+"\n\n-------------------------------------------------------------------------\n\n"+"",R.drawable.snipercompensator));
        lstBook.add(new Book("Compensator (DMR, SR)","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "Micro UZI, PP-19 Bizon, UMP9, Vector"+"\n\n-------------------------------------------------------------------------\n\n"+"The Compensator for SMG is a muzzle type attachment in BATTLEGROUNDS. Compensators are attachments with baffles that redirect muzzle gas in an effort to combat recoil or drift. It does this by redirecting the gases in the opposing direction of weapon drift and recoil so that the gas counteracts the action of the weapon.",R.drawable.smgcompensator));
        lstBook.add(new Book("Duckbill (SG)","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "S1897, S12K"+"\n\n-------------------------------------------------------------------------\n\n"+"The duckbill choke decreases overall spread by 20%, while altering the shot pattern so that pellets will be spread out over a greater vertical distance and a narrower horizontal distance, increasing the chance of more pellets hitting standing targets.",R.drawable.duckbill));
        lstBook.add(new Book("Flash Hider (AR, DMR, S12K)","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "AKM, M16A4, M416, SCAR-L S12K, SLR, SKS, Mini 14, Mk14 EBR, QBZ95, QBU, Beryl M762, G36C"+"\n\n-------------------------------------------------------------------------\n\n"+"The flash hider does not completely eliminate muzzle flash, but does significantly reduce it with the added benefit of slight vertical and horizontal recoil reduction. This attachment is useful for visual concealment, making it harder for victims to locate the shooter via muzzle flash at long distances, particularly in rainy or foggy conditions.",R.drawable.flashhider_large));
        lstBook.add(new Book("Flash Hider (DMR, SR)","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "M24, AWM, SKS, Kar98k, Mk14 EBR, Mini 14, SLR, QBU"+"\n\n-------------------------------------------------------------------------\n\n"+"The flash hider does not completely eliminate muzzle flash, but does significantly reduce it with the added benefit of slight vertical and horizontal recoil reduction. This attachment is useful for visual concealment, making it harder for victims to locate the shooter via muzzle flash at long distances, particularly in rainy or foggy conditions. The flash hider can prove to be of great benefit to sniper rifles given their long effective range, providing some modicum of concealment when a suppressor isn't available.",R.drawable.flashhider_sniperrifle));
        lstBook.add(new Book("Flash Hider (SMG)","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "Micro UZI, PP-19 Bizon, UMP9, Vecto"+"\n\n-------------------------------------------------------------------------\n\n"+"The flash hider does not completely eliminate muzzle flash, but does significantly reduce it with the added benefit of slight vertical and horizontal recoil reduction. This attachment is useful for visual concealment, making it harder for victims to locate the shooter via muzzle flash at long distances, particularly in rainy or foggy conditions.",R.drawable.flashhider_smg));
        lstBook.add(new Book("Suppressor (AR, DMR, S12K)","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "AKM, M16A4, M416, SCAR-L, S12K, Groza, AUG A3, SLR, SKS, Mini 14, Mk14 EBR, QBZ95, QBU, Beryl M762, Mk47, G36C"+"\n\n-------------------------------------------------------------------------\n\n"+"A very rare and highly sought after attachment, besides completely eliminating muzzle flash, the suppressor more importantly reduces the distance at which gunshots can be heard and alters the muzzle report making it significantly more difficult to locate the shooter. It also has an unmentioned effect of a slight reduction in weapon deviation. The suppressor increases the length of the weapon, meaning that obstacles further away than usual will prevent the player from entering iron sights and can present an issue in confined spaces.",R.drawable.suppressor));
        lstBook.add(new Book("Suppressor (DMR, SR)","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "M24, AWM, SKS, Kar98k, Mk14 EBR\u200E, Mini 14, SLR, QBU"+"\n\n-------------------------------------------------------------------------\n\n"+"An extremely rare and highly prized attachment, besides completely eliminating muzzle flash, the suppressor more importantly reduces the distance at which gunshots can be heard and alters the muzzle report making it significantly more difficult to locate the shooter. These attributes mesh very well with the long range precision of DMRs and sniper rifles, allowing a shooter to potentially take out victims without them even being aware of the location of the shooter. It also has an unmentioned effect of a slight reduction in weapon deviation. The suppressor increases the length of the weapon, meaning that obstacles further away than usual will prevent the player from entering iron sights and can present an issue in confined spaces.",R.drawable.suppressor_sniperrifle));
        lstBook.add(new Book("Suppressor (Handgun, SMG)","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "MP5K, Micro UZI, P18C, P1911, P92, PP-19 Bizon, R1895, Skorpion, Tommy Gun, UMP45, Vector"+"\n\n-------------------------------------------------------------------------\n\n"+"A rare and sought after attachment for users of submachine guns and pistols, besides completely eliminating muzzle flash, the suppressor more importantly reduces the distance at which gunshots can be heard and alters the muzzle report making it significantly more difficult to locate the shooter. It also has an unmentioned effect of a slight reduction in weapon deviation. The suppressor increases the length of the weapon, meaning that obstacles further away than usual will prevent the player from entering iron sights and can present an issue in confined spaces.",R.drawable.suppressor_smg));





        lstBook.add(new Book("Angled Foregrip (AR, SMG, DMR)\t","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "M416, SCAR-L, UMP9, SKS, AUG A3, Beryl M762\u200E\u200E, Mk47, G36C, MP5K"+"\n\n-------------------------------------------------------------------------\n\n"+"The angled foregrip reduces horizontal recoil at the cost of increased sway as well as slightly increasing the recoil animation of the weapon itself. It is therefore best suited for weapons with a high rate of fire or heavy horizontal recoil, and in close to mid-ranged combat.",R.drawable.angleforgrip));
        lstBook.add(new Book("Half Grip","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "M416, SCAR-L, UMP9, Vector, SKS, AUG A3, KRISS Vector, QBZ95, Mk47, Skorpion, MP5K"+"\n\n-------------------------------------------------------------------------\n\n"+"The half grip reduces vertical and horizontal recoil by a small amount and improves recoil recovery time, with a penalty to weapon stability and sway. It is therefore ideal for weapons with a high rate of fire in close-range combat.",R.drawable.half_grip));
        lstBook.add(new Book("Light Grip","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "M416, SCAR-L, UMP9, SKS, AUG A3, KRISS Vector, QBZ95, Beryl M762, Mk47, Skorpion, G36C, MP5K"+"\n\n-------------------------------------------------------------------------\n\n"+"The lightweight grip is the only grip to not affect the vertical or horizontal recoil multipliers directly, instead decreasing the recoil animation and sway of a weapon. It is thus suited to weapons that have a strong recoil animation but low camera recoil, such as the G36C, or single shot weapons like the SKS.",R.drawable.lightgrip));
        lstBook.add(new Book("Thumb Grip","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "M416, SCAR-L, UMP9, SKS, AUG A3, QBZ95, Mk47, MP5K"+"\n"+"The Thumb Grip decreases the recoil pattern and weapon sway by 20%, vertical recoil by 5% as well as decreasing the time it takes to aim down the sights by 30%. This grip is therefore ideal in conjunction with the more powerful scopes, as the reduced sway allows for easier shot placement and the increased ADS speed negates the reduction that comes with the stronger optics. The thumb grip's significant ADS speed improvement also stacks with the increased ADS speed of all optics weaker than the 4x ACOG.",R.drawable.thumb_grip));
        lstBook.add(new Book("Vertical Foregrip","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "M416, SCAR-L, UMP9, KRISS Vector, SKS, Tommy Gun, AUG A3, QBZ95, Mk47, Skorpion, G36C, MP5K"+"\n\n-------------------------------------------------------------------------\n\n"+"The vertical foregrip reduces vertical recoil by 15% and recoil pattern by 20%. It is therefore best suited for weapons with high vertical recoil or for long-distance shooting where precision is more of a concern over volume of fire.",R.drawable.lower_foregrip));
        lstBook.add(new Book("Laser Sight","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "P18C, P1911, P92, R45, UMP9, Vector, AUG A3, Beryl M762, M416, Mk47 Mutant, QBZ, SCAR-L, SKS, Skorpion, G36C, MP5K, Deagle\u200E"+"\n\n-------------------------------------------------------------------------\n\n"+"The laser sight is a lower rail attachment that reduces the bullet deviation that occurs during hip-fire and target-aiming, thus making it a go-to attachment for run and gun moments. The laser itself can only be seen from a short range and is only visible to the user. Because it occupies the lower rail slot, foregrips cannot be attached to weapons using the laser sight at the same time.",R.drawable.laserpointer));


        lstBook.add(new Book("Extended QuickDraw Mag (AR, DMR, S12K)","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "AKM, M16A4, M416, SCAR-L, S12K, Groza, AUG A3, SLR, SKS, Mini 14, Mk14 EBR, QBZ95, QBU, Beryl M762, Mk47, G36C"+"\n\n-------------------------------------------------------------------------\n\n"+"This attachment expands the magazine capacity of the weapon it is attached to, as well as decreasing the time required to reload it, allowing an overall greater amount of firepower.",R.drawable.extendedquickdraw_large));
        lstBook.add(new Book("Extended QuickDraw Mag (DMR, SR)","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "M24, AWM, SKS, VSS, Mk14 EBR\u200E, Mini 14, SLR, QBU"+"\n\n-------------------------------------------------------------------------\n\n"+"This attachment expands the magazine capacity of the weapon it is attached to, as well as decreasing the time required to reload it, allowing an overall greater amount of firepower.",R.drawable.extendedquickdraw_sniperrifle));
        lstBook.add(new Book("Extended QuickDraw Mag (Handgun, SMG)","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "MP5K, Micro UZI, P18C, P1911, P92, Tommy Gun, UMP45, Vector, MP5K"+"\n\n-------------------------------------------------------------------------\n\n"+"This attachment expands the magazine capacity of the weapon it is attached to, as well as decreasing the time required to reload it, allowing an overall greater amount of firepower.",R.drawable.extendedquickdraw_medium));
        lstBook.add(new Book("Extended Mag (DMR, SR)","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "M24, AWM, SKS, VSS, Mk14 EBR\u200E, Mini 14\u200E, SLR, QBU"+"\n\n-------------------------------------------------------------------------\n\n"+"This attachment expands the magazine capacity of the weapon it is attached to, allowing more shots to be fired before needing to reload.",R.drawable.extended_sniperrifle));
        lstBook.add(new Book("Extended Mag (Handgun, SMG)","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "MP5K, Micro UZI, P18C, P1911, P92, Skorpion, Tommy Gun, UMP45, Vector, MP5K, Deagle\u200E"+"\n\n-------------------------------------------------------------------------\n\n"+"This attachment expands the magazine capacity of the weapon it is attached to, allowing more shots to be fired before needing to reload.",R.drawable.extenedsmg));
        lstBook.add(new Book("Extended Mag (AR, DMR, S12K)","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "AKM, M16A4, M416, SCAR-L, S12K, Groza, AUG A3, SLR, SKS, Mini 14, Mk14 EBR, QBZ95, QBU, Beryl M762, Mk47, G36C"+"\n\n-------------------------------------------------------------------------\n\n"+"This attachment expands the magazine capacity of the weapon it is attached to, allowing 10 more shots to be fired before needing to reload.",R.drawable.extenedmag));




        lstBook.add(new Book("Bullet Loops (SG, Win94, Kar98k)","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "S1897, S686, Kar98k, Win94"+"\n\n-------------------------------------------------------------------------\n\n"+"Increases reload speed by 30%.",R.drawable.sniperrifle_bulletloops));
        lstBook.add(new Book("Cheek Pad (DMR, SR)","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "M24, AWM, Kar98k, SKS, VSS, Mk14 EBR, SLR"+"\n\n-------------------------------------------------------------------------\n\n"+"Cheek pads now help you recover from weapon sway more quickly after moving.",R.drawable.sniperrifle_cheekpad));
        lstBook.add(new Book("Stock for Micro UZI","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "Micro UZI, Skorpion"+"\n\n-------------------------------------------------------------------------\n\n"+"Stocks attach to the back end of a weapon, increasing both stability and accuracy.",R.drawable.stock_uzi));
        lstBook.add(new Book("Tactical Stock","Scope","-------------------------------------------------------------------------\n\n"+"Attachable Weapons\n" +
                "M416, Vector, MP5K"+"\n\n-------------------------------------------------------------------------\n\n"+"The tactical stock, can only be attached to the M416, Vector, MP5K, Mk47 and M16A4. The multitude of effects it provides makes it a great attachment for the guns capable of using it.",R.drawable.stock));










        RecyclerView myrv = (RecyclerView) v.findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(getContext(),lstBook);
        myrv.setLayoutManager(new GridLayoutManager(getContext(),3));
        myrv.setAdapter(myAdapter);





        return v;
    }

}
