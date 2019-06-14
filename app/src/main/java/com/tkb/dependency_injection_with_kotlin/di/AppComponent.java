package com.tkb.dependency_injection_with_kotlin.di;

import com.tkb.dependency_injection_with_kotlin.Application;
import dagger.Component;
import dagger.android.AndroidInjector;

//@AppScope
@Component(modules = {AppModule.class})
public interface AppComponent extends AndroidInjector<Application> {

    @Component.Builder
    interface Builder{
        AppComponent.Builder application(Application application);
        AppComponent build();
    }
}
