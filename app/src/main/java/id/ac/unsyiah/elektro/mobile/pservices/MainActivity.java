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


        getSupportActionBar().setCustomView(R.layout.actionbar);
       getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);



        ImageView rumahSakit = (ImageView) findViewById(R.id.rumahSakit);
        rumahSakit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                String [] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh","Jl. T. Hamzah Bendahara Banda Aceh","Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh","Jl. Cut Nyak Dhien No : 498 ,Banda Aceh","Jl. Teuku Umar 181,Banda Aceh", "Jl. Jend.Sudirman 27-29,Banda Aceh", "Jl. Soekarno Hatta Km.2 Mibo Banda Aceh", "Jl. Prof.A.Madjid Ibrahim I, no. 3 Banda Aceh","Jl. Sultan Iskandar Muda No.217,Banda Aceh","Jl. Cut Nyak Dhien No. 23, Lamteumen Barat Banda Aceh","Jln. T. Nyak Arief No.17-24 Jeulingke","Jl. Cut Meutia No. 55","Jln. Pocut Baren, 36-40","Jl. Lingkar Kampus","Jl. Sultan Malikul Saleh No. 17 Lamlagang, Kec. Banda Raya","JL. STA. MAHMUDSYAH N0 9 BANDA ACEH","Jl. Sekolah No. 5 Gampoeng Ateuk Pahlawan, Kecamatan Baiturahman, Kota Banda Aceh"};
                String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh","RS Malahayati","RSIA Harapan Bunda","RS Teuku Fakinah","RSU Meuraxa","RS Ibu dan Anak Propinsi NAD","RS Permata Hati","Rumkit Bhayangkara Banda Aceh","RS UBUDIYAH BANDA ACEH","RS Meutia","RS Cempaka Az Zahra Banda Aceh","RS PRINCE NAYEF BIN ABDUL AZIZ UNSYIAH","RSU Bulan Sabit Merah Indonesia Aceh","RS NABILA HOSPITAL","RS PERTAMEDIKA UMMI ROSNATI"};
                int [] gambar = {R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a};
                next.putExtra("namaKantor", namaKantor);
                next.putExtra("gambar",gambar);
                next.putExtra("desk", desk);
                startActivity(next);

            }
        });

        ImageView kantorPolisi = (ImageView) findViewById(R.id.kantorPolisi);
        kantorPolisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                String [] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh","Jl. T. Hamzah Bendahara Banda Aceh","Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh","Jl. Cut Nyak Dhien No : 498 ,Banda Aceh","Jl. Teuku Umar 181,Banda Aceh", "Jl. Jend.Sudirman 27-29,Banda Aceh", "Jl. Soekarno Hatta Km.2 Mibo Banda Aceh", "Jl. Prof.A.Madjid Ibrahim I, no. 3 Banda Aceh","Jl. Sultan Iskandar Muda No.217,Banda Aceh","Jl. Cut Nyak Dhien No. 23, Lamteumen Barat Banda Aceh","Jln. T. Nyak Arief No.17-24 Jeulingke","Jl. Cut Meutia No. 55","Jln. Pocut Baren, 36-40","Jl. Lingkar Kampus","Jl. Sultan Malikul Saleh No. 17 Lamlagang, Kec. Banda Raya","JL. STA. MAHMUDSYAH N0 9 BANDA ACEH","Jl. Sekolah No. 5 Gampoeng Ateuk Pahlawan, Kecamatan Baiturahman, Kota Banda Aceh"};
                String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh","RS Malahayati","RSIA Harapan Bunda","RS Teuku Fakinah","RSU Meuraxa","RS Ibu dan Anak Propinsi NAD","RS Permata Hati","Rumkit Bhayangkara Banda Aceh","RS UBUDIYAH BANDA ACEH","RS Meutia","RS Cempaka Az Zahra Banda Aceh","RS PRINCE NAYEF BIN ABDUL AZIZ UNSYIAH","RSU Bulan Sabit Merah Indonesia Aceh","RS NABILA HOSPITAL","RS PERTAMEDIKA UMMI ROSNATI"};
                int [] gambar = {R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a};
                next.putExtra("namaKantor", namaKantor);
                next.putExtra("gambar",gambar);
                next.putExtra("desk", desk);
                startActivity(next);
            }
        });

        ImageView damkar = (ImageView) findViewById(R.id.damkar);
        damkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                String [] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh","Jl. T. Hamzah Bendahara Banda Aceh","Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh","Jl. Cut Nyak Dhien No : 498 ,Banda Aceh","Jl. Teuku Umar 181,Banda Aceh", "Jl. Jend.Sudirman 27-29,Banda Aceh", "Jl. Soekarno Hatta Km.2 Mibo Banda Aceh", "Jl. Prof.A.Madjid Ibrahim I, no. 3 Banda Aceh","Jl. Sultan Iskandar Muda No.217,Banda Aceh","Jl. Cut Nyak Dhien No. 23, Lamteumen Barat Banda Aceh","Jln. T. Nyak Arief No.17-24 Jeulingke","Jl. Cut Meutia No. 55","Jln. Pocut Baren, 36-40","Jl. Lingkar Kampus","Jl. Sultan Malikul Saleh No. 17 Lamlagang, Kec. Banda Raya","JL. STA. MAHMUDSYAH N0 9 BANDA ACEH","Jl. Sekolah No. 5 Gampoeng Ateuk Pahlawan, Kecamatan Baiturahman, Kota Banda Aceh"};
                String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh","RS Malahayati","RSIA Harapan Bunda","RS Teuku Fakinah","RSU Meuraxa","RS Ibu dan Anak Propinsi NAD","RS Permata Hati","Rumkit Bhayangkara Banda Aceh","RS UBUDIYAH BANDA ACEH","RS Meutia","RS Cempaka Az Zahra Banda Aceh","RS PRINCE NAYEF BIN ABDUL AZIZ UNSYIAH","RSU Bulan Sabit Merah Indonesia Aceh","RS NABILA HOSPITAL","RS PERTAMEDIKA UMMI ROSNATI"};
                int [] gambar = {R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a};
                next.putExtra("namaKantor", namaKantor);
                next.putExtra("gambar",gambar);
                next.putExtra("desk", desk);
                startActivity(next);
            }
        });

        ImageView pmi = (ImageView) findViewById(R.id.pmi);
        pmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                String [] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh","Jl. T. Hamzah Bendahara Banda Aceh","Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh","Jl. Cut Nyak Dhien No : 498 ,Banda Aceh","Jl. Teuku Umar 181,Banda Aceh", "Jl. Jend.Sudirman 27-29,Banda Aceh", "Jl. Soekarno Hatta Km.2 Mibo Banda Aceh", "Jl. Prof.A.Madjid Ibrahim I, no. 3 Banda Aceh","Jl. Sultan Iskandar Muda No.217,Banda Aceh","Jl. Cut Nyak Dhien No. 23, Lamteumen Barat Banda Aceh","Jln. T. Nyak Arief No.17-24 Jeulingke","Jl. Cut Meutia No. 55","Jln. Pocut Baren, 36-40","Jl. Lingkar Kampus","Jl. Sultan Malikul Saleh No. 17 Lamlagang, Kec. Banda Raya","JL. STA. MAHMUDSYAH N0 9 BANDA ACEH","Jl. Sekolah No. 5 Gampoeng Ateuk Pahlawan, Kecamatan Baiturahman, Kota Banda Aceh"};
                String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh","RS Malahayati","RSIA Harapan Bunda","RS Teuku Fakinah","RSU Meuraxa","RS Ibu dan Anak Propinsi NAD","RS Permata Hati","Rumkit Bhayangkara Banda Aceh","RS UBUDIYAH BANDA ACEH","RS Meutia","RS Cempaka Az Zahra Banda Aceh","RS PRINCE NAYEF BIN ABDUL AZIZ UNSYIAH","RSU Bulan Sabit Merah Indonesia Aceh","RS NABILA HOSPITAL","RS PERTAMEDIKA UMMI ROSNATI"};
                int [] gambar = {R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a};
                next.putExtra("namaKantor", namaKantor);
                next.putExtra("gambar",gambar);
                next.putExtra("desk", desk);
                startActivity(next);
            }
        });

        ImageView pln = (ImageView) findViewById(R.id.pln);
        pln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                String [] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh","Jl. T. Hamzah Bendahara Banda Aceh","Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh","Jl. Cut Nyak Dhien No : 498 ,Banda Aceh","Jl. Teuku Umar 181,Banda Aceh", "Jl. Jend.Sudirman 27-29,Banda Aceh", "Jl. Soekarno Hatta Km.2 Mibo Banda Aceh", "Jl. Prof.A.Madjid Ibrahim I, no. 3 Banda Aceh","Jl. Sultan Iskandar Muda No.217,Banda Aceh","Jl. Cut Nyak Dhien No. 23, Lamteumen Barat Banda Aceh","Jln. T. Nyak Arief No.17-24 Jeulingke","Jl. Cut Meutia No. 55","Jln. Pocut Baren, 36-40","Jl. Lingkar Kampus","Jl. Sultan Malikul Saleh No. 17 Lamlagang, Kec. Banda Raya","JL. STA. MAHMUDSYAH N0 9 BANDA ACEH","Jl. Sekolah No. 5 Gampoeng Ateuk Pahlawan, Kecamatan Baiturahman, Kota Banda Aceh"};
                String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh","RS Malahayati","RSIA Harapan Bunda","RS Teuku Fakinah","RSU Meuraxa","RS Ibu dan Anak Propinsi NAD","RS Permata Hati","Rumkit Bhayangkara Banda Aceh","RS UBUDIYAH BANDA ACEH","RS Meutia","RS Cempaka Az Zahra Banda Aceh","RS PRINCE NAYEF BIN ABDUL AZIZ UNSYIAH","RSU Bulan Sabit Merah Indonesia Aceh","RS NABILA HOSPITAL","RS PERTAMEDIKA UMMI ROSNATI"};
                int [] gambar = {R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a};
                next.putExtra("namaKantor", namaKantor);
                next.putExtra("gambar",gambar);
                next.putExtra("desk", desk);
                startActivity(next);
            }
        });

        ImageView sar = (ImageView) findViewById(R.id.sar);
        sar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                String [] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh","Jl. T. Hamzah Bendahara Banda Aceh","Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh","Jl. Cut Nyak Dhien No : 498 ,Banda Aceh","Jl. Teuku Umar 181,Banda Aceh", "Jl. Jend.Sudirman 27-29,Banda Aceh", "Jl. Soekarno Hatta Km.2 Mibo Banda Aceh", "Jl. Prof.A.Madjid Ibrahim I, no. 3 Banda Aceh","Jl. Sultan Iskandar Muda No.217,Banda Aceh","Jl. Cut Nyak Dhien No. 23, Lamteumen Barat Banda Aceh","Jln. T. Nyak Arief No.17-24 Jeulingke","Jl. Cut Meutia No. 55","Jln. Pocut Baren, 36-40","Jl. Lingkar Kampus","Jl. Sultan Malikul Saleh No. 17 Lamlagang, Kec. Banda Raya","JL. STA. MAHMUDSYAH N0 9 BANDA ACEH","Jl. Sekolah No. 5 Gampoeng Ateuk Pahlawan, Kecamatan Baiturahman, Kota Banda Aceh"};
                String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh","RS Malahayati","RSIA Harapan Bunda","RS Teuku Fakinah","RSU Meuraxa","RS Ibu dan Anak Propinsi NAD","RS Permata Hati","Rumkit Bhayangkara Banda Aceh","RS UBUDIYAH BANDA ACEH","RS Meutia","RS Cempaka Az Zahra Banda Aceh","RS PRINCE NAYEF BIN ABDUL AZIZ UNSYIAH","RSU Bulan Sabit Merah Indonesia Aceh","RS NABILA HOSPITAL","RS PERTAMEDIKA UMMI ROSNATI"};
                int [] gambar = {R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a};
                next.putExtra("namaKantor", namaKantor);
                next.putExtra("gambar",gambar);
                next.putExtra("desk", desk);
                startActivity(next);
            }
        });

        ImageView bpbd = (ImageView) findViewById(R.id.bpbd);
        bpbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                String [] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh","Jl. T. Hamzah Bendahara Banda Aceh","Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh","Jl. Cut Nyak Dhien No : 498 ,Banda Aceh","Jl. Teuku Umar 181,Banda Aceh", "Jl. Jend.Sudirman 27-29,Banda Aceh", "Jl. Soekarno Hatta Km.2 Mibo Banda Aceh", "Jl. Prof.A.Madjid Ibrahim I, no. 3 Banda Aceh","Jl. Sultan Iskandar Muda No.217,Banda Aceh","Jl. Cut Nyak Dhien No. 23, Lamteumen Barat Banda Aceh","Jln. T. Nyak Arief No.17-24 Jeulingke","Jl. Cut Meutia No. 55","Jln. Pocut Baren, 36-40","Jl. Lingkar Kampus","Jl. Sultan Malikul Saleh No. 17 Lamlagang, Kec. Banda Raya","JL. STA. MAHMUDSYAH N0 9 BANDA ACEH","Jl. Sekolah No. 5 Gampoeng Ateuk Pahlawan, Kecamatan Baiturahman, Kota Banda Aceh"};
                String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh","RS Malahayati","RSIA Harapan Bunda","RS Teuku Fakinah","RSU Meuraxa","RS Ibu dan Anak Propinsi NAD","RS Permata Hati","Rumkit Bhayangkara Banda Aceh","RS UBUDIYAH BANDA ACEH","RS Meutia","RS Cempaka Az Zahra Banda Aceh","RS PRINCE NAYEF BIN ABDUL AZIZ UNSYIAH","RSU Bulan Sabit Merah Indonesia Aceh","RS NABILA HOSPITAL","RS PERTAMEDIKA UMMI ROSNATI"};
                int [] gambar = {R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a};
                next.putExtra("namaKantor", namaKantor);
                next.putExtra("gambar",gambar);
                next.putExtra("desk", desk);
                startActivity(next);
            }
        });

        ImageView ppwh = (ImageView) findViewById(R.id.ppwh);
        ppwh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                String [] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh","Jl. T. Hamzah Bendahara Banda Aceh","Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh","Jl. Cut Nyak Dhien No : 498 ,Banda Aceh","Jl. Teuku Umar 181,Banda Aceh", "Jl. Jend.Sudirman 27-29,Banda Aceh", "Jl. Soekarno Hatta Km.2 Mibo Banda Aceh", "Jl. Prof.A.Madjid Ibrahim I, no. 3 Banda Aceh","Jl. Sultan Iskandar Muda No.217,Banda Aceh","Jl. Cut Nyak Dhien No. 23, Lamteumen Barat Banda Aceh","Jln. T. Nyak Arief No.17-24 Jeulingke","Jl. Cut Meutia No. 55","Jln. Pocut Baren, 36-40","Jl. Lingkar Kampus","Jl. Sultan Malikul Saleh No. 17 Lamlagang, Kec. Banda Raya","JL. STA. MAHMUDSYAH N0 9 BANDA ACEH","Jl. Sekolah No. 5 Gampoeng Ateuk Pahlawan, Kecamatan Baiturahman, Kota Banda Aceh"};
                String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh","RS Malahayati","RSIA Harapan Bunda","RS Teuku Fakinah","RSU Meuraxa","RS Ibu dan Anak Propinsi NAD","RS Permata Hati","Rumkit Bhayangkara Banda Aceh","RS UBUDIYAH BANDA ACEH","RS Meutia","RS Cempaka Az Zahra Banda Aceh","RS PRINCE NAYEF BIN ABDUL AZIZ UNSYIAH","RSU Bulan Sabit Merah Indonesia Aceh","RS NABILA HOSPITAL","RS PERTAMEDIKA UMMI ROSNATI"};
                int [] gambar = {R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a};
                next.putExtra("namaKantor", namaKantor);
                next.putExtra("gambar",gambar);
                next.putExtra("desk", desk);
                startActivity(next);
            }
        });

        ImageView pemerintah = (ImageView) findViewById(R.id.pemerintah);
        pemerintah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                String [] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh","Jl. T. Hamzah Bendahara Banda Aceh","Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh","Jl. Cut Nyak Dhien No : 498 ,Banda Aceh","Jl. Teuku Umar 181,Banda Aceh", "Jl. Jend.Sudirman 27-29,Banda Aceh", "Jl. Soekarno Hatta Km.2 Mibo Banda Aceh", "Jl. Prof.A.Madjid Ibrahim I, no. 3 Banda Aceh","Jl. Sultan Iskandar Muda No.217,Banda Aceh","Jl. Cut Nyak Dhien No. 23, Lamteumen Barat Banda Aceh","Jln. T. Nyak Arief No.17-24 Jeulingke","Jl. Cut Meutia No. 55","Jln. Pocut Baren, 36-40","Jl. Lingkar Kampus","Jl. Sultan Malikul Saleh No. 17 Lamlagang, Kec. Banda Raya","JL. STA. MAHMUDSYAH N0 9 BANDA ACEH","Jl. Sekolah No. 5 Gampoeng Ateuk Pahlawan, Kecamatan Baiturahman, Kota Banda Aceh"};
                String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh","RS Malahayati","RSIA Harapan Bunda","RS Teuku Fakinah","RSU Meuraxa","RS Ibu dan Anak Propinsi NAD","RS Permata Hati","Rumkit Bhayangkara Banda Aceh","RS UBUDIYAH BANDA ACEH","RS Meutia","RS Cempaka Az Zahra Banda Aceh","RS PRINCE NAYEF BIN ABDUL AZIZ UNSYIAH","RSU Bulan Sabit Merah Indonesia Aceh","RS NABILA HOSPITAL","RS PERTAMEDIKA UMMI ROSNATI"};
                int [] gambar = {R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a};
                next.putExtra("namaKantor", namaKantor);
                next.putExtra("gambar",gambar);
                next.putExtra("desk", desk);
                startActivity(next);
            }
        });
    }
}
