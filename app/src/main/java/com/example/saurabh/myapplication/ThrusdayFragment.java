package com.example.saurabh.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThrusdayFragment extends Fragment {


    public ThrusdayFragment() {
        // Required empty public constructor
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_all, container, false);

        ArrayList<Title> titles = new ArrayList<Title>();
        titles.add(new Title("Compiler Design", "IT-6004 L ALL", "Sujit Badodiya", "08:00-09:00"));
        titles.add(new Title("Computer Graphics & Multimedia", "IT-6003 L ALL", "NS", "09:00-10:00"));
        titles.add(new Title("Software Engineering", "IT-6002 L ALL", "Anurag Golwalkar", "10:00-11:00"));
        titles.add(new Title("Internet Tech. & Network Management", "IT-6001 L ALL", "Jayesh Surana", "11:00-12:00"));
        titles.add(new Title("Internet Tech. & Network Management", "IT-6001 T B1,B2", "Jayesh Surana", "12:30-01:30","Computer Graphics & Multimedia", "IT-6003 T \nB3,B4", "NS", "12:30-01:30",1));
        titles.add(new Title("Web Technology", "IT-6005 L ALL", "Rupesh Nagendra", "01:30-02:30"));
        titles.add(new Title("SPORTS", "SPORTS", "SPORTS", "02:30-03:30"));

        TitleAdapter adapter = new TitleAdapter(getActivity(), titles);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
