package com.optic.socialmediagamer.providers;

import com.optic.socialmediagamer.models.FCMBody;
import com.optic.socialmediagamer.models.FCMResponse;
import com.optic.socialmediagamer.retrofit.IFCMApi;
import com.optic.socialmediagamer.retrofit.RetrofitClient;

import retrofit2.Call;

public class NotificationProvider {

    private String url = "https://fcm.googleapis.com";

    public NotificationProvider() {

    }

    public Call<FCMResponse> sendNotification(FCMBody body) {
        return RetrofitClient.getClient(url).create(IFCMApi.class).send(body);
    }

}
