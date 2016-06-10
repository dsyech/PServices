package id.ac.unsyiah.elektro.mobile.pservices;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setCustomView(R.layout.actionbar);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                int kabkot = parent.getSelectedItemPosition();

                if (kabkot==0){ //Banda Aceh

                    ImageView rumahSakit = (ImageView) findViewById(R.id.rumahSakit);
                    rumahSakit.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh", " RSI Malahayati",
                                    "RSIA Harapan Bunda", "RS Teuku Fakinah", "RSU Meuraxa", "RS Ibu dan Anak Propinsi NAD", "RS Permata Hati", "Rumkit Bhayangkara Banda Aceh"
                                    , "RS UBUDIYAH BANDA ACEH", "RS Meutia", "RS Cempaka Az Zahra Banda Aceh", "RS PRINCE NAYEF BIN ABDUL AZIZ SYIAH KUALA UNIVERS"
                                    , "RSU Bulan Sabit Merah Indonesia Aceh", "RS NABILA HOSPITAL", "RS PERTAMEDIKA UMMI ROSNATI"};
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"
                                    , "Jl. Cut Nyak Dhien No : 498 ,Banda Ace", "Jl. Teuku Umar 181,Banda Aceh", "Jl. Jend.Sudirman 27-29,Banda Aceh", "Jl. Soekarno Hatta Km.2 Mibo Banda Aceh"
                                    , "Jl. Prof.A.Madjid Ibrahim I, no. 3 Banda Aceh", "Jl. Sultan Iskandar Muda No.217,Banda Aceh", "Jl. Cut Nyak Dhien No. 23, Lamteumen Barat Banda Aceh"
                                    , "Jln. T. Nyak Arief No.17-24 Jeulingke", "Jl. Cut Meutia No. 55", "Jln. Pocut Baren, 36-40", "Jl. Lingkar Kampus", "Jl. Sultan Malikul Saleh No. 17 Lamlagang, Kec. Banda Raya"
                                    , "JL. STA. MAHMUDSYAH N0 9 BANDA ACEH", "Jl. Sekolah No. 5 Gampoeng Ateuk Pahlawan, Kecamatan Baiturahman, Kota Banda Aceh 23241"};

                            int[] gambar = {R.drawable.rsudza, R.drawable.rsiskandarmuda, R.drawable.rsjbandaaceh, R.drawable.rsmala, R.drawable.rshb, R.drawable.rsfakinah, R.drawable.rsmeuraxa,
                                    R.drawable.rsibuanakbanda, R.drawable.rspermatahati, R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.rsprincenayef,
                                    R.drawable.rsbulansabitbanda, R.drawable.a, R.drawable.rspertamedikabanda};
                            String[]sms ={"-", "-", "-", "-", "-",
                                    "-", "-", "-", "-", "-",
                                    "-", "-", "-", "-", "-", "-",
                                    "-"};
                            String[]mail ={"mailto:rsudza@acehprov.go.id", "mailto:rumahsakitim@yahoo.com", "mailto:rsjaceh2011@gmail.com",
                                    "mailto:rumahsakitmalahayati@yahoo.co.id", "mailto:rsharapanbunda181@gmail.com", "mailto:teungkufakinah.hospital@yahoo.com", "mailto:rsum@bandaacehkota.go.id",
                                    "mailto:rsia@acehprov.go.id", "-", "mailto:bhayangkara_banda_aceh@yahoo.co.id", "mailto:ubudiyah_hospital@yahoo.com",
                                    "-", "mailto:rsu_azzahra@yahoo.com", "-", "mailto:deydifitriady@yahoo.co.id",
                                    "-", "-"};

                            double[] lat = {5.579462, 5.564446, 5.565996, 5.565996,
                                    5.565996, 5.565996, 5.565996, 5.565996,
                                    5.565996, 5.565996, 5.565996, 5.565996,
                                    5.565996, 5.565996, 5.565996, 5.565996, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772, 95.336772,
                                    95.348918, 95.325893, 95.336772, 95.336772,
                                    95.348918, 95.325893, 95.336772, 95.336772,
                                    95.348918, 95.325893, 95.336772, 95.336772,
                                    95.348918};

                            String []web = {"www.rsuza.acehprov.go.id", "-", "http://rsj.acehprov.go.id", "-", "-", "-", "http://rsum.bandaacehkota.go.id", "rsia.acehprov.go.id"
                                    , "-", "-", "-", "-", "-", "-", "www.bsmi.or.id", "-", "-"};
                            String[]tel = {"tel:0651-34562", "tel:065122550", "tel:065132020", "065146115"
                                    , "065148114", "065141454", "065143097", "0651637796", "06517428872"
                                    , "065141470", "06517555750", "065133149", "065131066", "06517412628","0651638701"
                                    , "065133555", "065135092"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView kantorPolisi = (ImageView) findViewById(R.id.kantorPolisi);
                    kantorPolisi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] namaKantor = {"Polda Aceh", "Poltabes Banda Aceh","Polsek Meuraxa","Polsek Jaya Baru", "Polsek Banda Raya","Polsek Baiturrahman",
                                    "Polsek Lueng Bata","Polsek Kuta Alam","Polsek Kuta Raja","Polsek Syiah Kuala","Polsek Ulee Kareng"};

                            String[] desk = {"Jl. Cut Nyak Dien, Aceh", "JL Teungku M. Daud Beureu`eh, No. 71", "Jl. Pantai Ulee Lheue"
                            ,"Jl. Tengku Abdurrahman","Jl. Tengku Dilhong I","Jl. Lamlagang Baiturrahman, Aceh","Jl. Soekarno-Hatta, Lueng Bata, Kota Banda Aceh, Aceh"
                            ,"Jl Teungku Diblang, Lampulo Baru (Jl Syiah Kuala)","Jl. Peulanggahan, Kec. Kutaraja, Banda Aceh, Aceh 23231",
                                    "Jl. Lingkar Kampus, Rukoh, Syiah Kuala, Kota Banda Aceh, Aceh","Jl. Jurong Dagang, Sp. 7, Banda Aceh, Aceh, Indonesia"};
                            int[] gambar = {R.drawable.poldaaceh, R.drawable.poltabesbandaaceh, R.drawable.b, R.drawable.b, R.drawable.b, R.drawable.b
                                    , R.drawable.b, R.drawable.b, R.drawable.b, R.drawable.b, R.drawable.b};
                            String[]sms ={"smsto:08116771010","-","-","-","-","-","-","-","-",
                                    "-","-"};
                            String[]mail ={"mailto:resus.polda.aceh@gmail.com","-","-","-","-","-","-","-","-"
                                    ,"-","-"};

                            double[] lat = {5.578290, 5.564446, 5.565996, 5.564446, 5.565996, 5.564446, 5.565996, 5.564446, 5.565996, 5.564446, 5.565996};
                            double []lang={95.348898, 95.325893, 95.336772, 95.325893, 95.336772, 95.325893, 95.336772, 95.325893, 95.336772, 95.325893, 95.336772};

                            String []web = {"-","-","-","-","-","-","-","-","-","-","-"};
                            String[]tel = {"tel:06517555353","tel:065121353","-","tel:065121353","-","tel:065121353","-"
                                    ,"tel:065121353","-","tel:065121353","-"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView damkar = (ImageView) findViewById(R.id.damkar);
                    damkar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] namaKantor = {"Kantor Pemadam Kebakaran"};
                            String[] desk = {"Lam Teumen Bara / Ketapang, Geuceu Meunara, Jaya Baru, Kota Banda Aceh, Aceh"};
                            int[] gambar = {R.drawable.damkarbanda};
                            String[]sms ={"-"};
                            String[]mail ={"-"};
                            double[] lat = {5.525554};
                            double []lang={ 95.298144};
                            String []web = {"-"};
                            String[]tel = {"tel:065144123"};

                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView pmi = (ImageView) findViewById(R.id.pmi);
                    pmi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] namaKantor = {"Kantor PMI Banda Aceh","Kantor Cabang PMI Nanggroe Aceh Darussalam"};
                            String[] desk = {"Jl. Stadion H. Dimoerthala No.2 di Banda Aceh - 23135","JL. Stadion H. Dimoerthala, No.4, Banda Aceh"};
                            int[] gambar = {R.drawable.pmi, R.drawable.pmi};
                            String[]sms ={"-","-"};
                            String[]mail ={"-","-"};

                            double[] lat = {5.563917,  5.563114};
                            double []lang={95.341517, 95.342899};

                            String []web = {"http://pmiaceh.or.id/banda-aceh/banda-aceh","http://pmiaceh.or.id"};
                            String[]tel = {"tel:065123191","tel:065122930"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView pln = (ImageView) findViewById(R.id.pln);
                    pln.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] namaKantor = {"Perusahaan Listrik Negara (PLN). PT Persero - Wilayah Aceh", "PT. PLN (Persero) Area Banda Aceh"};
                            String[] desk = {"JL. Tengku H.Daud Beureu'eh, No. 172, Lampriet, Banda Aceh", "Jl. Tentara Pelajar, Merduati, Kuta Raja, Kota Banda Aceh, Aceh"};
                            int[] gambar = {R.drawable.e, R.drawable.e};
                            String[]sms ={"-","-"};
                            String[]mail ={"-","-"};

                            double[] lat = {5.567959, 5.556585};
                            double []lang={ 95.339679, 95.314879};

                            String []web = {"-","-"};
                            String[]tel = {"tel:065122188","-"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView sar = (ImageView) findViewById(R.id.sar);
                    sar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] namaKantor = {"Kantor SAR Banda Aceh"};
                            String[] desk = {"Jln. Sultan Malikulsaleh No.108, Lhong Raya - Banda Aceh"};
                            int[] gambar = {R.drawable.sarbandaceh};
                            String[]sms ={"-"};
                            String[]mail ={"mailto:sar.aceh@basarnas.go.id"};

                            double[] lat = {5.527842};
                            double []lang={95.433414};

                            String []web = {"http://www.aceh.basarnas.go.id/index.php"};
                            String[]tel = {"tel:065133876"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView bpbd = (ImageView) findViewById(R.id.bpbd);
                    bpbd.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] namaKantor = {"Kantor BPBD kota Banda Aceh"};
                            String[] desk = {"Jl. Soekarno Hatta, No.39 Geuce Menara,Kota Banda Aceh"};
                            int[] gambar = {R.drawable.bpbdbandaaceh};
                            String[]sms ={"-"};
                            String[]mail ={"-"};

                            double[] lat = {5.525362};
                            double []lang={95.298161};

                            String []web = {"http://bpbd.bandaacehkota.go.id/"};
                            String[]tel = {"-"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView ppwh = (ImageView) findViewById(R.id.ppwh);
                    ppwh.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] namaKantor = {"Satpol PP dan WH Banda Aceh"};
                            String[] desk = {"Jl. Tgk.Abu Lam U No.7 Telp. 0651- Banda Aceh"};
                            int[] gambar = {R.drawable.ppwh};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:satpolpp@bandaacehkota.go.id"};

                            double[] lat = {5.551417};
                            double []lang={95.318566};

                            String []web = {"http://satpolpp-wh.bandaacehkota.go.id"};
                            String[]tel = {"-"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView pemerintah = (ImageView) findViewById(R.id.pemerintah);
                    pemerintah.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] namaKantor = {"Kantor Gubernur Aceh", "Kantor Walikota Banda Aceh","Dishub Kota Banda Aceh"};
                            String[] desk = {"Jalan T. Nyak Arief, Syiah Kuala, Kota Banda Aceh, Aceh", "Jl. Balaikota, Aceh","Jl. T. Nyak Arief No 130 Kota Banda Aceh Nad 23115"};
                            int[] gambar = {R.drawable.i, R.drawable.pemkobanda, R.drawable.dishubkominfobanda};
                            String[]sms ={"-","-","-"};
                            String[]mail ={"mailto:pengelola@acehprov.go.id","mailto:lpm@bandaacehkota.go.id","-"};

                            double[] lat = {5.569786,5.549960,5.572573,};
                            double []lang={95.340265, 95.317824,95.345254  };

                            String []web = {"http://acehprov.go.id","http://www.bandaacehkota.go.id","http://perhubungan.bandaacehkota.go.id"};
                            String[]tel = {"tel:065121935","tel:065121855","tel:06517551641"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                }

                else if (kabkot==1){ //Aceh Besar

                    ImageView rumahSakit = (ImageView) findViewById(R.id.rumahSakit);
                    rumahSakit.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] namaKantor = {"RSUD Kabupaten Aceh Besar", "RUMAH SAKIT AL ISLAMIC ACEH HOSPITAL","RUMAH SAKIT IBNU SINA"};
                            String[] desk = {"Jl. Banda Aceh-Medan KM.25 Sinyeu Indrapuri", "JL. Dr.Mr.Moch Hasan no. 88 desa Lampenerut",
                                    "Jalan Banda Aceh-Medan Km 25,5 Kecamatan Indrapuri, Kabupaten Aceh Besar"};
                            int[] gambar = {R.drawable.rsudacehbesar, R.drawable.a, R.drawable.a};
                            String[]sms ={"-","-","-"};
                            String[]mail ={"mailto:rsud.acehbesar@gmail.com","mailto:al.islamichospital@gmail.com","mailto:rsibnusinaabes@gmail.com"};

                            double[] lat = {5.284807, 5.518459, 5.408688};
                            double []lang={95.631837, 95.329763, 95.447210};

                            String []web = {"-","-","-"};
                            String[]tel = {"tel:06518070165","tel:06517559888","tel:06518070469"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);

                        }
                    });

                    ImageView kantorPolisi = (ImageView) findViewById(R.id.kantorPolisi);
                    kantorPolisi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] namaKantor = {"Kantor Polisi Sektor Ingin Jaya"};
                            String[] desk = {"Lambaro Kabupaten Aceh Besar Aceh Indonesia"};
                            int[] gambar = {R.drawable.b,};
                            String[]sms ={"-",};
                            String[]mail ={"-"};

                            double[] lat = {5.579462, };
                            double []lang={95.348918, };

                            String []web = {"-"};
                            String[]tel = {"-"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView damkar = (ImageView) findViewById(R.id.damkar);
                    damkar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView pmi = (ImageView) findViewById(R.id.pmi);
                    pmi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView pln = (ImageView) findViewById(R.id.pln);
                    pln.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView sar = (ImageView) findViewById(R.id.sar);
                    sar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView bpbd = (ImageView) findViewById(R.id.bpbd);
                    bpbd.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView ppwh = (ImageView) findViewById(R.id.ppwh);
                    ppwh.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView pemerintah = (ImageView) findViewById(R.id.pemerintah);
                    pemerintah.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });
                }

                else if (kabkot==2){ //Sabang

                    ImageView rumahSakit = (ImageView) findViewById(R.id.rumahSakit);
                    rumahSakit.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);

                        }
                    });

                    ImageView kantorPolisi = (ImageView) findViewById(R.id.kantorPolisi);
                    kantorPolisi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView damkar = (ImageView) findViewById(R.id.damkar);
                    damkar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView pmi = (ImageView) findViewById(R.id.pmi);
                    pmi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView pln = (ImageView) findViewById(R.id.pln);
                    pln.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView sar = (ImageView) findViewById(R.id.sar);
                    sar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView bpbd = (ImageView) findViewById(R.id.bpbd);
                    bpbd.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView ppwh = (ImageView) findViewById(R.id.ppwh);
                    ppwh.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView pemerintah = (ImageView) findViewById(R.id.pemerintah);
                    pemerintah.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

                ImageView rumahSakit = (ImageView) findViewById(R.id.rumahSakit);
                rumahSakit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                        String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                        String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                        int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                        String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                        String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                        double[] lat = {5.579462, 5.564446, 5.565996};
                        double []lang={95.348918, 95.325893, 95.336772};

                        String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                        String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                        next.putExtra("tel",tel);
                        next.putExtra("namaKantor", namaKantor);
                        next.putExtra("gambar", gambar);
                        next.putExtra("desk", desk);
                        next.putExtra("sms",sms);
                        next.putExtra("lat",lat);
                        next.putExtra("lang",lang);
                        next.putExtra("web",web);
                        next.putExtra("mail",mail);
                        startActivity(next);

                    }
                });

                ImageView kantorPolisi = (ImageView) findViewById(R.id.kantorPolisi);
                kantorPolisi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                        String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                        String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                        int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                        String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                        String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                        double[] lat = {5.579462, 5.564446, 5.565996};
                        double []lang={95.348918, 95.325893, 95.336772};

                        String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                        String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                        next.putExtra("tel",tel);
                        next.putExtra("namaKantor", namaKantor);
                        next.putExtra("gambar", gambar);
                        next.putExtra("desk", desk);
                        next.putExtra("sms",sms);
                        next.putExtra("lat",lat);
                        next.putExtra("lang",lang);
                        next.putExtra("web",web);
                        next.putExtra("mail",mail);
                        startActivity(next);
                    }
                });

                ImageView damkar = (ImageView) findViewById(R.id.damkar);
                damkar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                        String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                        String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                        int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                        String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                        String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                        double[] lat = {5.579462, 5.564446, 5.565996};
                        double []lang={95.348918, 95.325893, 95.336772};

                        String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                        String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                        next.putExtra("tel",tel);
                        next.putExtra("namaKantor", namaKantor);
                        next.putExtra("gambar", gambar);
                        next.putExtra("desk", desk);
                        next.putExtra("sms",sms);
                        next.putExtra("lat",lat);
                        next.putExtra("lang",lang);
                        next.putExtra("web",web);
                        next.putExtra("mail",mail);
                        startActivity(next);
                    }
                });

                ImageView pmi = (ImageView) findViewById(R.id.pmi);
                pmi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                        String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                        String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                        int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                        String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                        String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                        double[] lat = {5.579462, 5.564446, 5.565996};
                        double []lang={95.348918, 95.325893, 95.336772};

                        String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                        String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                        next.putExtra("tel",tel);
                        next.putExtra("namaKantor", namaKantor);
                        next.putExtra("gambar", gambar);
                        next.putExtra("desk", desk);
                        next.putExtra("sms",sms);
                        next.putExtra("lat",lat);
                        next.putExtra("lang",lang);
                        next.putExtra("web",web);
                        next.putExtra("mail",mail);
                        startActivity(next);
                    }
                });

                ImageView pln = (ImageView) findViewById(R.id.pln);
                pln.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                        String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                        String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                        int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                        String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                        String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                        double[] lat = {5.579462, 5.564446, 5.565996};
                        double []lang={95.348918, 95.325893, 95.336772};

                        String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                        String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                        next.putExtra("tel",tel);
                        next.putExtra("namaKantor", namaKantor);
                        next.putExtra("gambar", gambar);
                        next.putExtra("desk", desk);
                        next.putExtra("sms",sms);
                        next.putExtra("lat",lat);
                        next.putExtra("lang",lang);
                        next.putExtra("web",web);
                        next.putExtra("mail",mail);
                        startActivity(next);
                    }
                });

                ImageView sar = (ImageView) findViewById(R.id.sar);
                sar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                        String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                        String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                        int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                        String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                        String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                        double[] lat = {5.579462, 5.564446, 5.565996};
                        double []lang={95.348918, 95.325893, 95.336772};

                        String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                        String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                        next.putExtra("tel",tel);
                        next.putExtra("namaKantor", namaKantor);
                        next.putExtra("gambar", gambar);
                        next.putExtra("desk", desk);
                        next.putExtra("sms",sms);
                        next.putExtra("lat",lat);
                        next.putExtra("lang",lang);
                        next.putExtra("web",web);
                        next.putExtra("mail",mail);
                        startActivity(next);
                    }
                });

                ImageView bpbd = (ImageView) findViewById(R.id.bpbd);
                bpbd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                        String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                        String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                        int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                        String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                        String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                        double[] lat = {5.579462, 5.564446, 5.565996};
                        double []lang={95.348918, 95.325893, 95.336772};

                        String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                        String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                        next.putExtra("tel",tel);
                        next.putExtra("namaKantor", namaKantor);
                        next.putExtra("gambar", gambar);
                        next.putExtra("desk", desk);
                        next.putExtra("sms",sms);
                        next.putExtra("lat",lat);
                        next.putExtra("lang",lang);
                        next.putExtra("web",web);
                        next.putExtra("mail",mail);
                        startActivity(next);
                    }
                });

                ImageView ppwh = (ImageView) findViewById(R.id.ppwh);
                ppwh.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                        String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                        String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                        int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                        String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                        String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                        double[] lat = {5.579462, 5.564446, 5.565996};
                        double []lang={95.348918, 95.325893, 95.336772};

                        String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                        String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                        next.putExtra("tel",tel);
                        next.putExtra("namaKantor", namaKantor);
                        next.putExtra("gambar", gambar);
                        next.putExtra("desk", desk);
                        next.putExtra("sms",sms);
                        next.putExtra("lat",lat);
                        next.putExtra("lang",lang);
                        next.putExtra("web",web);
                        next.putExtra("mail",mail);
                        startActivity(next);
                    }
                });

                ImageView pemerintah = (ImageView) findViewById(R.id.pemerintah);
                pemerintah.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                        String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                        String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                        int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                        String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                        String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                        double[] lat = {5.579462, 5.564446, 5.565996};
                        double []lang={95.348918, 95.325893, 95.336772};

                        String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};

                        String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                        next.putExtra("tel",tel);
                        next.putExtra("namaKantor", namaKantor);
                        next.putExtra("gambar", gambar);
                        next.putExtra("desk", desk);
                        next.putExtra("sms",sms);
                        next.putExtra("lat",lat);
                        next.putExtra("lang",lang);
                        next.putExtra("web",web);
                        next.putExtra("mail",mail);

                        startActivity(next);
                    }
                });
            }
        });
    }
}
