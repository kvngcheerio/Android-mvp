package com.ojaexpress.ojaexpress.di;

/**
 * Created by TerryCheerio on 11/1/17.
 */


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;



@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
