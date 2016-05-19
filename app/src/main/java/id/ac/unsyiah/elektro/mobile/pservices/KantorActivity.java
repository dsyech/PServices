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

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Alchusuvie on 5/18/2016.
 */
public class KantorActivity extends AppCompatActivity {


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

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                adapter.getFilter().filter(newText);
                return false;
            }
        });


        }
    private ArrayList<Kantor> getKantors(){
        Intent next = getIntent();
        String[] namaKantor = next.getStringArrayExtra("namaKantor");
        int [] gambar = next.getIntArrayExtra("gambar");
        String[] desk = next.getStringArrayExtra("desk");
        ArrayList<Kantor> kantors = new ArrayList<Kantor>();
        Kantor k;

        for (int i=0;i<namaKantor.length;i++){
            k =new Kantor(namaKantor[i], gambar[i], desk[i]);
            kantors.add(k);
        }
        return kantors;
    }
    }
