package com.crest.backend.dao.nosql.DTO.beacondetails;

/**
 * Created by sgangras on 3/20/17.
 */
public class Location {

    private String latitude;
    private String longitude;

    private String busNumber;

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getLatitude() {

        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "Location{" +
                "latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", busNumber='" + busNumber + '\'' +
                '}';
    }
}
