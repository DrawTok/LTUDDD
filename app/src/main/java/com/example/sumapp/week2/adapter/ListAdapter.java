package com.example.sumapp.week2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import com.example.sumapp.R;

import java.util.List;

public class ListAdapter extends BaseAdapter {

    List<String> list;
    final Context context;

    public ListAdapter(Context context, List<String> list)
    {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return 0;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.item, null);

        TextView tvTitle = convertView.findViewById(R.id.tvItem);
        String title = list.get(position);
        tvTitle.setText(title);

        return convertView;
    }
}
