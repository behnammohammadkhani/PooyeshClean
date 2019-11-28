package com.android.pooyeshclean.domain.repository;

import com.android.pooyeshclean.remote.entity.LoginResponse;

import io.reactivex.Single;

/**
 * Created by Hossein Gheisary on 07/11/2019.
 */
public interface AuthenticationRepository {
    Single<LoginResponse> sendPhoneNumber(String phoneNumber);
}
