package com.example.saurabh.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by main on 18/2/18.
 */

public class TitleAdapter extends ArrayAdapter<Title> {
    public TitleAdapter(Context context, ArrayList<Title> titles) {
        super(context, 0, titles);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        Title currentTitle = getItem(position);

        if(currentTitle.getLtp() == 0) {
            //if(listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            //}

            TextView subject = (TextView) listItemView.findViewById(R.id.subject);
            subject.setText(currentTitle.getSubjectName());

            TextView desc = (TextView) listItemView.findViewById(R.id.desc);
            desc.setText(currentTitle.getDesc());

            TextView faculty = (TextView) listItemView.findViewById(R.id.faculty);
            faculty.setText(currentTitle.getFacultyName());

            TextView time = (TextView) listItemView.findViewById(R.id.time);
            time.setText(currentTitle.getTime());

            return listItemView;
        }



        else if(currentTitle.getLtp() == 1) {
            //if(listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_tutorial, parent, false);
            //}
            //1st block
            TextView subject1 = (TextView) listItemView.findViewById(R.id.subject_tut_1);
            subject1.setText(currentTitle.getSubjectName1());

            TextView desc1 = (TextView) listItemView.findViewById(R.id.desc_tut_1);
            desc1.setText(currentTitle.getDesc1());

            TextView faculty1 = (TextView) listItemView.findViewById(R.id.faculty_tut_1);
            faculty1.setText(currentTitle.getFacultyName1());

            TextView time1 = (TextView) listItemView.findViewById(R.id.time_tut_1);
            time1.setText(currentTitle.getTime1());


            //2nd block
            TextView subject2 = (TextView) listItemView.findViewById(R.id.subject_tut_2);
            subject2.setText(currentTitle.getSubjectName2());

            TextView desc2 = (TextView) listItemView.findViewById(R.id.desc_tut_2);
            desc2.setText(currentTitle.getDesc2());

            TextView faculty2 = (TextView) listItemView.findViewById(R.id.faculty_tut_2);
            faculty2.setText(currentTitle.getFacultyName2());

            TextView time2 = (TextView) listItemView.findViewById(R.id.time_tut_2);
            time2.setText(currentTitle.getTime2());

            return listItemView;
        }

        //if(listItemView == null && currentTitle.getLtp() == 2) {
        else {
            //if(listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_practical, parent, false);
            //}
            //1st block
            TextView subject1 = (TextView) listItemView.findViewById(R.id.subject_prac_1);
            subject1.setText(currentTitle.getSubjectName1());

            TextView desc1 = (TextView) listItemView.findViewById(R.id.desc_prac_1);
            desc1.setText(currentTitle.getDesc1());

            TextView faculty1 = (TextView) listItemView.findViewById(R.id.faculty_prac_1);
            faculty1.setText(currentTitle.getFacultyName1());

            TextView time1 = (TextView) listItemView.findViewById(R.id.time_prac_1);
            time1.setText(currentTitle.getTime1());


            //2nd block
            TextView subject2 = (TextView) listItemView.findViewById(R.id.subject_prac_2);
            subject2.setText(currentTitle.getSubjectName2());

            TextView desc2 = (TextView) listItemView.findViewById(R.id.desc_prac_2);
            desc2.setText(currentTitle.getDesc2());

            TextView faculty2 = (TextView) listItemView.findViewById(R.id.faculty_prac_2);
            faculty2.setText(currentTitle.getFacultyName2());

            TextView time2 = (TextView) listItemView.findViewById(R.id.time_prac_2);
            time2.setText(currentTitle.getTime2());

            //3rd block
            TextView subject3 = (TextView) listItemView.findViewById(R.id.subject_prac_3);
            subject3.setText(currentTitle.getSubjectName3());

            TextView desc3 = (TextView) listItemView.findViewById(R.id.desc_prac_3);
            desc3.setText(currentTitle.getDesc3());

            TextView faculty3 = (TextView) listItemView.findViewById(R.id.faculty_prac_3);
            faculty3.setText(currentTitle.getFacultyName3());

            TextView time3 = (TextView) listItemView.findViewById(R.id.time_prac_3);
            time3.setText(currentTitle.getTime3());


            //4th block
            TextView subject4 = (TextView) listItemView.findViewById(R.id.subject_prac_4);
            subject4.setText(currentTitle.getSubjectName4());

            TextView desc4 = (TextView) listItemView.findViewById(R.id.desc_prac_4);
            desc4.setText(currentTitle.getDesc4());

            TextView faculty4 = (TextView) listItemView.findViewById(R.id.faculty_prac_4);
            faculty4.setText(currentTitle.getFacultyName4());

            TextView time4 = (TextView) listItemView.findViewById(R.id.time_prac_4);
            time4.setText(currentTitle.getTime4());

            return listItemView;
        }
    }
}
