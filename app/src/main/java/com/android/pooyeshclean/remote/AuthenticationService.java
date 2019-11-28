package com.android.pooyeshclean.remote;

import com.android.pooyeshclean.remote.entity.LoginResponse;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Url;

/**
 * Created by Hossein Gheisary on 07/11/2019.
 */
public interface AuthenticationService {

    @POST
    Single<LoginResponse> sendPhoneNumber(@Url String url);
}
