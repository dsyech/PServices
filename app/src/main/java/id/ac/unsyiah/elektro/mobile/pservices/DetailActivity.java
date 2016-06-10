package id.ac.unsyiah.elektro.mobile.pservices;

import android.Manifest;
import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Alchusuvie on 5/19/2016.
 */
public class DetailActivity extends AppCompatActivity {
    int pos = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setCustomView(R.layout.actionbar);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

        Intent next = getIntent();
        String namaKantor = next.getStringExtra("namaKantor");
        int gambar = next.getIntExtra("gambar", 0);
        String desk = next.getStringExtra("desk");

        double lat = next.getDoubleExtra("lat", 0.0);
        double lang = next.getDoubleExtra("lang", 0.0);


        TextView namaDetail = (TextView) findViewById(R.id.namaDetail);
        namaDetail.setText(namaKantor);

        ImageView gambarDetail = (ImageView) findViewById(R.id.imgDetail);
        gambarDetail.setImageResource(gambar);

        TextView deskDetail = (TextView) findViewById(R.id.deskDetail);
        deskDetail.setText(desk);

        ImageView imgWeb = (ImageView) findViewById(R.id.btnWeb);
        imgWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent next = getIntent();
                String web = next.getStringExtra("web");

                if (web.equalsIgnoreCase("-")) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Maaf web tidak tersedia", Toast.LENGTH_LONG);
                    toast.show();
                } else {
                    Intent intent = new Intent(getApplicationContext(), WebActivity.class);
                    intent.putExtra("web", web);
                    startActivity(intent);
                }
            }
        });

        ImageView imgTel = (ImageView) findViewById(R.id.btnTel);
        imgTel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = getIntent();
                String tel = next.getStringExtra("tel");

                if (tel.equalsIgnoreCase("-")) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Maaf telepon tidak tersedia", Toast.LENGTH_LONG);
                    toast.show();
                } else {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse(tel));
                    startActivity(intent);
                }
            }
        });

ImageView imgSms = (ImageView) findViewById(R.id.btnSms);
        imgSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = getIntent();
                String sms = next.getStringExtra("sms");


                if (sms.equalsIgnoreCase("-")){
                    Toast toast = Toast.makeText(getApplicationContext(), "Maaf sms tidak tersedia", Toast.LENGTH_LONG);
                    toast.show();
                }
                else {
                    Intent intent = new Intent(Intent.ACTION_SENDTO);
                    intent.setData(Uri.parse(sms));
                    startActivity(intent);
                }
            }
        });

        ImageView imgEmail = (ImageView) findViewById(R.id.btnEmail);
        imgEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = getIntent();
                String mail = next.getStringExtra("mail");

                if (mail.equalsIgnoreCase("-")){
                    Toast toast = Toast.makeText(getApplicationContext(), "Maaf email tidak tersedia", Toast.LENGTH_LONG);
                    toast.show();
                }
                else {
                    Intent intent = new Intent(Intent.ACTION_SENDTO);
                    intent.setData(Uri.parse(mail));
                    startActivity(intent);
                }
            }
        });

        ImageView imgMaps = (ImageView) findViewById(R.id.btnMaps);
        imgMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = getIntent();
                double lat=next.getDoubleExtra("lat", 0.0);
                double lang = next.getDoubleExtra("lang", 0.0);
                String namaKantor = next.getStringExtra("namaKantor");


                Bundle extras = new Bundle();
                extras.putDouble("lat", lat);
                extras.putDouble("lang", lang);
                extras.putString("namaKantor",namaKantor);

                Intent newIntent = new Intent(getApplicationContext(), MapsActivity.class);
                newIntent.putExtras(extras);
                startActivity(newIntent);

            }
        });
}
}
