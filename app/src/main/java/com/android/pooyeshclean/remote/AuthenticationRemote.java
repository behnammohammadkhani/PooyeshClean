package com.android.pooyeshclean.remote;

import com.android.pooyeshclean.remote.entity.LoginResponse;

import javax.inject.Inject;

import io.reactivex.Single;
import retrofit2.Retrofit;

/**
 * Created by Hossein Gheisary on 07/11/2019.
 */
public class AuthenticationRemote {

    AuthenticationService authenticationService;


    @Inject
    public AuthenticationRemote(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;


    }


    public Single<LoginResponse> sendPhoneNumber(String phoneNumber) {

        return authenticationService.sendPhoneNumber("http://www.mocky.io/v2/5ddf86e0310000526c3ae80f");
    }


}
