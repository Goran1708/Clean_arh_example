package com.kodelabs.boilerplate.dagger_di.components;

import com.kodelabs.boilerplate.AndroidApplication;

import javax.inject.Singleton;

/**
 * Created by GoranCol on 2/23/2016.
 */
@Singleton
public interface AppComponent {

    void inject(AndroidApplication androidApplication);
}
