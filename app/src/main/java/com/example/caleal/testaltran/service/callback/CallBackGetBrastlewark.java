package com.example.caleal.testaltran.service.callback;

import com.example.caleal.testaltran.model.Brastlewark;

import java.util.ArrayList;

/**
 * Created by CALEAL on 11/27/2017.
 */

public interface CallBackGetBrastlewark {

    void onSuccess(ArrayList<Brastlewark> brastlewarkModel);
    void onError(String msgError, int indError);

}
