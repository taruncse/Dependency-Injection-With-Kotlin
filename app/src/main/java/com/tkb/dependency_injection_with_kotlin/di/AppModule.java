package com.tkb.dependency_injection_with_kotlin.di;

import android.content.Context;
import com.tkb.dependency_injection_with_kotlin.Application;
import dagger.Module;

@Module
public abstract class AppModule {
    abstract Context bindContext(Application application);
}
