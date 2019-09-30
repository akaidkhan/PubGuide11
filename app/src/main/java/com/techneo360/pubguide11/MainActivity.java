package com.techneo360.pubguide11;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.navigation.NavigationView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.techneo360.pubguide11.Ammo.Ammo_Types;
import com.techneo360.pubguide11.Attachments.Attachments;
import com.techneo360.pubguide11.Health.Health_Items;
import com.techneo360.pubguide11.Maps.Maps;
import com.techneo360.pubguide11.Throwables.Throwables;
import com.techneo360.pubguide11.Weapons.Weapons;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {




    private boolean doubleBackToExitPressedOnce = true;
    private AdView mAdView;
    private InterstitialAd interstitial;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);













        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       interstitial = new InterstitialAd(MainActivity.this);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();





        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,
                    new Weapons()).commit();
            navigationView.setCheckedItem(R.id.nav_Weapons);
        }






    }











    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            if (doubleBackToExitPressedOnce) {
                this.doubleBackToExitPressedOnce = false;
                Toast.makeText(this,"Please click BACK again to exit.", Toast.LENGTH_SHORT).show();
            } else {
                finish();
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement setting
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.



        //Calling the ShowFragment() method here to show the our created menu as default menus.
        ShowFragment(item.getItemId());
        int bal = item.getItemId();

        return true;

    }


    // Fragment



    private void ShowFragment(int itemId) {

        Fragment fragment = null;

        switch (itemId) {
            case R.id.nav_Weapons:
                fragment = new Weapons();
                break;

            case R.id.nav_Ammo_types:
                fragment = new Ammo_Types();

                interstitial = new InterstitialAd(getApplicationContext());
                interstitial.setAdUnitId(getString(R.string.admob_interstetial_ad));
                AdRequest adRequest = new AdRequest.Builder().build();
                interstitial.loadAd(adRequest);
                interstitial.setAdListener(new AdListener() {
                    public void onAdLoaded() {
                        if (interstitial.isLoaded()) {
                            interstitial.show();
                        }
                    }
                });



                break;



            case R.id.nav_Attachments:
                fragment = new Attachments();
                break;

            case R.id.Throwables:
                fragment = new Throwables();
                break;

            case R.id.Health_Items:
                fragment = new Health_Items();
                break;


            case R.id.Maps:
                fragment = new Maps();
                break;

            case R.id.nav_share:
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Text");
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject");
                startActivity(Intent.createChooser(sharingIntent, "Share using"));
                break;

            case R.id.nav_send:
                fragment = new send();
                break;











        }


        if (fragment != null) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame_layout, fragment);
            fragmentTransaction.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }






}
