package com.example.sumapp.week4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.sumapp.R;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class CatAdapter extends RecyclerView.Adapter<CatAdapter.CatViewHolder> {

    private final Context context;
    private final List<Cat> cats;

    public CatAdapter(Context context, List<Cat> cats) {
        this.context = context;
        this.cats = cats;
    }

    @NonNull
    @Override
    public CatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cat, parent, false);
        return new CatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CatAdapter.CatViewHolder holder, int position) {
        Cat cat = cats.get(position);
        holder.tvName.setText(cat.getName());
        holder.tvPrice.setText(String.format("%s$", cat.getPrice()));
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            LocalDateTime dateTime = LocalDateTime.parse(cat.getBirthday(), DateTimeFormatter.ISO_DATE_TIME);
            String outputDate = dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            holder.tvBirthday.setText(String.format("Birthday: %s", outputDate));
        }
        Glide.with(context).load(cat.getImage()).into(holder.imvImage);
    }

    @Override
    public int getItemCount() {
        if(cats != null){
            return cats.size();
        }
        return 0;
    }

    public static class CatViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvBirthday, tvPrice;
        ImageView imvImage;
        public CatViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tvName);
            tvBirthday = itemView.findViewById(R.id.tvBirthday);
            imvImage = itemView.findViewById(R.id.imvCat);
            tvPrice = itemView.findViewById(R.id.tvPrice);
        }
    }
}
