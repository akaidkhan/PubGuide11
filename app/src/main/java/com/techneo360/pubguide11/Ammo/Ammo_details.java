package com.techneo360.pubguide11.Ammo;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.techneo360.pubguide11.R;

public class Ammo_details extends AppCompatActivity {


    private TextView tvtitle,tvdescription,tvcategory;
    private ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ammo_details);

        tvtitle = (TextView) findViewById(R.id.txttitle);
        tvdescription = (TextView) findViewById(R.id.txtDesc);
        tvcategory = (TextView) findViewById(R.id.txtCat);
        img = (ImageView) findViewById(R.id.bookthumbnail);

        // Recieve data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail") ;

        // Setting values

        tvtitle.setText(Title);
        tvdescription.setText(Description);
        img.setImageResource(image);
    }
}
