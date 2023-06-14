package com.example.contact_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class contactAppAdapter extends RecyclerView.Adapter<contactAppAdapter.ViewHolder> {
    ArrayList<contactModel> arrayList;
    public contactAppAdapter(ArrayList<contactModel> arrayList){
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_card,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.number.setText(arrayList.get(position).number);
        holder.name.setText(arrayList.get(position).name);

    }

    @Override
    public int getItemCount() {
        return arrayList.isEmpty() ? 0:arrayList.size() ;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView name, number;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgContact);
            name = itemView.findViewById(R.id.txtName);
            number = itemView.findViewById(R.id.txtNumber);
        }
    }
}
