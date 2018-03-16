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
public class MondayFragment extends Fragment {


    public MondayFragment() {
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
        titles.add(new Title("Software Engineering ", "IT-6002 L ALL", "Anurag Golwalkar ", "08:00-09:00"));
        titles.add(new Title("Compiler Design", "IT-6004 L ALL", "Sujit Badodiya", "09:00-10:00"));
       // titles.add(new Title("SI/ED", "IT-6008/IT-6007 P B1,B2/B3,B4", "RN/NP", "10:00-12:00"));
        //titles.add(new Title("WT/ITNM", "IT-6005/IT-6001 T B1,B2/B3,B4", "RN/JS", "12:30-01:30",1));
        titles.add(new Title("Startup Lectures", "IT-6008 P \nB1,B2", "Rupesh Nagendra", "10:00-12:00","Entreprenuership Development","IT-6007 P B3,B4","Neha Purohit","10:00-12:00",1));
        titles.add(new Title("Web Technology", "IT-6005 T \nB1,B2", "Rupesh Nagendra", "12:30-01:30\n","Internet Tech. & Network Management ","IT-6001 T B3,B4","Jayesh Surana","12:30-01:30",1));
        //titles.add(new Title("SE/CGM/CD/Minor Project", "IT-6002/IT-6003/IT-6004/IT-6006 P B1/B2/B3/B4", "AS/NS/Sujit Badodiya/AM", "01:30-03:30"));
        titles.add(new Title("Software Engineering", " IT-6002 P B1 ", "Anurag Golwalkar", "01:30-03:30","Computer Graphics & Multimedia", " IT-6003 P B2 ", "NS", "01:30-03:30","Compiler \nDesign", " IT-6004 P B3 ", "Sujit\n Badodiya", "01:30-03:30", "Minor\n Project", " IT-6006 P \nB4", "AM", "01:30-03:30\n",2));

        TitleAdapter adapter = new TitleAdapter(getActivity(), titles);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
