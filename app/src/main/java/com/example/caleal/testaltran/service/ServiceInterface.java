package com.example.caleal.testaltran.service;

import com.example.caleal.testaltran.model.BrastlewarkModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by CALEAL on 11/27/2017.
 */

public interface ServiceInterface {

    @GET("/data.json")
    Call<ArrayList<BrastlewarkModel>> getBrastlewarkList();
    //void getBrastlewarkList(Callback<BrastlewarkModel> callback);

}
