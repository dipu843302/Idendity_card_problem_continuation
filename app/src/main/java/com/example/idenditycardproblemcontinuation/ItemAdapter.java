package com.example.idenditycardproblemcontinuation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder> {
private ArrayList<ModelClass> arrayList=new ArrayList<>();
private  itemClicked iTemClicked;


    public ItemAdapter(ArrayList<ModelClass> arrayList,itemClicked iTemClicked) {
        this.arrayList=arrayList;
        this.iTemClicked=iTemClicked;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new ItemViewHolder(view,iTemClicked);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
     ModelClass modelClass=arrayList.get(position);
     holder.setData(modelClass);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
