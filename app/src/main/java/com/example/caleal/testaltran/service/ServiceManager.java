package com.example.caleal.testaltran.service;

import com.example.caleal.testaltran.model.Brastlewark;
import com.example.caleal.testaltran.service.callback.CallBackGetBrastlewark;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * Created by CALEAL on 11/27/2017.
 */

public class ServiceManager {

    public static void getPostList(final CallBackGetBrastlewark callBackGetBrastlewark) {
        ServiceInterface serviceInterface = ServiceHelper.getInstance();
        //final ArrayList<PeopleModel> arrayListPeople =  new ArrayList<PeopleModel>();
        //final JsonObject[] jsonObjectListPeople = {new JsonObject()};

        serviceInterface.getPost().enqueue(new Callback<ArrayList<Brastlewark>>() {

            @Override
            public void onResponse(Call<ArrayList<Brastlewark>> call, Response<ArrayList<Brastlewark>> response) {
                if (response.body() != null && response.body().size() > 0) {
                    callBackGetBrastlewark.onSuccess(response.body());
                }

            }
            @Override
            public void onFailure(Call<ArrayList<Brastlewark>> call, Throwable t) {

                callBackGetBrastlewark.onError("Error al invocar el Servicio", 1);

            }
        });}


}
