package com.example.magazine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Settind extends AppCompatActivity {

    String[] cities = {"Русский", "Украинский", "Англиский", "Белоруский", "Сербский", "Иврит"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settind);

        // Получаем ссылку на элемент AutoCompleteTextView в разметке
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autocomplete);
        // Создаем адаптер для автозаполнения элемента AutoCompleteTextView
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities);
        autoCompleteTextView.setAdapter(adapter);
    }
}

