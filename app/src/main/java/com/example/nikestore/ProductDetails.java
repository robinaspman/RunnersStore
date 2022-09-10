package com.example.nikestore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class ProductDetails extends AppCompatActivity {

    TextView productName, productPrice, productRating;
    ImageView backButton, likeButton;
    Button buyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        Intent i = getIntent();

        String name = i.getStringExtra("name");
        String price = i.getStringExtra("price");
        String rating = i.getStringExtra("rating");

        productName = findViewById(R.id.product_name);
        productRating = findViewById(R.id.rating_description);
        productPrice = findViewById(R.id.product_price);
        backButton = findViewById(R.id.back_button);
        buyButton = findViewById(R.id.buy_button);
        likeButton = findViewById(R.id.like_button);

        productName.setText(name);
        productRating.setText(rating);
        productPrice.setText(price);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ProductDetails.this, "Clicked on return", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(ProductDetails.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(ProductDetails.this, "Payment complete", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(ProductDetails.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(ProductDetails.this, "You have liked", Toast.LENGTH_SHORT).show();

            }
        });

    }
}