package com.vicky7230.moviesearch

import android.app.Application
import com.vicky7230.moviesearch.di.component.ApplicationComponent
import com.vicky7230.moviesearch.di.component.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class BaseApplication:  Application(), HasAndroidInjector {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

//        if(BuildConfig.DEBUG) {
//            Timber.plant(Timber.DebugTree())
//        }

        applicationComponent = DaggerApplicationComponent
            .factory()
            .create(this)

        applicationComponent.inject(this)
    }

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> {
        return dispatchingAndroidInjector
    }
}