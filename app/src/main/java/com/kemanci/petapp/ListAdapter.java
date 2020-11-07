package com.kemanci.petapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<InfoModel> {

    private Context context;
    private ArrayList<InfoModel> infoModelList;
    private Boolean expanded=false;

    public ListAdapter(@NonNull Context context, ArrayList<InfoModel> infoModelList) {
        super(context, R.layout.list_tile,infoModelList);
        this.infoModelList=infoModelList;
        this.context=context;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View customView=layoutInflater.inflate(R.layout.list_tile,parent,false);
        TextView titleText = customView.findViewById(R.id.headerTile);
        final TextView descriptionText= customView.findViewById(R.id.descTile);
        final ImageButton expandButton=customView.findViewById(R.id.expandButton);

        titleText.setText(infoModelList.get(position).getTitle());
        descriptionText.setText(infoModelList.get(position).getInformation());

        customView.setClickable(true);
        customView.setFocusable(true);



        customView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(expanded){
                   descriptionText.setVisibility(View.VISIBLE);
                   expandButton.setBackgroundResource(R.drawable.arrow_down_ripple);
                }
                else{
                    descriptionText.setVisibility(View.GONE);
                    expandButton.setBackgroundResource(R.drawable.arrow_left_ripple);
                }
                expanded =(!expanded);
            }
        });

        return customView;
    }
}
