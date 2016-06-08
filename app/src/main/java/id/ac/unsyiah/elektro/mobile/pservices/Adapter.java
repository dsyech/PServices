package id.ac.unsyiah.elektro.mobile.pservices;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter implements Filterable {
    Context c;
    ArrayList<Kantor> kantors;
    CustomFilter filter;
    ArrayList<Kantor> filterList;

    public Adapter(Context c,ArrayList<Kantor>kantors){
        this.c=c;
        this.kantors=kantors;
        this.filterList=kantors;
    }

    @Override
    public int getCount() {
        return kantors.size();
    }

    @Override
    public Object getItem(int pos) {
        return kantors.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return 0;
    }

    @Override
    public View getView(final int pos, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView==null){
            convertView=inflater.inflate(R.layout.model,parent,false);
        }
        //tampilan
        ImageView img= (ImageView) convertView.findViewById(R.id.imgModel);
        TextView tv = (TextView) convertView.findViewById(R.id.namaModel);
        TextView tv2 = (TextView) convertView.findViewById(R.id.deskModel);

        //set data
        img.setImageResource(kantors.get(pos).getImg());
        tv.setText(kantors.get(pos).getNama());
        tv2.setText(kantors.get(pos).getDesk());

        return convertView;
    }

    @Override
    public Filter getFilter() {
        if(filter==null){
            filter=new CustomFilter();
        }
        return filter;
    }

    class CustomFilter extends Filter {

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results = new FilterResults();
            if (constraint !=null & constraint.length()>0){
                constraint=constraint.toString().toUpperCase();

                ArrayList<Kantor> filters=new ArrayList<Kantor>();

                for(int i=0;i<filterList.size();i++){
                    if (filterList.get(i).getNama().toUpperCase().contains(constraint)){
                        Kantor k = new Kantor(filterList.get(i).getNama(), filterList.get(i).getImg(),filterList.get(i).getDesk());
                        filters.add(k);
                    }
                }
                results.count=filters.size();
                results.values=filters;
            }
            else{
                results.count=filterList.size();
                results.values=filterList;
            }

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            kantors= (ArrayList<Kantor>) results.values;
            notifyDataSetChanged();
        }
    }
}
