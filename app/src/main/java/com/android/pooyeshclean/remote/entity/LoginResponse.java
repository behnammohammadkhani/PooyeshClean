package com.android.pooyeshclean.remote.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Hossein Gheisary on 07/11/2019.
 */
public class LoginResponse {
    @SerializedName("suceed")
    @Expose
    public Boolean succeed;

    public Boolean getSucceed() {
        return succeed;
    }

    public void setSucceed(Boolean succeed) {
        this.succeed = succeed;
    }
}
