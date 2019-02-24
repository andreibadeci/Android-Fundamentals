package com.example.andreibadeci.traveljournal;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

public class HolidayAdapter extends RecyclerView.Adapter<HolidayViewHolder> {

    private List<Holiday> mHoliday;

    public HolidayAdapter(List<Holiday> mHoliday) {
        this.mHoliday = mHoliday;
    }

    @NonNull
    @Override
    public HolidayViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View holidayView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.holiday_item, viewGroup, false);
        return new HolidayViewHolder(holidayView);
    }

    @Override
    public void onBindViewHolder(@NonNull HolidayViewHolder holidayViewHolder, int i) {
        Holiday holiday = mHoliday.get(i);
        holidayViewHolder.mTextViewName.setText(holiday.getmName());
        holidayViewHolder.mTextViewPlace.setText(holiday.getmPlace());
        Picasso.get().load(holiday.getmPicture()).into(holidayViewHolder.mImageViewPicture);
    }

    @Override
    public int getItemCount() {
        return mHoliday.size();
    }
}
