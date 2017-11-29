package com.example.caleal.testaltran.service;

import com.example.caleal.testaltran.model.Brastlewark;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by CALEAL on 11/27/2017.
 */

public interface ServiceInterface {

    @GET("data.json")
    //@GET("posts")
    Call<ArrayList<Brastlewark>> getPost();

}
