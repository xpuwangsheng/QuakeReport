package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by xpuwangsheng on 1/30/17.
 */

public class MyAdapter extends ArrayAdapter<My> {
    public MyAdapter(Activity context, ArrayList<My> my){
        super(context, 0, my);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,parent,false);
        }
        My currentMy = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.tv_Title);
        titleTextView.setText(currentMy.getmTitle());

        TextView authorTextView = (TextView) listItemView.findViewById(R.id.tv_Author);
        authorTextView.setText(currentMy.getmAuthor());

        return listItemView;
    }
}
