package com.vicky7230.moviesearch.di.component

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import com.core.network.di.NetworkModule
import com.feature.movie.data.di.DataLayerModule
import com.feature.movie.domain.di.DomainLayerModule
import com.feature.movie.ui.di.UiModule
import com.vicky7230.moviesearch.BaseApplication
import com.vicky7230.moviesearch.di.module.ActivityBindingModule
import com.vicky7230.moviesearch.di.module.AppModule
import com.vicky7230.moviesearch.di.module.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        NetworkModule::class,
        DataLayerModule::class,
        DomainLayerModule::class,
        UiModule::class,
        //BindingModule::class,
        AppModule::class,
        ActivityBindingModule::class,
        ViewModelModule::class
    ]
)
interface ApplicationComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): ApplicationComponent
    }

    fun viewModelFactory(): ViewModelProvider.Factory

    fun inject(baseApplication: BaseApplication)
}