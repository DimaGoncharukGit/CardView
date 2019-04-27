package com.example.magazine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {

    List<Product> products = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        // создаем адаптер
        Adapter adapter = new Adapter(this, products);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }


    private void setInitialData(){

        products.add(new Product ("Brush", "Poni", R.drawable.ic_kistochka_black_30dp));
        products.add(new Product ("Palette", "Auqarekl", R.drawable.ic_color_lens_black_30dp));
        products.add(new Product ("Pen", "Faber of castle", R.drawable.ic_mode_edit_black_30dp));

        products.add(new Product ("Coffe", "Undergraund", R.drawable.ic_coffe_black_30dp));

        products.add(new Product ("Sofa", "Kharkiv national company", R.drawable.ic_sofa_black_24dp));
        products.add(new Product ("Puzzel", "200px", R.drawable.ic_extension_black_30dp));
        products.add(new Product ("Airplane", "MAU", R.drawable.ic_flight_black_30dp));

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
}









