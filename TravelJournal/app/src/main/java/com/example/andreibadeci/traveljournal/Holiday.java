package com.example.andreibadeci.traveljournal;

public class Holiday {
    private String mName;
    private String mPlace;
    private String mPicture;

    public Holiday(String mName, String mPlace, String mPicture) {
        this.mName = mName;
        this.mPlace = mPlace;
        this.mPicture = mPicture;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPlace() {
        return mPlace;
    }

    public void setmPlace(String mPlace) {
        this.mPlace = mPlace;
    }

    public String getmPicture() {
        return mPicture;
    }

    public void setmPicture(String mPicture) {
        this.mPicture = mPicture;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "mName='" + mName + '\'' +
                ", mPlace='" + mPlace + '\'' +
                ", mPicture='" + mPicture + '\'' +
                '}';
    }
}
