package com.crest.backend.controller;

import com.crest.backend.dao.nosql.CloudantClientMgr;
import com.crest.backend.dao.nosql.DTO.beacondetails.BeaconDetails;
import com.crest.backend.dao.nosql.DTO.beacondetails.DeploymentType;
import com.crest.backend.dao.nosql.DTO.beacondetails.Location;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by sgangras on 3/20/17.
 */

@Path("/devsetup")
public class DevSetUp {

    @GET
    @Produces("application/json")
    public Response initializeData() {
        BeaconDetails beaconDetails = new BeaconDetails();
        beaconDetails.set_id(System.currentTimeMillis()+"");
        beaconDetails.setBeaconDeploymentType(DeploymentType.BUS);
        Location location = new Location();
        location.setBusNumber("60");
        beaconDetails.setLocation(location);

        com.cloudant.client.api.model.Response dbResponse = CloudantClientMgr.getDB().save(beaconDetails);
        return Response.ok().entity(dbResponse).build();
    }


    @RequestMapping(value = "/station/{beaconId}", method = RequestMethod.GET)
    @Produces("application/json")
    public BeaconDetails getBusIdForBeaconId(@PathVariable("beaconId") String beaconId) {
        return CloudantClientMgr.getDB().find(BeaconDetails.class, beaconId);
    }

}
