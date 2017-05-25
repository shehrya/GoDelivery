package com.lushapps.godelivery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.lushapps.carrycome.R;

import java.util.List;


public class JobsListAdapter extends BaseAdapter {

    Context context;

    private static LayoutInflater inflater = null;



    public JobsListAdapter(Context context, List<String> productNamesList, List<String> distanceList, List<String> rateList) {
        // TODO Auto-generated constructor stub

        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        if (vi == null)
            vi = inflater.inflate(R.layout.row, null);




        return vi;
    }



}
