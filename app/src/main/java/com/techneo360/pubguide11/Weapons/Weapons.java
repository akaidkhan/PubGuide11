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
        lstBook.add(new Book("Akm","Assult",
                "Type of Ammo: 7.62\n" +
                        "Size of Magazine: 30 (40 with Extended Mag)\n" +
                        "Body Shot Damage Rate: 47/32.9/28.2/21.15/21.15\n" +
                        "Head Shot Damage Rate: 100/77/66/49.7\n" +
                        "Reload Time: 0.1s/3.22s\n\nThe AKM has always been a formidable weapon in every phase of a fight and has the highest damage per hit of all assault rifles. Dredging Damage, 2 Headshots, or 5 Body Shots will kill someone dressed in Tier 3 armor. Due to the strong recoil and the shot, it is a difficult task to master the weapon. The best advice is to spend time in PUBG training mode to get used to the AKM before claiming it at every game.",R.drawable.akm));




        lstBook.add(new Book("Aug","Weapon","Ammo Type: 5.56\n" +
                "Magazine Size: 30 (40 with Extended Mag)\n" +
                "Body Shot Damage: 41/28.7/24.6/18.45/18.45\n" +
                "Headshot Damage: 96.4/67/58/43.4\n" +
                "Fire Rate/Reload Time: 0.086s/3.67s\n\nThis is an exclusive air rifle that represents a real beauty. The Aug packs a punch and is very easy to handle compared to a weapon like the AKM. The only downside is that reloading takes a lot of time compared to some of his contemporaries. All in all, a powerful and forgiving rifle that feels great - especially when equipped with a silencer." ,R.drawable.augnew));






        lstBook.add(new Book("Groza","Weapon","Ammo Type: 7.62\n" +
                "Magazine Size: 30 (40 with Extended Mag)\n" +
                "Body Shot Damage: 47/32.9/28.2/21.15/21.15\n" +
                "Headshot Damage: 100/77/66/49.7\n" +
                "Fire Rate/Reload Time: 0.08s/3s\n\nIf you've just heard a terrible roar in the distance and are not sure what it was, it probably was a Groza. This airdrop-exclusive shredder beats with the power of an AKM, but its firing rate is overwhelming, surpassing even half of the SMGs listed above. It takes some getting used to and is best not used as a long-range weapon. However, if you are fortunate enough to find a groza, I can not imagine not taking them.",R.drawable.groza));





        lstBook.add(new Book("M416","Weapon","Ammo Type: 5.56\n" +
                "Magazine Size: 30 (40 with Extended Mag)\n" +
                "Body Shot Damage: 41/28.7/24.6/18.45/18.45\n" +
                "Headshot Damage: 96.4/67/58/43.4\n" +
                "Fire Rate/Reload Time: 0.086s/2.73s\n\nThe M416 is probably the epitome of an assault rifle and has a decent overall statistics, which can be increased with a whole set of implements to maximum performance, although this is of course not expected in every game. Compared to the AKM, the M416 does less damage, but fires faster and handles better. But forget that. The real reason to love the M416 is that it has the lowest reloading time of any assault rifle in PUBG. We all know that reloading during a firefight is like pressing Kill Me Now on your keyboard, whether you're in hiding or not. So I think it best to limit that as much as possible.",R.drawable.m416));




        lstBook.add(new Book("M16A4 ","Categorie AMMO","Ammo Type: 5.56\n" +
                "Magazine Size: 30 (40 with Extended Mag)\n" +
                "Body Shot Damage: 43/30.1/25.8/19.35/19.35\n" +
                "Headshot Damage: 100/71/61/45.5\n" +
                "Fire Rate/Reload Time: 0.1s/2.86s\n\n" +
                "In terms of statistics, the M16A4 is almost identical to the M416, with the main difference being that the M16A4 is a burst or single-shot weapon. But here's the thing: never use the burst mode. In spam-click single-shot mode, you can achieve the same firing rate as in burst mode without having to wait for the cooldown after every third shot. It's basically an M416 with fewer attachment slots, and you'll need to get an RSI to use it properly. I'm not a fan, but the M16A4 is a powerful near and medium range rifle that needs to be denied in good hands. The # 27 update also helped the M16A4 by providing less recoil, longer reach, and the ability to attach both canted visors and a tactical shaft to the weapon to further enhance its already impressive abilities.",R.drawable.m16a4));



        lstBook.add(new Book("MK47 Mutant","Categorie AMMO","Ammo Type: 7.62\n\n" +
                "Magazine Size: 20 (30 with Extended Mag)\n\n" +
                "Body Shot Damage: 49/34.3/29.4/22.05/22.05\n\n" +
                "Headshot Damage: 100/81/69/51.8\n\n" +
                "Fire Rate/Reload Time: 0.1s/3.37s\n\n\n" +
                "The Mutant is an interesting addition to PUBG’s AR roster, matching the AKM in damage output but firing only in two-shot bursts. This immediately turns many players off the Mutant, but the two-shot burst makes it much easier to control than the M16A4, and ideal for tapping enemies at mid- to long-range. Attach a vertical foregrip and compensator to this thing and it’ll shine like you never would have expected. This is a burst AR for people who, like me, don’t like burst ARs. What’s more, as with the M16A4, Update #27 added the ability to attach a Tactical Stock to the Mutant, increasing its recoil recovery speed along with all the other speedy benefits such a Stock brings.",R.drawable.mk47));


        lstBook.add(new Book("QBZ95","Categorie AMMO","Ammo Type: 5.56\n" +
                "Magazine Size: 30 (40 with Extended Mag)\n" +
                "Body Shot Damage: 41/28.7/24.6/18.45/18.45\n" +
                "Headshot Damage: 96.4/67/58/43.4\n" +
                "Fire Rate/Reload Time: 0.092s/3.66s\n\n" +
                "The QBZ95 is exclusive to Sanhok and replaces the SCAR-L. I will not spend much time talking about this weapon because it is almost identical to the SCAR-L. The only major difference is that the QBZ95 has a slightly higher rate of firing and a significantly longer reload time.",R.drawable.qbz));


       lstBook.add(new Book("SCAR-L","Categorie AMMO","Ammo Type: 5.56\n" +
               "Magazine Size: 30 (40 with Extended Mag)\n" +
               "Body Shot Damage: 41/28.7/24.6/18.45/18.45\n" +
               "Headshot Damage: 96.4/67/58/43.4\n" +
               "Fire Rate/Reload Time: 0.096s/2.86s\n" +
               "The poor man's M416 is still a pretty decent assault rifle. The SCAR-L is often considered slightly worse than the M416 in all respects (minus the identical base damage), but apart from that, it's a solid, controllable weapon that can easily become a player. Once with accessories like a 4x riflescope, Upgraded a compensator, a front handle and possibly an extended quick release magazine. Do not worry, SCAR-L; we still love you.",R.drawable.skrl));




        lstBook.add(new Book("AWM","Categorie AMMO","Ammo Type: 0.300\n" +
                "Magazine Size: 5 (7 with Extended Mag)\n" +
                "Body Shot Damage: 100/100/94.5/70.88/49.88\n" +
                "Headshot Damage: 100/100/100/100\n" +
                "Fire Rate/Reload Time: 1.85s/4.6s\n" +
                "The AWM is the only rifle that can be killed by a level 3 helmet in one shot. All other stats have been compiled to compensate for AWM's huge damage. High recharging time, low rate of fire, unique ammunition that can only be found in drops of air ... ",R.drawable.awm));



        lstBook.add(new Book("SLR","Categorie AMMO","Ammo Type: 7.62\n" +
                "Magazine Size: 10 (20 with Extended Mag)\n" +
                "Body Shot Damage: 60.9/42.63/36.54/27.41/27.55\n" +
                "Headshot Damage: 100/95.41/81.78/61.34\n" +
                "Fire Rate/Reload Time: 0.1s/3.68s\n" +
                "The SLR is the SKS’s belligerent uncle. Higher recoil and a longer reload time again, but the highest damage of any non-air drop DMR. If you can control it and use it well under pressure, the DLR can end a lot of fights before they begin.",R.drawable.slr));


        lstBook.add(new Book("Kar98K","Categorie AMMO","Ammo Type: 7.62\n" +
                "Magazine Size: 5\n" +
                "Body Shot Damage: 100/82.95/71.1/53.33/37.53\n" +
                "Headshot Damage: 100/100/100/88.88\n" +
                "Fire Rate/Reload Time: 1.9s/4s\n" +
                "The Kar98k, though surpassed in all respects by the AWM, should still have a lot of respect and fear. Low rate of fire, high reload time, and small and non-updateable magazine size are compensated for head shots by extreme damage and the fact that everyone has so much experience with the Kar98k.",R.drawable.kar98));



        lstBook.add(new Book("MINI14","Categorie AMMO","Ammo Type: 5.56\n" +
                "Magazine Size: 20 (30 with Extended Mag)\n" +
                "Body Shot Damage: 48.3/33.81/28.98/21.74/21.74\n" +
                "Headshot Damage: 100/75.67/64.86/48.65\n" +
                "Fire Rate/Reload Time: 0.1s/3.6s\nMinimal bullet, good clip size and relatively easy to master. The small damage of the Mini-14 (hovering between the VSS and the SKS) means that people generally prefer other DMRs if they have the choice, but it is still a solid and reliable choice at every stage of a game.",R.drawable.mini14));


        lstBook.add(new Book("MK14 EB","Categorie AMMO","Ammo Type: 7.62\n" +
                "Magazine Size: 10 (20 with Extended Mag)\n" +
                "Body Shot Damage: 64.05/44.84/38.43/28.82/28.98\n" +
                "Headshot Damage: 100/100/86/64.51\n" +
                "Fire Rate/Reload Time: 0.09s/3.68s\n" +
                "This pure air-drop DMR is actually very similar to the SLR - so much so that I sometimes wonder why one is limited to air drops and the other is not. You could say, the MK14 is the equally warlike aunt of the SKS. Massive damage to a DMR, high recoil, high reload time, and the unique ability to move forward fully automatically when needed and deliver a cluster truck full of damage up close with the eloquence of a rhinoceros on stilts.",R.drawable.mk14));



        lstBook.add(new Book("QBU","Categorie AMMO","Ammo Type: 5.56\n" +
                "Magazine Size: 10 (20 with Extended Mag)\n" +
                "Body Shot Damage: 50.4/35.28/30.24/22.68/22.8\n" +
                "Headshot Damage: 100/78.96/67.68/50.76\n" +
                "Fire Rate/Reload Time: 0.1s/3s\n" +
                "The QBU replaces the Mini-14 on Sanhok and can not be found on any other map. A smaller clip size than the Mini-14, but a touch more damage and a slightly lower reload time. The main advantage of the QBU, however, is the bipod mode, which practically eliminates recoil when you are prone.",R.drawable.qbu));


        lstBook.add(new Book("SKS","Categorie AMMO","Ammo Type: 7.62\n" +
                "Magazine Size: 10 (20 with Extended Mag)\n" +
                "Body Shot Damage: 55.65/38.96/33.39/25.04/25.18\n" +
                "Headshot Damage: 100/87.19/74.73/56.05\n" +
                "Fire Rate/Reload Time: 0.1s/2.9s\n" +
                "The SKS is the brüske, unfussy older sibling of the Mini-14. Lower clip size and higher recoil, but a significant increase in damage and less recharge time. The SKS used to be my point of contact for DMR",R.drawable.sks));


        lstBook.add(new Book("VSS","Categorie AMMO","Ammo Type: 9mm\n" +
                "Magazine Size: 10 (20 with Extended Mag)\n" +
                "Body Shot Damage: 43.05/30.14/25.83/19.37/19.48\n" +
                "Headshot Damage: 96.35/67.45/57.81/43.36\n" +
                "Fire Rate/Reload Time: 0.086s/2.9s\nMy friends and I have called the VSS a \"paintball gun\" for its staggeringly low damage statistics for a DMR and its very low bullet speed (exactly one-third of the Mini-14's bullet speed). The plus points include an excellent built-in suppressor and a decent rifle scope as well as the ability to proceed fully automatic for some fairly decent DPS with medium to long range. But you should probably give up the VSS anyway, as soon as you find just about any other DMR or sniper rifle.",R.drawable.vss));



        lstBook.add(new Book("Win94","Categorie AMMO","Ammo Type: 0.45\n" +
                "Magazine Size: 8\n" +
                "Body Shot Damage: 99/69.3/59.4/44.55/31.35\n" +
                "Headshot Damage: 100/100/99/74.25\n" +
                "Fire Rate/Reload Time: 0.6s/4s\nI'm almost sure that Winchester is a disguised crossbow that deserves a bit more respect. Lack of mounting options, the least damage of all sniper rifles and the same reload time as a Kar98k. The Winchester is useful only in the early to middle game phases and should be abandoned as soon as you find another sniper rifle or DMR.",R.drawable.win94));


        lstBook.add(new Book("S686","Categorie AMMO","Ammo Type: 12 Gauge\n" +
                "Magazine Size: 2\n" +
                "Pellets: 9\n" +
                "Pellets required for lethal (Bodyshots, no DMG Dropoff): 5/7/7/9\n" +
                "Body Shot Damage (Per Pellet): 23.4/16.4/15.6/11.7/11.7\n" +
                "Headshot Damage (Per Pellet): 31.2/21.8/18.7/14\n" +
                "Fire Rate/Reload Time: 0.2s/2.4s\nThe two-barrel S686 takes all the features of the shotgun as a weapon class and exaggerates it. Although it can only fire two shells before it has to be reloaded, you can fire both within a tiny amount of time. If you land your grenades up close, your enemy is a paste. But miss your shots with this shaky, inaccurate weapon, or get caught in the middle or long distance, and your S686 might as well be a Snickers bar.",R.drawable.s686));


        lstBook.add(new Book("S1897","Categorie AMMO","Ammo Type: 12 Gauge\n" +
                "Magazine Size: 5\n" +
                "Pellets: 9\n" +
                "Pellets required for lethal (Bodyshots, no DMG Dropoff): 5/7/7/9\n" +
                "Body Shot Damage (Per Pellet): 23.4/16.4/15.6/11.7/11.7\n" +
                "Headshot Damage (Per Pellet): 31.2/21.8/18.7/14\n" +
                "Fire Rate/Reload Time: 0.6s/5.8s\nThe eagle eyes below may have noticed that the damage statistics of the S1897 pumping campaign are identical to those of the S686. So what are you taking? Well, the S1897 gives you 5 shots before reloading, which makes it much more forgiving than the Blast-and-Pret-S686; But the drawback is a horrible reload time of six seconds, a much lower rate of fire, and the worst range of all weapons in PUBG (adding bullet loops will reduce this recharge time to just over 4 seconds, which is not much better, but could save you if your enemy lacks a deadly instinct). For these reasons, the S1897 ended up at the bottom of my personal list of shotguns, with the understanding that the others are not that much better.",R.drawable.s1897));


        lstBook.add(new Book("S12K","Categorie AMMO","Ammo Type: 12 Gauge\n" +
                "Magazine Size: 2\n" +
                "Pellets: 8\n" +
                "Pellets required for lethal (Bodyshots, no DMG Dropoff): 6/8/10/13\n" +
                "Body Shot Damage (Per Pellet): 18/12.6/10.8/8.1/8.1\n" +
                "Headshot Damage (Per Pellet): 24/16.8/14.4/10.8\n" +
                "Fire Rate/Reload Time: 0.25s/4s\nIn my humble opinion, the Sawned is the only shotgun you should take with you to the end of the game without being ashamed. The reason for this is not that it is particularly effective in the final, but rather that it occupies a pistol slot rather than a primary weapon slot. Treat the sawed S686 like a miniature S686 that does less damage but has a surprisingly good range",R.drawable.sawnoff));


        lstBook.add(new Book("SAWNOFF","Categorie AMMO","Description AMMO",R.drawable.s12k));



        lstBook.add(new Book("CROSSBOW","Categorie AMMO","Ammo Type: Bolt\n" +
                "Magazine Size: 1\n" +
                "Body Shot Damage: 100/100/88.2/66.15/63\n" +
                "Headshot Damage: 100/100/100/100\n" +
                "Fire Rate/Reload Time: 3.8s/3.55s\nThe death by a crossbow is certainly responsible for a lot of outbursts of rage, but that alone does not save a ridiculously impractical weapon that is only used if nothing else is available. A huge \"ball drop\" and a disgusting time between shots are not adequately mitigated by adequate damage and natural stealth.h.",R.drawable.crossbow));



        lstBook.add(new Book("DP","Categorie AMMO","Ammo Type: 7.62\n" +
                "Magazine Size: 47\n" +
                "Body Shot Damage: 53.55/37.49/32.13/24.1/33.15\n" +
                "Headshot Damage: 100/82.11/70.38/52.8\n" +
                "Fire Rate/Reload Time: 0.109s/5.5s\nIf the AKM were a LMG, it would be the DP-28 (are not the abbreviations the best?). Firing slowly, but hits like a truck. Hard to control, but reloading takes forever. Oh wait, those were two negatives. Yes, I'm not a big fan of the DP-28. But you can still shred it at close range with it. Note, however, that the DP-28 does not accept attachments except for a few areas. So you see what you get with the pizza gun.",R.drawable.dp));



        lstBook.add(new Book("M249","Categorie AMMO","Ammo Type: 5.56\n" +
                "Magazine Size: 100\n" +
                "Body Shot Damage: 45/31.5/27/20.25/20.25\n" +
                "Headshot Damage: 100/72.45/62.1/46.6\n" +
                "Fire Rate/Reload Time: 0.075s/8.2s\n",R.drawable.m249));



        lstBook.add(new Book("P18c","Categorie AMMO","Ammo Type: 9mm\n" +
                "Magazine Size: 17 (25 with Extended Mag)\n" +
                "Body Shot Damage: 23/16.1/13.8/10.35/11.5\n" +
                "Headshot Damage: 46/32.2/27.6/20.7\n" +
                "Fire Rate/Reload Time: 0.06s/2s\nPistols are virtually useless once you've gotten through the early game, but the P18C is indeed pretty well disguised as SMG. He has a fully automatic mode, which compensates for the low damage and actually offers the highest EP of all pistol.",R.drawable.p18c));



        lstBook.add(new Book("P1911","Categorie AMMO","Ammo Type: 0.45\n" +
                "Magazine Size: 7 (12 with Extended Mag)\n" +
                "Body Shot Damage: 41/28.7/24.6/18.45/20.5\n" +
                "Headshot Damage: 82/57.4/49.2/36.9\n" +
                "Fire Rate/Reload Time: 0.11s/2.1s\nThe P1911 offers a powerful punch for a pistol, but with only seven shots you have to make sure they all count, especially if you face an armored attacker. However, this is more than able to guide you through a few early game encounters, and occasionally even leads you through intense close combat in the late game, where you both somehow miss all your shots with your primary weapons.",R.drawable.p1911));



        lstBook.add(new Book("P92","Categorie AMMO","Ammo Type: 9mm\n" +
                "Magazine Size: 15 (20 with Extended Mag)\n" +
                "Body Shot Damage: 35/24.5/21/15.75/17.5\n" +
                "Headshot Damage: 70/49/42/31.5\n" +
                "Fire Rate/Reload Time: 0.135s/2s\nThe P92 is a very uninteresting, but still decent pistol. A good backup, if you run out of bullets for anything else, for which pistols are actually good.",R.drawable.p92));



        lstBook.add(new Book("R45","Categorie AMMO","Ammo Type: 0.45\n" +
                "Magazine Size: 7\n" +
                "Body Shot Damage: 55/38.5/33/24.75/27.5\n" +
                "Headshot Damage: 100/77/66/49.5\n" +
                "Fire Rate/Reload Time: 0.25s/3.2s\n",R.drawable.r45));


        lstBook.add(new Book("Skorpion","Categorie AMMO","Ammo Type: 9mm\n" +
                "Magazine Size: 20 (40 with Extended Mag)\n" +
                "Body Shot Damage: 22/15.4/13.2/9.9/11\n" +
                "Headshot Damage: 44/30.8/26.4/19.8\n" +
                "Fire Rate/Reload Time: 0.07s/3.08s\nFinally, a rival of the P18C for the best fully automatic pistol, the scorpion unfortunately has not the edge. The main selling point is a large clip size and a large number of mounting slots to control the recoil, but everything else - damage, rate of fire, reload speed - is a little worse than the P18C, which makes it a somewhat unsatisfactory weapon. Use in my experience ,",R.drawable.skorpion));


        lstBook.add(new Book("MP5k","Categorie AMMO","Ammo Type: 9mm\n" +
                "Magazine Size: 30 (40 with Extended Mag)\n" +
                "Body Shot Damage: 34.65/24.26/20.79/15.59/21.45\n" +
                "Headshot Damage: 59.4/41.58/35.64/26.73\n" +
                "Fire Rate/Reload Time: 0.067s/2.2s\nThe MP5K is the latest addition to PUBG's list of weapons. If the MP5K replaces the Vector on Vikendi and agrees with the changes to the Vector with Update # 27, the MP5K will swap some of the total SPS for a higher damage per shot, an assault rifle sized magazine, a very low recoil, and the ability to enlarge it with up to six attachments at a time. Even without attachments, this SMG has a pretty decent handling, but with a compensator and a shank it's easy to crush enemies at medium or short range. With ease of use and high upgrade potential, this is a very solid performance at every stage of the game. The most popular SMGs in Vikendi will compete with Bizon and UMP.",R.drawable.mp5k));


        lstBook.add(new Book("Thompson","Categorie AMMO","Description AMMO",R.drawable.thompson));


        lstBook.add(new Book("UZI","Categorie AMMO","Ammo Type: 9mm\n" +
                "Magazine Size: 25 (35 with Extended Mag)\n" +
                "Body Shot Damage: 27.3/19.11/16.38/12.29/16.9\n" +
                "Headshot Damage: 46.8/32.76/28.08/21.06\n" +
                "Fire Rate/Reload Time: 0.048s/3.1s\nThe Uzi has the highest firing rate of all weapons in PUBG, but due to its minor damage this is not quite as exciting as it sounds. Regardless, the Uzi is a good option in early and middle game, especially - well, exclusively - in close combat. In addition, it actually contains enough ammunition to kill someone with it",R.drawable.uzi));



        lstBook.add(new Book("UMP","Categorie AMMO","Ammo Type: 0.45\n" +
                "Magazine Size: 25 (35 with Extended Mag)\n" +
                "Body Shot Damage: 40.95/28.67/24.57/18.43/25.35\n" +
                "Headshot Damage: 70.2/49.14/42.12/31.59\n" +
                "Fire Rate/Reload Time: 0.092s/3.1s\nFor too long the UMP was the undisputed king of PUBG-SMGs. Update No. 27, which was renamed UMP45 instead of UMP9 due to the change in ammunition type, improved the total capacity of the UMP magazine from 30/40 to 25/35. A slight change, however, which is noticeable in encounters from a distance. All other selling points are still there: a smooth and highly controllable recoil, a surprising accuracy and effective range, and a large number of possible accessories that can be used to upgrade the weapon. It's still an excellent weapon, but thanks to the rise of the Bizon and now the MP5K, players can re-evaluate their personal SMG rankings.",R.drawable.ump));




        lstBook.add(new Book("Vector","Categorie AMMO","Ammo Type: 9mm\n" +
                "Magazine Size: 19 (33 with Extended Mag)\n" +
                "Body Shot Damage: 32.55/22.79/19.53/14.65/20.15\n" +
                "Headshot Damage: 55.8/39.06/33.48/25.11\n" +
                "Fire Rate/Reload Time: 0.055s/2.2s\nThe Vector has finally got a buff on its magazine size with Update No. 27, which has raised him a bit compared to the measly 13/25 of the past. Now it fires 9mm cartridges instead of 0.45 and has the second lowest base damage of all SMGs, but the highest rate of fire and a very low recoil. This makes it a tricky weapon with a maximum of skills that can release some excellent damage in the right hands in the short to medium term. Just make sure you're not surprised if your magazine is empty about a second after it's started.",R.drawable.vector));





        RecyclerView myrv = (RecyclerView) v.findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(getContext(),lstBook);
        myrv.setLayoutManager(new GridLayoutManager(getContext(),3));
        myrv.setAdapter(myAdapter);





        return v;
    }

}
