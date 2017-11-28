package com.example.caleal.testaltran.service;

import com.example.caleal.testaltran.model.BrastlewarkModel;
import com.example.caleal.testaltran.service.callback.CallBackGetBrastlewark;

import java.util.ArrayList;

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
        final ArrayList<BrastlewarkModel> jsonArrayListBrastlewark = new ArrayList<BrastlewarkModel>();

        serviceInterface.getBrastlewarkList().enqueue(new Callback<ArrayList<BrastlewarkModel>>() {

            @Override
            public void onResponse(Call<ArrayList<BrastlewarkModel>> call, Response<ArrayList<BrastlewarkModel>> response) {

                if (response.body() != null && response.body().size() > 0) {
                    callBackGetBrastlewark.onSuccess(response.body());
                }

            }
            @Override
            public void onFailure(Call<ArrayList<BrastlewarkModel>> call, Throwable t) {

                callBackGetBrastlewark.onError("Error en al invocar al Servicio", 1);

            }
        });}





}
