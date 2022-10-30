package com.example.runnersstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.runnersstore.adapter.BestSellerRecyclerAdapter;
import com.example.runnersstore.adapter.NewReleaseRecyclerAdapter;
import com.example.runnersstore.model.BestSeller;
import com.example.runnersstore.model.NewRelease;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView bestSellerRecyclerView;
    NewReleaseRecyclerAdapter newReleaseRecyclerAdapter;
    BestSellerRecyclerAdapter bestSellerRecyclerAdapter;
    List<NewRelease> newReleaseList;
    List<BestSeller> bestSellerList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Objects.requireNonNull(getSupportActionBar()).setElevation(0);
        //Objects.requireNonNull(getSupportActionBar()).setHomeButtonEnabled(true);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_nike);

        recyclerView = findViewById(R.id.recyclerView);
        bestSellerRecyclerView = findViewById(R.id.best_seller_recycler);

        newReleaseList = new ArrayList<>();
        bestSellerList = new ArrayList<>();

        NewRelease product1 = new NewRelease("AIR MAX 200",
                "https://androidappsprojects.s3.eu-north-1.amazonaws.com/nikeapp/shoe1.png",
                "Mens Shoes", "1082.95 KR", "2.0");
        NewRelease product2 = new NewRelease("AIR MAX 300",
                "https://androidappsprojects.s3.eu-north-1.amazonaws.com/nikeapp/shoe2.png",
                "Mens Shoes", "899.95 KR", "1.0");
        NewRelease product3 = new NewRelease("AIR MAX 400",
                "https://androidappsprojects.s3.eu-north-1.amazonaws.com/nikeapp/shoe3.png",
                "Mens Shoes", "599.95 KR", "4.0");
        NewRelease product4 = new NewRelease("AIR MAX 500",
                "https://androidappsprojects.s3.eu-north-1.amazonaws.com/nikeapp/shoe4.png",
                "Mens Shoes", "399.95 KR", "4.5");
        NewRelease product5 = new NewRelease("AIR MAX 600",
                "https://androidappsprojects.s3.eu-north-1.amazonaws.com/nikeapp/shoe5.png",
                "Mens Shoes", "199.95 KR", "1.5");

        newReleaseList.add(product1);
        newReleaseList.add(product2);
        newReleaseList.add(product3);
        newReleaseList.add(product4);
        newReleaseList.add(product5);

        BestSeller bestSeller1 = new BestSeller("AIR Zoom 800", "Sneakers",
                "https://androidappsprojects.s3.eu-north-1.amazonaws.com/nikeapp/small-shoe1.png",
                "5.0", "499.95 KR");
        BestSeller bestSeller2 = new BestSeller("AIR Zoom 200", "Sneakers",
                "https://androidappsprojects.s3.eu-north-1.amazonaws.com/nikeapp/small-shoe2.png",
                "3.5", "399.95 KR");
        BestSeller bestSeller3 = new BestSeller("AIR Zoom 400", "Sneakers",
                "https://androidappsprojects.s3.eu-north-1.amazonaws.com/nikeapp/small-shoe3.png",
                "1.5", "699.95 KR");
        BestSeller bestSeller4 = new BestSeller("AIR Zoom 100", "Sneakers",
                "https://androidappsprojects.s3.eu-north-1.amazonaws.com/nikeapp/small-shoe4.png",
                "2.5", "999.95 KR");
        BestSeller bestSeller5 = new BestSeller("AIR Zoom MAX", "Sneakers",
                "https://androidappsprojects.s3.eu-north-1.amazonaws.com/nikeapp/small-shoe5.png",
                "4.0", "199.95 KR");

        bestSellerList.add(bestSeller1);
        bestSellerList.add(bestSeller2);
        bestSellerList.add(bestSeller3);
        bestSellerList.add(bestSeller4);
        bestSellerList.add(bestSeller5);

        newReleaseRecyclerAdapter = new NewReleaseRecyclerAdapter(this, newReleaseList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(newReleaseRecyclerAdapter);
        newReleaseRecyclerAdapter.notifyDataSetChanged();

        bestSellerRecyclerAdapter = new BestSellerRecyclerAdapter(this, bestSellerList);
        bestSellerRecyclerView.setHasFixedSize(true);
        bestSellerRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        bestSellerRecyclerView.setAdapter(bestSellerRecyclerAdapter);
        bestSellerRecyclerAdapter.notifyDataSetChanged();
    }
}