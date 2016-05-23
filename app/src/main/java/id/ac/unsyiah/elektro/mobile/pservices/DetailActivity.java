package id.ac.unsyiah.elektro.mobile.pservices;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Alchusuvie on 5/19/2016.
 */
public class DetailActivity extends AppCompatActivity  {
    int pos=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setCustomView(R.layout.actionbar);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

        Intent next = getIntent();
        pos = next.getExtras().getInt("pos");
       String[] namaKantor = next.getStringArrayExtra("namaKantor");
        int [] gambar = next.getIntArrayExtra("gambar");
       String[] desk = next.getStringArrayExtra("desk");





        TextView namaDetail = (TextView) findViewById(R.id.namaDetail);
     namaDetail.setText(namaKantor[pos]);

        ImageView gambarDetail = (ImageView) findViewById(R.id.imgDetail);
      gambarDetail.setImageResource(gambar[pos]);

        TextView deskDetail = (TextView) findViewById(R.id.deskDetail);
    deskDetail.setText(desk[pos]);

        ImageView imgWeb = (ImageView) findViewById(R.id.btnWeb);
        imgWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = getIntent();
                pos = next.getExtras().getInt("pos");
                String[] web = next.getStringArrayExtra("web");

                Intent intent = new Intent(getApplicationContext(), WebActivity.class);
                intent.putExtra("web", web[pos]);
                startActivity(intent);

            }
        });

        ImageView imgTel = (ImageView) findViewById(R.id.btnTel);
        imgTel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = getIntent();
                pos = next.getExtras().getInt("pos");
                String[]tel = next.getStringArrayExtra("tel");

                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(tel[pos]));
                startActivity(intent);
            }
        });

ImageView imgSms = (ImageView) findViewById(R.id.btnSms);
        imgSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = getIntent();
                pos = next.getExtras().getInt("pos");
                String[]sms = next.getStringArrayExtra("sms");

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse(sms[pos]));
                startActivity(intent);
            }
        });

        ImageView imgEmail = (ImageView) findViewById(R.id.btnEmail);
        imgEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = getIntent();
                pos = next.getExtras().getInt("pos");
                String[]mail = next.getStringArrayExtra("mail");

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse(mail[pos]));
                startActivity(intent);
            }
        });

        ImageView imgMaps = (ImageView) findViewById(R.id.btnMaps);
        imgMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = getIntent();
                pos = next.getExtras().getInt("pos");
                double []lat=next.getDoubleArrayExtra("lat");
                double [] lang = next.getDoubleArrayExtra("lang");
                String[] namaKantor = next.getStringArrayExtra("namaKantor");


                Bundle extras = new Bundle();
                extras.putDouble("lat", lat[pos]);
                extras.putDouble("lang", lang[pos]);
                extras.putString("namaKantor",namaKantor[pos]);

                Intent newIntent = new Intent(getApplicationContext(), MapsActivity.class);
                newIntent.putExtras(extras);
                startActivity(newIntent);

            }
        });
    }
}
