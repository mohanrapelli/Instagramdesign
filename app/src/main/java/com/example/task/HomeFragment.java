package com.example.task;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.task.adapter.mycustomadapter;
import com.example.task.model.model1;

import org.intellij.lang.annotations.JdkConstants;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {


    private RecyclerView recyclerView;
    private View v;
    private mycustomadapter mycustomadapter;

    private List<model1> model1List;

    public HomeFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v= inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView=v.findViewById(R.id.recycleview);
        model1List=generateVideoitems();

        mycustomadapter=new mycustomadapter(model1List);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(mycustomadapter);
        return v;

    }
    private List<model1> generateVideoitems(){
        List<model1> models= new ArrayList<>();
models.add(new model1(R.drawable.image1));
        models.add(new model1(R.drawable.image2));
        models.add(new model1(R.drawable.khan));
        models.add(new model1(R.drawable.kohli));
        models.add(new model1(R.drawable.image1));
        models.add(new model1(R.drawable.r));
        models.add(new model1(R.drawable.s));
        models.add(new model1(R.drawable.r));
        return models;
    }

    }