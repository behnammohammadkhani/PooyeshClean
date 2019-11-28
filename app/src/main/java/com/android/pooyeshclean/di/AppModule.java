package com.android.pooyeshclean.di;

import com.android.pooyeshclean.data.AuthenticationRepositoryImpl;
import com.android.pooyeshclean.domain.repository.AuthenticationRepository;
import com.android.pooyeshclean.domain.usecase.EnterPhoneUseCase;
import com.android.pooyeshclean.remote.AuthenticationRemote;
import com.android.pooyeshclean.remote.AuthenticationService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module(includes = {NetworkModule.class})
public class AppModule {

    @Singleton
    @Provides
    static  AuthenticationRepository authenticationRepository(AuthenticationRemote authenticationRemote){
        return new AuthenticationRepositoryImpl(authenticationRemote);
    }

    @Singleton
    @Provides
    static EnterPhoneUseCase enterPhoneUseCase(AuthenticationRepository authenticationRepository) {
        return new EnterPhoneUseCase(authenticationRepository);
    }

    @Singleton
    @Provides
    static AuthenticationRemote authenticationRemote(AuthenticationService authenticationService) {
        return new AuthenticationRemote(authenticationService);
    }

    @Singleton
    @Provides
    static AuthenticationService authenticationService(Retrofit retrofit) {
        return retrofit.create(AuthenticationService.class);
    }
}
