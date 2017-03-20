package com.crest.backend.dao.nosql.DTO.navigationinfo;

import java.util.List;

/**
 * Created by sgangras on 3/20/17.
 *
 */
public class NavigationDetails {
    private String _id ;
    private String _rev;
    private String source;//NOT sure if this should be Bus or Beacon Id
    private String destination;
    private List<String> directions;

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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<String> getDirections() {
        return directions;
    }

    public void setDirections(List<String> directions) {
        this.directions = directions;
    }

    @Override
    public String toString() {
        return "NavigationDetails{" +
                "_id='" + _id + '\'' +
                ", _rev='" + _rev + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", directions=" + directions +
                '}';
    }
}
