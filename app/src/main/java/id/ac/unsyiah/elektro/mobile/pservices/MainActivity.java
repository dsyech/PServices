package id.ac.unsyiah.elektro.mobile.pservices;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        //getSupportActionBar().setCustomView(R.layout.activity_main);
       // getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.header));
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar);


        ImageView rumahSakit = (ImageView) findViewById(R.id.rumahSakit);
        rumahSakit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] namaKantor = {"RSUZA", "RS Meuraxa", "RSJ"};
                Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                next.putExtra("namaKantor", namaKantor);
                startActivity(next);

            }
        });

        ImageView kantorPolisi = (ImageView) findViewById(R.id.kantorPolisi);
        kantorPolisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] namaKantor = {"Polda Aceh", "Polres Banda Aceh", "Dirlantas"};
                Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                next.putExtra("namaKantor", namaKantor);
                startActivity(next);
            }
        });

        ImageView damkar = (ImageView) findViewById(R.id.damkar);
        damkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] namaKantor = {"Polda Aceh", "Polres Banda Aceh", "Dirlantas"};
                Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                next.putExtra("namaKantor", namaKantor);
                startActivity(next);
            }
        });

        ImageView pmi = (ImageView) findViewById(R.id.pmi);
        pmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] namaKantor = {"Polda Aceh", "Polres Banda Aceh", "Dirlantas"};
                Intent next =new Intent (getApplicationContext(), KantorActivity.class);
                next.putExtra("namaKantor",namaKantor);
                startActivity(next);
            }
        });

        ImageView pln = (ImageView) findViewById(R.id.pln);
        pln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] namaKantor = {"Polda Aceh", "Polres Banda Aceh", "Dirlantas"};
                Intent next =new Intent (getApplicationContext(), KantorActivity.class);
                next.putExtra("namaKantor",namaKantor);
                startActivity(next);
            }
        });

        ImageView sar = (ImageView) findViewById(R.id.sar);
        sar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] namaKantor = {"Polda Aceh", "Polres Banda Aceh", "Dirlantas"};
                Intent next =new Intent (getApplicationContext(), KantorActivity.class);
                next.putExtra("namaKantor",namaKantor);
                startActivity(next);
            }
        });

        ImageView bpbd = (ImageView) findViewById(R.id.bpbd);
        bpbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] namaKantor = {"Polda Aceh", "Polres Banda Aceh", "Dirlantas"};
                Intent next =new Intent (getApplicationContext(), KantorActivity.class);
                next.putExtra("namaKantor",namaKantor);
                startActivity(next);
            }
        });

        ImageView ppwh = (ImageView) findViewById(R.id.ppwh);
        ppwh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] namaKantor = {"Polda Aceh", "Polres Banda Aceh", "Dirlantas"};
                Intent next =new Intent (getApplicationContext(), KantorActivity.class);
                next.putExtra("namaKantor",namaKantor);
                startActivity(next);
            }
        });

        ImageView pemerintah = (ImageView) findViewById(R.id.pemerintah);
        pemerintah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] namaKantor = {"Polda Aceh", "Polres Banda Aceh", "Dirlantas"};
                Intent next =new Intent (getApplicationContext(), KantorActivity.class);
                next.putExtra("namaKantor",namaKantor);
                startActivity(next);
            }
        });
    }
}
