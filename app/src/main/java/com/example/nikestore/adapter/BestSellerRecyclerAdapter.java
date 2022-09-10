package com.example.nikestore.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.nikestore.ProductDetails;
import com.example.nikestore.R;
import com.example.nikestore.model.BestSeller;

import java.util.List;

public class BestSellerRecyclerAdapter extends RecyclerView.Adapter<BestSellerRecyclerAdapter.BestSellerViewHolder> {

    private Context context;
    private List<BestSeller> bestSellerList;

    public BestSellerRecyclerAdapter(Context context, List<BestSeller> bestSellerList) {
        this.context = context;
        this.bestSellerList = bestSellerList;
    }


    @Override
    public BestSellerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.best_seller_recycler_view, parent, false);
        final BestSellerViewHolder viewHolder = new BestSellerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(BestSellerRecyclerAdapter.BestSellerViewHolder holder, int position) {

        holder.itemName.setText(bestSellerList.get(position).getName());
        holder.price.setText(bestSellerList.get(position).getPrice());
        holder.type.setText(bestSellerList.get(position).getType());
        holder.rating.setText(bestSellerList.get(position).getRating());
        Glide.with(context).load(bestSellerList.get(position).getImageUrl()).into(holder.itemImage);

        holder.itemView.setOnClickListener(view -> {
            Intent i = new Intent(context, ProductDetails.class);
            i.putExtra("name", bestSellerList.get(position).getName());
            i.putExtra("rating", bestSellerList.get(position).getRating());
            i.putExtra("price", bestSellerList.get(position).getPrice());
            context.startActivity(i);
        });

    }

    @Override
    public int getItemCount() {
        return bestSellerList.size();
    }

    public static class BestSellerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView itemImage;
        TextView itemName, rating, price, type;
        LinearLayout linearLayout_best_seller;

        public BestSellerViewHolder(View itemView) {

            super(itemView);
            linearLayout_best_seller = itemView.findViewById(R.id.best_seller);
            itemImage = itemView.findViewById(R.id.shoeImageView);
            itemName = itemView.findViewById(R.id.shoe_bestseller_name);
            rating = itemView.findViewById(R.id.rating);
            price = itemView.findViewById(R.id.best_seller_price);
            type = itemView.findViewById(R.id.type);

        }

        @Override
        public void onClick(View view) {

        }
    }
}
