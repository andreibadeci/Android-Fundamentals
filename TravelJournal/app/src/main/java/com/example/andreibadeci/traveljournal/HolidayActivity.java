package com.example.andreibadeci.traveljournal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HolidayActivity extends AppCompatActivity {

    private RecyclerView mRecycleViewHoliday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.holiday);

        initView();
    }

    private void initView() {
        mRecycleViewHoliday = findViewById(R.id.recycle_view_holiday);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecycleViewHoliday.setLayoutManager(layoutManager);
        HolidayAdapter holidayAdapter = new HolidayAdapter(getHoliday());
        mRecycleViewHoliday.setAdapter(holidayAdapter);
    }

    private List<Holiday> getHoliday() {
        List<Holiday> holidays = new ArrayList<>();
        Holiday holiday1 = new Holiday("Holiday 2017", "Islands", "https://i.imgur.com/SXqg4.jpg");
        Holiday holiday2 = new Holiday("Autumn 2017", "Rome", "https://i.imgur.com/vOyzK6e.jpg");
        Holiday holiday3 = new Holiday("Summer 2017", "London", "https://i.imgur.com/z0zGuD7.jpg");
        Holiday holiday4 = new Holiday("Winter 2017", "Paris", "https://i.imgur.com/RBsDGcp.jpg");
        Holiday holiday5 = new Holiday("Spring 2018", "San Francisco", "https://i.imgur.com/PIVYkYM.jpg");
        Holiday holiday6 = new Holiday("Summer 2018", "Madrid", "https://i.imgur.com/wPoZLAr.jpg");
        Holiday holiday7 = new Holiday("Autumn 2018", "Florence", "https://i.imgur.com/8bkm0bE.jpg");
        Holiday holiday8 = new Holiday("Winter 2018", "Oslo", "https://i.imgur.com/oT73IGQ.jpg");
        Holiday holiday9 = new Holiday("Spring 2019", "Aachen", "https://i.imgur.com/SUBatOm.jpg");
        Holiday holiday10 = new Holiday("Summer 2019", "Seville", "https://i.imgur.com/B8GAz2e.jpg");
        Holiday holiday11 = new Holiday("Autumn 2019", "Krakow", "https://i.imgur.com/7xT8rEE.jpg");
        holidays.add(holiday1);
        holidays.add(holiday2);
        holidays.add(holiday3);
        holidays.add(holiday4);
        holidays.add(holiday5);
        holidays.add(holiday6);
        holidays.add(holiday7);
        holidays.add(holiday8);
        holidays.add(holiday9);
        holidays.add(holiday10);
        holidays.add(holiday11);
        return holidays;
    }

}
