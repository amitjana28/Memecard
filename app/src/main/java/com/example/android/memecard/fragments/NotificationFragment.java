package com.example.android.memecard.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.memecard.R;
import com.example.android.memecard.adapters.FragmentAdapter;
import com.google.android.material.tabs.TabLayout;


public class NotificationFragment extends Fragment {

//    TabLayout tabLayout;
    ViewPager viewPager;

    public NotificationFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notification, container, false);

        viewPager = view.findViewById(R.id.viewPager);
        viewPager.setAdapter(new FragmentAdapter(getFragmentManager()));
//
//        tabLayout = view.findViewById(R.id.tabLayout);
//        tabLayout.setupWithViewPager(viewPager);

        return view;
    }
}