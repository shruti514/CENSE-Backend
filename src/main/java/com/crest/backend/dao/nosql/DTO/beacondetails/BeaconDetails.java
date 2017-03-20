package com.crest.backend.dao.nosql.DTO.beacondetails;

/**
 * Created by sgangras on 3/20/17.
 */
public class BeaconDetails {
    private String _id;
    private String _rev;
    private DeploymentType beaconDeploymentType;
    private Location location;


    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_rev() {
        return _rev;
    }

    public void set_rev(String _rev) {
        this._rev = _rev;
    }

    public DeploymentType getBeaconDeploymentType() {
        return beaconDeploymentType;
    }

    public void setBeaconDeploymentType(DeploymentType beaconDeploymentType) {
        this.beaconDeploymentType = beaconDeploymentType;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "BeaconDetails{" +
                "_id='" + _id + '\'' +
                ", _rev='" + _rev + '\'' +
                ", beaconDeploymentType=" + beaconDeploymentType +
                ", location=" + location.toString() +
                '}';
    }
}
