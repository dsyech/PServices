package id.ac.unsyiah.elektro.mobile.pservices;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
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

        Intent next = getIntent();
        final String[] namaKantor = next.getStringArrayExtra("namaKantor");
        final int [] gambar = next.getIntArrayExtra("gambar");
        final String[] desk = next.getStringArrayExtra("desk");
        final String [] sms = next.getStringArrayExtra("sms");
        final String [] mail = next.getStringArrayExtra("mail");
        final double [] lat = next.getDoubleArrayExtra("lat");
        final double [] lang = next.getDoubleArrayExtra("lang");
        final String [] web = next.getStringArrayExtra("web");
        final String[]tel = next.getStringArrayExtra("tel");

        SearchView searchView = (SearchView) findViewById(R.id.searchView);
        ListView listView = (ListView) findViewById(R.id.listView);

        final Adapter adapter = new Adapter(this, getKantors());
        listView.setAdapter(adapter);

listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
        Intent next = new Intent(getApplicationContext(), DetailActivity.class);
        next.putExtra("pos",pos);
        next.putExtra("namaKantor",namaKantor);
        next.putExtra("desk",desk);
        next.putExtra("gambar",gambar);
        next.putExtra("sms",sms);
        next.putExtra("mail",mail);
        next.putExtra("lat",lat);
        next.putExtra("lang",lang);
        next.putExtra("web",web);
        next.putExtra("tel",tel);
        startActivity(next);
    }
});


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

    public ArrayList<Kantor> getKantors(){
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
