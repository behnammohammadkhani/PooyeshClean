package com.android.pooyeshclean.domain.usecase;

import com.android.pooyeshclean.data.AuthenticationRepositoryImpl;
import com.android.pooyeshclean.domain.repository.AuthenticationRepository;
import com.android.pooyeshclean.remote.entity.LoginResponse;

import javax.inject.Inject;

import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Hossein Gheisary on 07/11/2019.
 */
public class EnterPhoneUseCase {

    AuthenticationRepository authenticationRepository;

    @Inject
    public EnterPhoneUseCase(AuthenticationRepository authenticationRepository){
        this.authenticationRepository = authenticationRepository;
    }

    public Single<LoginResponse> sendPhoneNumber(String phoneNumber) {
        return authenticationRepository.sendPhoneNumber(phoneNumber);
    }
}
