package com.example.task;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.task.adapter.mycustomadapter2;
import com.example.task.model.teamodel;

import java.util.ArrayList;
import java.util.List;

public class SearchFragment extends Fragment {

    private RecyclerView recyclerView2;
    private View v1;
    private mycustomadapter2 mycustomadapter2;

    private List<teamodel> teamodelList;
    private StaggeredGridLayoutManager staggeredGridLayoutManager;

    public SearchFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v1= inflater.inflate(R.layout.fragment_search, container, false);
        recyclerView2 = v1.findViewById(R.id.recycleview2);

        teamodelList=new ArrayList<>();
        mycustomadapter2 = new mycustomadapter2(teamodelList);
        staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, staggeredGridLayoutManager.VERTICAL);
        recyclerView2.setLayoutManager(staggeredGridLayoutManager);
        recyclerView2.setAdapter(mycustomadapter2);
        IntializeDataintoRecycleview();
        return v1;
    }
    private void IntializeDataintoRecycleview() {


        teamodel t1=new teamodel(R.drawable.kohli);
        teamodel t2=new teamodel(R.drawable.gayle);
        teamodel t3=new teamodel(R.drawable.r);
        teamodel t4=new teamodel(R.drawable.khan);
        teamodel t5=new teamodel(R.drawable.bala);
        teamodel t6=new teamodel(R.drawable.image2);
        teamodel t7=new teamodel(R.drawable.kohli);
        teamodel t8=new teamodel(R.drawable.mi);
        teamodel t9=new teamodel(R.drawable.s);
        teamodel ta=new teamodel(R.drawable.image1);
        teamodel tb=new teamodel(R.drawable.bala);
        teamodel tc=new teamodel(R.drawable.s);
        teamodel td=new teamodel(R.drawable.image2);
        teamodel te=new teamodel(R.drawable.r);
        teamodel tf=new teamodel(R.drawable.image1);
        teamodel tg=new teamodel(R.drawable.kohli);
        teamodel th=new teamodel(R.drawable.image2);
        teamodelList.add(t1);
        teamodelList.add(t2);
        teamodelList.add(t3);
        teamodelList.add(t4);
        teamodelList.add(t5);
        teamodelList.add(t6);
        teamodelList.add(t7);
        teamodelList.add(t8);
        teamodelList.add(ta);
        teamodelList.add(tb);
        teamodelList.add(tc);
        teamodelList.add(td);
        teamodelList.add(te);
        teamodelList.add(tf);
        teamodelList.add(tg);
        teamodelList.add(th);


        mycustomadapter2.notifyDataSetChanged();

    }
}