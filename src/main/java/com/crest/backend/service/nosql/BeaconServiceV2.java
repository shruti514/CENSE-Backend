package com.crest.backend.service.nosql;

import com.crest.backend.dao.nosql.BeaconRegistryDAO;
import com.crest.backend.dao.nosql.DTO.beacondetails.BeaconDetails;
import com.crest.backend.model.CrestResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BeaconServiceV2 {
    protected final Logger log = LoggerFactory.getLogger(getClass());
    private BeaconRegistryDAO beaconRegistryDAO = new BeaconRegistryDAO();

    public CrestResponse getBusNumberForStationFromBeaconId(String beaconId) {
        BeaconDetails beaconDetails = beaconRegistryDAO.getBeaconDetailsByBeaconId(beaconId);
        CrestResponse crestResponse = null;
        if (beaconDetails != null) {
            crestResponse = new CrestResponse();
            crestResponse.setStatusCode("200");
            crestResponse.setStatusDescripton("Ok");
            crestResponse.setBusNumber(beaconDetails.getLocation().getBusNumber());
        }
        return crestResponse;
    }


}
