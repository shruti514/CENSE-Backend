package com.crest.backend.service.nosql;

import com.crest.backend.dao.nosql.DTO.navigationinfo.NavigationDetails;
import com.crest.backend.dao.nosql.InternalNavigationDAO;
import com.crest.backend.model.CrestResponse;
import com.google.common.base.Joiner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by sgangras on 3/20/17.
 */
public class NavigationServiceV2 {

    protected final Logger log = LoggerFactory.getLogger(getClass());
    private InternalNavigationDAO internalNavigationDAO = new InternalNavigationDAO();

    public CrestResponse getInternalNavigationBetweenBusStops(String sourceBusStopId, String destinationBusStopId) {
        NavigationDetails navigationDetails = internalNavigationDAO.getNavigationDetails(sourceBusStopId, destinationBusStopId);

        CrestResponse crestResponse = null;
        if (navigationDetails != null) {
            crestResponse.setStatusCode("200");
            crestResponse.setStatusDescripton("Ok");
            crestResponse.setRouteDescription(Joiner.on(" ").join(navigationDetails.getDirections()));
        }
        return crestResponse;
    }
}
