package com.tkb.dependency_injection_with_kotlin.di.scopes;

import javax.inject.Scope;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface AppScoped {
}
