package com.crest.backend.dao.nosql.DTO.userlocation;

/**
 * Created by sgangras on 3/20/17.
 */
public class UserLocation {
    private String _id ;
    private String _rev;
    private String userId;
    private String busNumber;
    private String tripStatus;

    @Override
    public String toString() {
        return "UserLocation{" +
                "userId='" + userId + '\'' +
                ", busNumber='" + busNumber + '\'' +
                ", tripStatus='" + tripStatus + '\'' +
                '}';
    }
}
