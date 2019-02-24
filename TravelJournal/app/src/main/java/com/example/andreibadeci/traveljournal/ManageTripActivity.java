package com.example.andreibadeci.traveljournal;

import android.app.DatePickerDialog;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.Calendar;

public class ManageTripActivity extends AppCompatActivity {

    private DatePickerDialog mDatePicker;
    private Button mBtnGallery;
    private Button mBtnCamera;
    private Button mBtnSave;

    private EditText mName;
    private EditText mPlace;
    private RadioGroup mRadioGroupType;
    private SeekBar mSeekBarPrice;
    private Button mBtnStartDate;
    private Button mBtnEndDate;
    private RatingBar mRatingBar;

    private Uri mUriImage;
    private Bitmap mBitmapImage;
    private boolean mIsImageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_trip);

        mName = findViewById(R.id.edit_text_name);
        mPlace = findViewById(R.id.edit_text_place);
        mRadioGroupType = findViewById(R.id.radio_group_trip);
        mSeekBarPrice = findViewById(R.id.seek_bar_price);
        mBtnStartDate = findViewById(R.id.btn_start_date);
        mBtnEndDate = findViewById(R.id.btn_end_date);
        mRatingBar = findViewById(R.id.rating_bar_trip);
        mBtnGallery = findViewById(R.id.btn_gallery);
        mBtnCamera = findViewById(R.id.btn_camera);
        mBtnSave = findViewById(R.id.btn_save);

    }

    public void btnShowDatePicker(View viewTrip) {

        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        final Button btn = findViewById(viewTrip.getId());

        DatePickerDialog.OnDateSetListener dateSetListener =
                new DatePickerDialog.OnDateSetListener() {
                    public void onDateSet(DatePicker view, int year, int month, int day) {
                        btn.setText(view.getDayOfMonth() + "/" + view.getMonth() + "/" + view.getYear());
                        Toast.makeText(ManageTripActivity.this, "selected date is " + view.getYear() +
                                " / " + (view.getMonth()+1) +
                                " / " + view.getDayOfMonth(), Toast.LENGTH_SHORT).show();
                    }
                };

        mDatePicker = new DatePickerDialog(ManageTripActivity.this, dateSetListener, year, month, day);
    }

}
