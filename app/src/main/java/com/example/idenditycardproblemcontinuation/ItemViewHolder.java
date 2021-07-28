package com.example.idenditycardproblemcontinuation;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private itemClicked iTemClicked;
    private RelativeLayout relativeLayout;
    public ItemViewHolder(@NonNull  View itemView,itemClicked iTemClicked) {
        super(itemView);
        this.iTemClicked=iTemClicked;
        intiView();

    }

    private void intiView() {
        textView1=itemView.findViewById(R.id.tv1);
        textView2=itemView.findViewById(R.id.tv2);
        textView3=itemView.findViewById(R.id.tv3);
        imageView=itemView.findViewById(R.id.image);
        relativeLayout=itemView.findViewById(R.id.relativelayout);
    }

    public void setData(ModelClass modelClass) {
        imageView.setImageResource(modelClass.getImage());
        textView1.setText(modelClass.getText1());
        textView2.setText(modelClass.getText2());
        textView3.setText(modelClass.getText3());
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            iTemClicked.onItemclicked(modelClass);
            }
        });
    }
}
