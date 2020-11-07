package com.kemanci.petapp;

import android.view.View;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import static com.kemanci.petapp.MainActivity.*;
public class MainActivity2 extends AppCompatActivity {

    protected ListView infoListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        infoListView=findViewById(R.id.ListView);
        ListAdapter listAdapter=null;
        if(whichPet==0){
            listAdapter=new ListAdapter(this, informationArrays.getDogInformationArray());
        }
        else if(whichPet==1){
            listAdapter=new ListAdapter(this, informationArrays.getCatInformationArray());
        }
        else{
            listAdapter=new ListAdapter(this, informationArrays.getBirdInformationArray());
        }

        infoListView.setAdapter(listAdapter);


    }


    public void back(View view){
        finish();
    }
}