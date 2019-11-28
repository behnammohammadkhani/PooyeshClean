package com.android.pooyeshclean.data;

import com.android.pooyeshclean.domain.repository.AuthenticationRepository;
import com.android.pooyeshclean.remote.AuthenticationRemote;
import com.android.pooyeshclean.remote.entity.LoginResponse;
import javax.inject.Inject;
import io.reactivex.Single;

/**
 * Created by Hossein Gheisary on 07/11/2019.
 */
public class AuthenticationRepositoryImpl implements AuthenticationRepository {

    AuthenticationRemote authenticationRemote;
    @Inject
    public AuthenticationRepositoryImpl( AuthenticationRemote authenticationRemote){
        this.authenticationRemote = authenticationRemote;

    }



    @Override
    public Single<LoginResponse> sendPhoneNumber(String phoneNumber) {
        return authenticationRemote.sendPhoneNumber("5dde1f292f0000fe637eacef");
    }
}
