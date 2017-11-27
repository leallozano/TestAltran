package com.example.caleal.testaltran.service;

import com.example.caleal.testaltran.service.callback.CallBackGetBrastlewark;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * Created by CALEAL on 11/27/2017.
 */

public class ServiceManager {

    public static void getBrastlewark(final CallBackGetBrastlewark callBackGetBrastlewark) {

        ServiceInterface serviceInterface = ServiceHelper.getInstance();
        //final ArrayList<BrastlewarkModel> arrayListBrastlewark =  new ArrayList<BrastlewarkModel>();
        final JsonObject[] jsonObjectListBrastlewark = {new JsonObject()};

        serviceInterface.getBrastlewarkList().enqueue(new Callback<JsonObject>() {

            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {

                if (response.body() != null && response.body().size() > 0) {
                    callBackGetBrastlewark.onSuccess(response.body());
                }

            }
            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {

                callBackGetBrastlewark.onError("Error en al invocar al Servicio", 1);

            }
        });}





}
