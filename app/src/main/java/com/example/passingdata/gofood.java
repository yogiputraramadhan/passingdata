package com.example.passingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class gofood extends AppCompatActivity {
Button btn_pesan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gofood);
        final EditText nama = (EditText) findViewById(R.id.nama);
        final EditText alamat = (EditText) findViewById(R.id.alamat);
        final EditText pesanan = (EditText) findViewById(R.id.pesanan);
        btn_pesan = (Button) findViewById(R.id.btn_pesan);
        btn_pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gofood.this,pesanan.class);
                i.putExtra("nama",nama.getText().toString());
                i.putExtra("alamat",alamat.getText().toString());
                i.putExtra("pesanan",pesanan.getText().toString());
                startActivity(i);
            }
        });
    }
}
