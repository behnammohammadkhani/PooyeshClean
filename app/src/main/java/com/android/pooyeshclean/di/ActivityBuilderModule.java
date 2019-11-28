package com.android.pooyeshclean.di;

import com.android.pooyeshclean.presentation.ui.authentication.AuthenticationActivity;
import com.android.pooyeshclean.di.EnterPhone.EnterPhoneViewModelModule;
import com.android.pooyeshclean.presentation.ui.authentication.login.enterphone.EnterPhoneFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {
    @ContributesAndroidInjector(modules = {EnterPhoneViewModelModule.class})
    abstract EnterPhoneFragment enterPhoneFragment();

    @ContributesAndroidInjector
    abstract AuthenticationActivity authenticationActivity();
    
}
