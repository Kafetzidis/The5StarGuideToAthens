package com.tzidis.android.the5starguidetoathens;

import static android.R.attr.description;

/**
 * Place represents a place that the user wants to visit. It is an object
 * containing a name, an address, a telephone, an image, a description, a
 * URL and coordinates of the site.
 */

public class Place {

    //The name of the place
    private String mPlaceName;

    //The address of the place
    private String mPlaceAddress;

    //The telephone of the place
    private String mPlaceTelephone;

    //The description of the place
    private String mPlaceDescription;

    //The ID of the image resource of the place
    private int mPlaceImageResourceID;

    //The site URL of the place
    private String mPlaceUrl;

    //The location coordinates of the place
    private String mPlaceLocation;

    //Loofie's advice for the place
    private String mAdvice;

    //Public constructor of the Place object with Url
    public Place (String name, String address, String telephone, String description, int imageResourceID,
                  String Url, String location, String advice){
        mPlaceName = name;
        mPlaceAddress = address;
        mPlaceTelephone = telephone;
        mPlaceImageResourceID = imageResourceID;
        mPlaceDescription = description;
        mPlaceUrl = Url;
        mPlaceLocation = location;
        mAdvice = advice;
    }

    //Get the name of the place
    public String getName(){
        return mPlaceName;
    }

    //Get the address of the place
    public String getAddress(){
        return mPlaceAddress;
    }

    //Get the telephone of the place
    public String getTelephone(){
        return mPlaceTelephone;
    }

    //Get the image resource ID of the place
    public int getImageResourceID(){return mPlaceImageResourceID; }

    //Get the description of the place
    public String getDescription(){
        return mPlaceDescription;
    }

    //Get the site URL of the place
    public String getURL(){
        return mPlaceUrl;
    }

    //Get the location coordinates of the place
    public String getCoordinates(){
        return mPlaceLocation;
    }

    //Get the name of the place
    public String getAdvice(){
        return mAdvice;
    }
}
