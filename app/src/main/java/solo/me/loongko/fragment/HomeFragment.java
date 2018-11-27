package solo.me.loongko.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import solo.me.loongko.adapter.HomeAdapter;
import solo.me.loongko.bean.HomeValue;
import solo.me.loongko.solo.R;


public class HomeFragment extends Fragment {

    private View view;
    private static final String KEY = "title";


    private RecyclerView recyclerView;

    private List<HomeValue> homeValue;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_home, container, false);


        recyclerView = view.findViewById(R.id.id_article_recyclerview);
        HomeAdapter homeAdapter = new HomeAdapter(homeValue);
        recyclerView.setAdapter(homeAdapter);
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event

    public static HomeFragment newInstance(String str) {

        Bundle args = new Bundle();

        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);
        return fragment;
    }

}
