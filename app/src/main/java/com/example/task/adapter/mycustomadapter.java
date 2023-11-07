package com.example.task.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task.R;
import com.example.task.model.model1;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.List;

public class mycustomadapter extends RecyclerView.Adapter<mycustomadapter.instaviewholder> {
    List<model1> model1List ;
    Context context;


    public mycustomadapter(List<model1> model1List) {
        this.model1List = model1List;
        this.context = context;
    }

    @NonNull
    @Override
    public mycustomadapter.instaviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new instaviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mycustomadapter.instaviewholder holder, int position) {
        model1 model1=model1List.get(position);

        holder.image.setImageResource(model1.getImage());


    }

    @Override
    public int getItemCount() {
        return model1List.size();
    }
    public static class instaviewholder extends RecyclerView.ViewHolder{

        ImageView image;

        public instaviewholder(@NonNull View itemView) {
            super(itemView);

            image=itemView.findViewById(R.id.image);


        }
    }
}
