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
import com.example.task.model.teamodel;

import java.util.List;

public class mycustomadapter2 extends RecyclerView.Adapter<mycustomadapter2.teaviewholder> {
    List<teamodel>  teamodelList;
    Context context;

    public mycustomadapter2(List<teamodel> teamodelList) {
        this.teamodelList = teamodelList;
        this.context = context;
    }

    @NonNull
    @Override
    public mycustomadapter2.teaviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.iteam_layout3,parent,false);
        return new teaviewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull mycustomadapter2.teaviewholder holder, int position) {
        teamodel teamodel=teamodelList.get(position);

        holder.searchimage.setImageResource(teamodel.getSearchimage());




    }

    @Override
    public int getItemCount() {
        return teamodelList.size();
    }
    public static class teaviewholder extends RecyclerView.ViewHolder{

        ImageView searchimage;

        public teaviewholder(@NonNull View itemView) {

            super(itemView);

            searchimage=itemView.findViewById(R.id.searchimage);
        }
    }
}
