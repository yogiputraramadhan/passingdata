package com.example.passingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class pesanan extends AppCompatActivity implements View.OnClickListener {
    Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan);
        TextView t = (TextView) findViewById(R.id.text_nama);
        TextView a = (TextView) findViewById(R.id.text_alamat);
        TextView p = (TextView) findViewById(R.id.text_pesanan);
        Bundle bundle=getIntent().getExtras();
        String s=bundle.getString("nama");
        t.setText(s);
        String n=bundle.getString("alamat");
        a.setText(n);
        String e=bundle.getString("pesanan");
        p.setText(e);
        cancel = (Button)findViewById(R.id.cancel);
        cancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent cancel = new Intent(pesanan.this,home.class);
        startActivity(cancel);

    }
}
