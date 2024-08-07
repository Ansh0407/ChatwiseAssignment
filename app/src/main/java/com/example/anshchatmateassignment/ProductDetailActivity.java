package com.example.anshchatmateassignment;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        TextView tvProductDetail = findViewById(R.id.tvProductDetail);

        Product product = (Product) getIntent().getSerializableExtra("product");

        if (product != null) {
            String productDetail = "Title: " + product.getTitle() + "\n\n" +
                    "Description: " + product.getDescription();
            tvProductDetail.setText(productDetail);
        }
    }
}
