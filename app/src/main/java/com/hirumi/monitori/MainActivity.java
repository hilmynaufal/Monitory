package com.hirumi.monitori;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("nama");
        String umur = bundle.getString("umur");

        String teks = "Beres! Sekarang " + nama + " udah bisa ngecek penggunaan HP mu tiap hari buat bantu " + nama + " ngatur waktu :)";

        TextView textView = findViewById(R.id.teks);
        textView.setText(teks);
    }
}