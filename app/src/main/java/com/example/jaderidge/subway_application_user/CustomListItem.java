package com.example.jaderidge.subway_application_user;

        import android.graphics.drawable.Drawable;

/**
 * Created by Jaderidge on 2017-11-06.
 */

public class CustomListItem {
    private Drawable icon;
    private String station;

    public Drawable getIcon(){
        return icon;
    }

    public void setIcon(Drawable icon){
        this.icon = icon;
    }

    public String getStation(){
        return station;
    }

    public void setStation(String station){
        this.station = station;
    }
}
