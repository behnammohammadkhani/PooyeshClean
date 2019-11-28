package com.android.pooyeshclean.presentation.ui.authentication;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.android.pooyeshclean.R;
import com.android.pooyeshclean.presentation.ui.authentication.login.enterphone.EnterPhoneFragment;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.support.DaggerAppCompatActivity;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Hossein Gheisary on 24/10/2019.
 */
public class AuthenticationActivity extends DaggerAppCompatActivity {

//@Inject
//EnterPhoneFragment enterPhoneFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);

            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.frame,new EnterPhoneFragment()).commit();

/*        Observable.just("test")
                                .subscribeOn(AndroidSchedulers.mainThread())
                                .map( it -> {
                                            Log.i("testPooyesh", Thread.currentThread().getName());
                                            return it;
                                        }
                                )
                                .observeOn(Schedulers.io())
                                .map( it -> {
                                            Log.i("testPooyesh", Thread.currentThread().getName());
                                            return it;
                                        }
                                )
                                .subscribe(response -> {}
                                        , error -> {

                        });


 */
    }
}
