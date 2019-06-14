package com.tkb.dependency_injection_with_kotlin.di;

import com.tkb.dependency_injection_with_kotlin.Application;
import com.tkb.dependency_injection_with_kotlin.di.scopes.AppScoped;
import dagger.Component;
import dagger.android.AndroidInjector;

@AppScoped
@Component(modules = {AppModule.class})
public interface AppComponent extends AndroidInjector<Application> {

    @Component.Builder
    interface Builder{
        AppComponent.Builder application(Application application);
        AppComponent build();
    }
}
