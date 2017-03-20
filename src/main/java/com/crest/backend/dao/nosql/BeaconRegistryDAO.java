package com.crest.backend.dao.nosql;

import com.crest.backend.dao.nosql.DTO.beacondetails.BeaconDetails;

/**
 * Created by sgangras on 3/19/17.
 */
public class BeaconRegistryDAO {


    public BeaconDetails getBeaconDetailsByBeaconId(String beaconId){
        BeaconDetails beaconDetails;
        beaconDetails = CloudantClientMgr.getDB().find(BeaconDetails.class, beaconId);
        return beaconDetails;
    }



}
