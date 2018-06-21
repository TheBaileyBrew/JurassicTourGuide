package com.thebaileybrew.jurassictourguide;

import android.os.Parcel;
import android.os.Parcelable;

public class event implements Parcelable{
    private int eventImage;
    private int eventYear;
    private String eventName;
    private String eventPeople;
    private String eventLocation;
    private String eventFilm;
    private String eventDetails;

    public event(int eventImage, int eventYear, String eventName, String eventPeople,
                 String eventLocation, String eventFilm, String eventDetails) {
        this.eventImage = eventImage;
        this.eventYear = eventYear;
        this.eventName = eventName;
        this.eventPeople = eventPeople;
        this.eventLocation = eventLocation;
        this.eventFilm = eventFilm;
        this.eventDetails = eventDetails;
    }

    public event(Parcel parcel) {
        eventImage = parcel.readInt();
        eventName = parcel.readString();
        eventLocation = parcel.readString();
        eventPeople = parcel.readString();
        eventDetails = parcel.readString();
    }

    public int getEventImage() {
        return eventImage;
    }
    public int getEventYear() {
        return eventYear;
    }
    public String getEventDetails() {
        return eventDetails;
    }
    public String getEventFilm() {
        return eventFilm;
    }
    public String getEventLocation() {
        return eventLocation;
    }
    public String getEventName() {
        return eventName;
    }
    public String getEventPeople() {
        return eventPeople;
    }

    /**
     * Describe the kinds of special objects contained in this Parcelable
     * instance's marshaled representation. For example, if the object will
     * include a file descriptor in the output of {@link #writeToParcel(Parcel, int)},
     * the return value of this method must include the
     * {@link #CONTENTS_FILE_DESCRIPTOR} bit.
     *
     * @return a bitmask indicating the set of special object types marshaled
     * by this Parcelable object instance.
     */
    @Override
    public int describeContents() {
        return 0;
    }

    /**
     * Flatten this object in to a Parcel.
     *
     * @param dest  The Parcel in which the object should be written.
     * @param flags Additional flags about how the object should be written.
     *              May be 0 or {@link #PARCELABLE_WRITE_RETURN_VALUE}.
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(eventImage);
        dest.writeInt(eventYear);
        dest.writeString(eventName);
        dest.writeString(eventLocation);
        dest.writeString(eventPeople);
        
        dest.writeString(eventDetails);
    }

    @SuppressWarnings("unused")
    public final static Parcelable.Creator<event> CREATOR = new Parcelable.Creator<event>() {
        @Override
        public event createFromParcel(Parcel parcel) {
            return new event(parcel);
        }

        /**
         * Create a new array of the Parcelable class.
         *
         * @param size Size of the array.
         * @return Returns an array of the Parcelable class, with every entry
         * initialized to null.
         */
        @Override
        public event[] newArray(int size) {
            return new event[size];
        }
    };
}
