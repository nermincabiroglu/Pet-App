package com.kemanci.petapp;

import android.Manifest;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.security.Permission;

public class MainActivity extends AppCompatActivity {

    public static InformationArrays informationArrays;
    public static int whichPet=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] permissions=new String[]{Manifest.permission.ACCESS_FINE_LOCATION};
        requestPermissions(permissions,0);
        informationArrays=new InformationArrays();
    }

    public void goDog(View view){
        whichPet=0;
        Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(intent);
    }
    public void goCat(View view){
        whichPet=1;
        Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(intent);
    }
    public void goBird(View view){
        whichPet=2;
        Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(intent);
    }
    public void goMap(View view){
        Intent intent=new Intent(getApplicationContext(),MapsActivity.class);
        startActivity(intent);
    }
}