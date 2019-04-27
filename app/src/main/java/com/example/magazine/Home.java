package com.example.magazine;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        TextView headerView = (TextView) findViewById(R.id.header);
        switch(id){
            case R.id.action_settings :

                Toast toast = Toast.makeText(getApplicationContext(),
                        "Setting!", Toast.LENGTH_SHORT);
                toast.show();

                Intent intent = new Intent(Home.this, Settind.class);
                startActivity(intent);

                return true;
            case R.id.open_settings:

                Toast toast1 = Toast.makeText(getApplicationContext(),
                        "Open!", Toast.LENGTH_SHORT);
                toast1.show();
                return true;
            case R.id.save_settings:

                Toast toast2 = Toast.makeText(getApplicationContext(),
                        "Save!", Toast.LENGTH_SHORT);
                toast2.show();
                return true;
        }
        return super.onOptionsItemSelected(item);
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









