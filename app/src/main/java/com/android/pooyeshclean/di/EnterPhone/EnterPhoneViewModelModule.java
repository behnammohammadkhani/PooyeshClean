package com.android.pooyeshclean.di.EnterPhone;

import androidx.lifecycle.ViewModel;

import com.android.pooyeshclean.di.ViewModelKey;
import com.android.pooyeshclean.presentation.ui.authentication.login.enterphone.EnterPhoneViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class EnterPhoneViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(value = EnterPhoneViewModel.class)
    public abstract ViewModel bind(EnterPhoneViewModel enterPhoneViewModel);
}
