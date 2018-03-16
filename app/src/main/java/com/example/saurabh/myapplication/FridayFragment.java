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
public class FridayFragment extends Fragment {


    public FridayFragment() {
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
        titles.add(new Title("Internet Tech. & Network Management", "IT-6001 L ALL", "Jayesh Surana", "08:00-09:00"));
        titles.add(new Title("Web Technology", "IT-6005 L ALL", "Rupesh Nagendra", "09:00-10:00"));
        titles.add(new Title("Software Engineering", "IT-6002 L ALL", "AS", "10:00-11:00"));
        titles.add(new Title("SPORTS", "SPORTS", "SPORTS", "11:00-12:00"));
        titles.add(new Title("Computer Graphics & Multimedia", "IT-6003 T B1,B2", "NS", "12:30-01:30","Web Technology", "IT-6005 T \nB3,B4", "Rupesh Nagendra", "12:30-01:30",1));
        titles.add(new Title("Computer Graphics & Multimedia", " IT-6003 P B1 ", "NS", "01:30-03:30","Compiler\n Design", " IT-6004 P B2 ", "Sujit\n Badodiya", "01:30-03:30","Minor\n Project", "IT-6006 P\n B3", "AM", "01:30-03:30 \n","Software Engineering", " IT-6002 P B4 ", "Anurag \nGolwalkar", "01:30-03:30",2));

        TitleAdapter adapter = new TitleAdapter(getActivity(), titles);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
