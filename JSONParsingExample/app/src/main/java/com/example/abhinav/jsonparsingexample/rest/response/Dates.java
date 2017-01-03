package com.example.abhinav.jsonparsingexample.rest.response;

/**
 * Created by abhinav on 1/1/17.
 */
import android.os.Parcel;
import android.os.Parcelable;

public class Dates implements Parcelable {
    private String maximum;
    private String minimum;

    /**
     * @return The maximum
     */
    public String getMaximum() {
        return maximum;
    }

    /**
     * @param maximum The maximum
     */
    public void setMaximum(String maximum) {
        this.maximum = maximum;
    }

    /**
     * @return The minimum
     */
    public String getMinimum() {
        return minimum;
    }

    /**
     * @param minimum The minimum
     */
    public void setMinimum(String minimum) {
        this.minimum = minimum;
    }

    /* ## Parcelable Implementation ## */
    protected Dates(Parcel in) {
        maximum = in.readString();
        minimum = in.readString();
    }

    public static final Creator<Dates> CREATOR = new Creator<Dates>() {
        @Override
        public Dates createFromParcel(Parcel in) {
            return new Dates(in);
        }

        @Override
        public Dates[] newArray(int size) {
            return new Dates[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(maximum);
        parcel.writeString(minimum);
    }
}
