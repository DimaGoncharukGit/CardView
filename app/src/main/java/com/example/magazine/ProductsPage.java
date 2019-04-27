package com.example.magazine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ProductsPage extends AppCompatActivity {

    public static final String Card_ID = "cardId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_page);
    }
}
