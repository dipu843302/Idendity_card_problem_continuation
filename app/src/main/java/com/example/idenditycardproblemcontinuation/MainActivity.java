package com.example.idenditycardproblemcontinuation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements itemClicked {
private RecyclerView recyclerView;
private ArrayList<ModelClass> arrayList=new ArrayList<>();
private ItemAdapter itemAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        buildList();
        setRecylcerView();
    }

    private void setRecylcerView() {
         itemAdapter=new ItemAdapter(arrayList,this);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        recyclerView.setAdapter(itemAdapter);
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    private void buildList() {
     for (int i=0;i<10;i++){
         arrayList.add(new ModelClass(R.drawable.prateek,"Masai School","Age: 32","Profession: Businessman"));
         arrayList.add(new ModelClass(R.drawable.bezzos,"Amazon","Age: 42","Profession: Businessman"));
         arrayList.add(new ModelClass(R.drawable.mahesh,"Bollywood","Age: 42","Profession: Actor"));
     }
    }

    @Override
    public void onItemclicked(ModelClass modelClass) {
        Toast.makeText(MainActivity.this,""+modelClass.getText1()+" and "+modelClass.getText2(),Toast.LENGTH_SHORT).show();
    }
}