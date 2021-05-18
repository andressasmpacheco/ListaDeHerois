package com.example.listaherois;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class visualiza_heroi_layout extends AppCompatActivity {
    TextView txtHero;
    ImageView imgHero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualiza_heroi_layout);
        txtHero =findViewById(R.id.txtListaHero);
        imgHero = findViewById(R.id.imglistahero);

        Intent intent = getIntent();
        String nHero = intent.getStringExtra("nomeHero");
        int mHero = intent.getIntExtra("imghero",0);
        txtHero.setText(nHero);
        imgHero.setImageResource(mHero);
    }

    public void Voltar(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();
    }
}