package com.example.passingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class home extends AppCompatActivity implements View.OnClickListener {
ImageButton menu_gofood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        menu_gofood = (ImageButton)findViewById(R.id.menu_gofood);
        menu_gofood.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent menu_gofood = new Intent(home.this,gofood.class);
        startActivity(menu_gofood);
    }
}
