package id.ac.unsyiah.elektro.mobile.pservices;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Alchusuvie on 5/18/2016.
 */
public class KantorActivity extends AppCompatActivity {
    Intent next = getIntent();
    String[] namaKantor = next.getStringArrayExtra("namaKantor");
    int [] gambar = next.getIntArrayExtra("gambar");
    String [] desk = next.getStringArrayExtra("desk");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kantor);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar);




        SearchView searchView = (SearchView) findViewById(R.id.searchView);
        ListView listView = (ListView) findViewById(R.id.listView);

        final Adapter adapter = new Adapter(this, getKantors());
        listView.setAdapter(adapter);




        }
    private ArrayList<Kantor> getKantors(){
        ArrayList<Kantor> kantors = new ArrayList<Kantor>();
        Kantor k;

        for (int i=0;i<namaKantor.length;i++){
            k =new Kantor(namaKantor[i], gambar[i], desk[i]);
            kantors.add(k);
        }
        return kantors;
    }
    }