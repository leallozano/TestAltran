package com.example.caleal.testaltran.service.callback;

import com.example.caleal.testaltran.model.BrastlewarkModel;

import java.util.ArrayList;

/**
 * Created by CALEAL on 11/27/2017.
 */

public interface CallBackGetBrastlewark {

    void onSuccess(ArrayList<BrastlewarkModel> ListBrastlewark);
    void onError(String msgError, int indError);

}
