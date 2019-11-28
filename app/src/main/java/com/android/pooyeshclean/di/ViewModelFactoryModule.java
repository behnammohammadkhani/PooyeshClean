package com.android.pooyeshclean.di;

import androidx.lifecycle.ViewModelProvider;

import com.android.pooyeshclean.di.ViewModel.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {
    @Binds
    public abstract ViewModelProvider.Factory ProvidesViewModel(ViewModelProviderFactory viewModelProviderFactory);

//    @Binds
//    @IntoMap
//    @ViewModelKey(EnterPhoneViewModel.class)
//    abstract ViewModel provideVM(EnterPhoneViewModel postEnterPhoneViewModelviewModel);
}
