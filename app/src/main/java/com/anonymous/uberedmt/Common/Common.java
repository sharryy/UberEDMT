package com.anonymous.uberedmt.Common;

import android.location.Location;

import com.anonymous.uberedmt.Model.User;
import com.anonymous.uberedmt.Remote.FCMClient;
import com.anonymous.uberedmt.Remote.IFCMService;
import com.anonymous.uberedmt.Remote.IGoogleAPI;
import com.anonymous.uberedmt.Remote.RetroFitClient;

public class Common {

    public static final String driver_tbl = "Drivers";
    public static final String user_driver_tbl = "DriversInformation";
    public static final String user_rider_tbl = "RidersInformation";
    public static final String pickup_request_tbl = "PickupRequest";
    public static final String token_tbl = "Tokens";

    public static Location mLastLocation = null;

    public static User currentUser;

    public static final String baseURL = "https://maps.googleapis.com";
    public static final String fcmURL = "https://fcm.googleapis.com/";

    public static IGoogleAPI getGoogleAPI() {
        return RetroFitClient.getClient(baseURL).create(IGoogleAPI.class);
    }

    public static IFCMService getFCMService() {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }

}
