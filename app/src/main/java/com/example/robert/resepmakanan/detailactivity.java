package com.example.robert.resepmakanan;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Robert on 05/10/2017.
 */

public class detailactivity extends AppCompatActivity {
    TextView resep;
    ImageView detailgambar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resepfull);
        Intent intent = getIntent();
        getSupportActionBar().setTitle(intent.getStringExtra("resep.namamasakan"));
        resep = (TextView)findViewById(R.id.resep);
        detailgambar = (ImageView)findViewById(R.id.detailgambar);

        resep.setText(intent.getStringExtra("resep.carabuat"));
        detailgambar.setImageResource(intent.getIntExtra("resep.gambar",0));
    }
}
