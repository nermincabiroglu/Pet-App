package com.kemanci.petapp;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.*;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    public LocationListener locationListener;
    public LocationManager locationManager;
    public Geocoder geoCoder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        geoCoder=new Geocoder(getApplicationContext());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

         locationManager= (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
         mMap.setMyLocationEnabled(true);


         locationListener=new LocationListener() {
            @Override
            public void onLocationChanged(@NonNull Location location) {


                LatLng loc = new LatLng(location.getLatitude(), location.getLongitude());
                //mMap.addMarker(new MarkerOptions().position(loc).title("Konumunuz"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(loc,15));
                //System.out.println(location.toString());
               // geoCoder=new Geocoder(getApplicationContext());



            }
        };

       if(ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION )!= PackageManager.PERMISSION_GRANTED){
           ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION},1);
       }else {
           locationManager.requestLocationUpdates(locationManager.GPS_PROVIDER,0,0,locationListener);
       }






    }
}