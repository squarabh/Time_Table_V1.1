package com.example.saurabh.myapplication;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewpager);

        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tab_layout);

        tabLayout.setupWithViewPager(viewPager);

        int today = Calendar.getInstance().get(Calendar.DAY_OF_WEEK) - 2;

        if (today >= 0 && today < 5) {
            viewPager.setCurrentItem(today);
        }
        else {
            viewPager.setCurrentItem(0);
        }


        /*TextView monday = (TextView) findViewById(R.id.monday);
        monday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mondayIntent = new Intent(MainActivity.this,MondayActivity.class);
                startActivity(mondayIntent);
            }
        });

        TextView tuesday = (TextView) findViewById(R.id.tuesday);
        tuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tuesdayIntent = new Intent(MainActivity.this,TuesdayActivity.class);
                startActivity(tuesdayIntent);
            }
        });*/
    }
}
