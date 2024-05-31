package com.optic.socialmediagamer.retrofit;

import com.optic.socialmediagamer.models.FCMBody;
import com.optic.socialmediagamer.models.FCMResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMApi {

    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAbSRAigw:APA91bH2qgfj_M_t3pAAsN82EXIrfYPtMGixfBKNSzQOnBwPVQazuZmTXMnfoSDYfoluEB5vVdsXJGMq_r8ku3rZ9QnmeQ9CTriqYsGX8CA0mFwGXUc8dMgsRQzNFVi49RiPjd7W2_cY"
    })
    @POST("fcm/send")
    Call<FCMResponse> send(@Body FCMBody body);
}
