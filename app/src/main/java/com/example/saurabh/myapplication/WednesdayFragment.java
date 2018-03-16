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
public class WednesdayFragment extends Fragment {


    public WednesdayFragment() {
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
        titles.add(new Title("Compiler Design", " IT-6004 P\n B1", "Sujit \nBadodiya", "08:00-10:00","Minor \nProject", "IT-6006 P \nB2", "AM", "08:00-10:00\n","Software Engineering", " IT-6002 P \nB3", "Anurag Golwalkar", "08:00-10:00","Computer Graphics & Multimedia", " IT-6003 P \nB4", "NS", "08:00-10:00",2));
        titles.add(new Title("Web Technology", "IT-6005 L ALL", "RN", "10:00-11:00"));
        titles.add(new Title("LIB", "FREE", "FREE", "11:00-12:00"));
        titles.add(new Title("Software Engineering", "IT-6002 T B1,B2", "Anurag Golwalkar", "12:30-01:30","Compiler \nDesign", "IT-6004 T B3,B4", "Sujit Badodiya", "12:30-01:30",1));
        titles.add(new Title("Computer Graphics & Multimedia", "IT-6003 L ALL", "NS", "01:30-02:30"));
        titles.add(new Title("Internet Tech. & Network Management", "IT-6001 L ALL", "Jayesh Surana", "02:30-03:30"));

        TitleAdapter adapter = new TitleAdapter(getActivity(), titles);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
