package com.example.sumapp.week3.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sumapp.R;
import com.example.sumapp.week3.Bank;

import java.util.List;

public class ListAdapter extends BaseAdapter {

    List<Bank> list;
    final Context context;

    public ListAdapter(Context context, List<Bank> list)
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

        TextView tvName, tvFounding;
        ImageView imvImage;

        convertView = LayoutInflater.from(context).inflate(R.layout.item_bank, null);
        tvName = convertView.findViewById(R.id.tvBankName);
        tvFounding = convertView.findViewById(R.id.tvFounding);
        imvImage = convertView.findViewById(R.id.imvLogo);

        Bank bank = list.get(position);
        tvName.setText(bank.getBankName());
        tvFounding.setText(bank.getFounding());
        imvImage.setImageResource(bank.getImage());

        return convertView;
    }
}
