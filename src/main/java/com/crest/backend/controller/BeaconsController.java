package com.crest.backend.controller;

import com.crest.backend.model.CrestResponse;
import com.crest.backend.pushAPN.SendPushNotifications;
import com.crest.backend.service.nosql.BeaconServiceV2;
import com.crest.backend.service.nosql.NavigationServiceV2;
import com.crest.backend.service.sqldb.BeaconService;
import com.crest.backend.service.sqldb.UserService;
import com.crest.backend.service.sqldb.WekaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
@Service
@PropertySource("classpath:/application.properties")
@RequestMapping("/cense")
public class BeaconsController {
    private BeaconServiceV2 beaconService = new BeaconServiceV2();
    private NavigationServiceV2 navigationServiceV2 = new NavigationServiceV2();
    private CrestResponse crestResponse = new CrestResponse();
    @Autowired
    WekaService wekaService;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/program/test", method = RequestMethod.GET)
    public
    @ResponseBody
    String programABC() throws IOException {
        SendPushNotifications sendPushNotifications = new SendPushNotifications();
        sendPushNotifications.sendPushNotifications("userId","55","Started");
        return "testStringIsWorking";
    }

    @RequestMapping(value = "/user/{userId}/sendpushnotification/", method = RequestMethod.GET)
    public
    @ResponseBody
    String sendPushNotification(@PathVariable String userId) throws IOException {
        SendPushNotifications sendPushNotifications = new SendPushNotifications();
        sendPushNotifications.sendFallPushNotifications(userId);
        return "Notification Sent";
    }


    @RequestMapping(value = "/station/{beaconId}", method = RequestMethod.GET)
    public
    @ResponseBody
    CrestResponse getStationFromBeaconID(@PathVariable("beaconId") String beaconId) throws Exception {

        crestResponse = beaconService.getBusNumberForStationFromBeaconId(beaconId);
        return crestResponse;

    }

    @RequestMapping(value = "/station/{busStopId1}/{busStopId2}", method = RequestMethod.GET)
    public
    @ResponseBody
    CrestResponse getInternalNavigationBetweenBusStops(@PathVariable("busStopId1") String busStopId1, @PathVariable("busStopId2") String busStopId2) throws Exception {

        crestResponse = navigationServiceV2.getInternalNavigationBetweenBusStops(busStopId1, busStopId2);
        return crestResponse;

    }

    @RequestMapping(value = "/crowdEstimator/{tripMonth}/{service}/{timeBucket}/{tripRoute}/{busNumber}", method = RequestMethod.GET)
    public
    @ResponseBody
    CrestResponse getEstimatedCrowd(@PathVariable("tripMonth") String tripMonth, @PathVariable("service") String service,
                                    @PathVariable("timeBucket") String timeBucket, @PathVariable("tripRoute") String tripRoute, @PathVariable("busNumber") String busNumber) {
        crestResponse = wekaService.getWekaModel(tripMonth, service, timeBucket, tripRoute, busNumber);
        return crestResponse;
    }

}
