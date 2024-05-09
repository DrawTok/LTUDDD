package com.example.sumapp.week5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sumapp.R;


import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private final List<User> users;

    public UserAdapter(List<User> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = users.get(position);
        holder.tvFullName.setText(user.getFullName());
        holder.tvId.setText(String.valueOf(user.getIdUser()));
        holder.tvRole.setText(user.getRole());
        holder.tvEmail.setText(user.getEmail());
        holder.tvBirthday.setText(user.getBirthDay());



    }

    @Override
    public int getItemCount() {
        if(users != null){
            return users.size();
        }
        return 0;
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {
        TextView tvId, tvBirthday, tvFullName, tvRole, tvEmail;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            tvId = itemView.findViewById(R.id.tvId);
            tvFullName = itemView.findViewById(R.id.tvFullName);
            tvBirthday = itemView.findViewById(R.id.tvBirthday);
            tvRole = itemView.findViewById(R.id.tvRole);
            tvEmail = itemView.findViewById(R.id.tvEmail);
        }
    }
}
