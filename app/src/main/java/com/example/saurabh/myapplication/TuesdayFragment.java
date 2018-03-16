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
public class TuesdayFragment extends Fragment {


    public TuesdayFragment() {
        // Required empty public constructor
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_all,container,false);

        ArrayList<Title> titles = new ArrayList<Title>();
        //titles.add(new Title("Minor Project/Software Engineering/Computer Graphics & Multimedia/Compiler Design", "IT-6006/IT-6002/IT-6003/IT-6004 P B1/B2/B3/B4", "AM/Anurag Golwalkar/NS/Sujit Badodiya", "08:00-10:00"));
        titles.add(new Title("Minor \nProject", "IT-6006 P \nB1", "AM", "08:00-10:00\n"," Software Engineering", " IT-6002 P \nB2", "Anurag Golwalkar", "08:00-10:00","Computer Graphics & Multimedia", " IT-6003 P \nB3", "NS", "08:00-10:00","Compiler Design", " IT-6004 P \nB4", "Sujit \nBadodiya", "08:00-10:00",2));
        titles.add(new Title("Entreprenuership \nDevelopment", "IT-6007 P B1,B2", "Neha Purohit", "10:00-12:00","Startup Lectures", "IT-6008 P \nB3,B4", "Rupesh Nagendra", "10:00-12:00",1));
        titles.add(new Title("Compiler \nDesign", "IT-6004 T B1,B2", "Sujit\n Badodiya", "12:30-01:30\n","Software Engineering", "IT-6002 T\n B3,B4", "Anurag\n Golwalkar", "12:30-01:30",1));
        titles.add(new Title("Compiler \n Design", "IT-6004 L ALL", "Sujit\n Badodiya", "01:30-02:30"));
        titles.add(new Title("Computer \nGraphics & Multimedia", "IT-6003 L ALL", "NS", "02:30-03:30"));

        TitleAdapter adapter = new TitleAdapter(getActivity(), titles);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
