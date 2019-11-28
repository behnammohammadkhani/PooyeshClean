package com.android.pooyeshclean.presentation.ui.authentication.login.enterphone;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.android.pooyeshclean.domain.usecase.EnterPhoneUseCase;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

import static android.content.ContentValues.TAG;


public class EnterPhoneViewModel extends ViewModel {

    EnterPhoneUseCase enterPhoneUseCase;

    MutableLiveData<Boolean> goToNextPage = new MutableLiveData<>();
    MutableLiveData<String> showError = new MutableLiveData<>();

    @Inject
    public EnterPhoneViewModel(EnterPhoneUseCase enterPhoneUseCase) {
        this.enterPhoneUseCase = enterPhoneUseCase;
    }

    public void sendPhoneNumber(String phoneNumber) {
        enterPhoneUseCase.sendPhoneNumber(phoneNumber)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(response -> {
                            if (response.succeed) {
                                goToNextPage.setValue(true);
                            }
                        },
                        error -> {
                            showError.setValue(error.getMessage());
                        });
    }
}
