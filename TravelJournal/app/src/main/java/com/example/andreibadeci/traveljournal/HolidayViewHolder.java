package com.example.andreibadeci.traveljournal;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HolidayViewHolder extends RecyclerView.ViewHolder {

    public ImageView mImageViewPicture;
    public TextView mTextViewName;
    public TextView mTextViewPlace;

    public HolidayViewHolder(@NonNull View itemView) {
        super(itemView);

        mImageViewPicture = itemView.findViewById(R.id.image_view_picture);
        mTextViewName = itemView.findViewById(R.id.text_view_name);
        mTextViewPlace = itemView.findViewById(R.id.text_view_place);
    }
}
