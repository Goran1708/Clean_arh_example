package com.kodelabs.boilerplate.dagger_di.modules;

import com.kodelabs.boilerplate.domain.interactors.WelcomingInteractor;
import com.kodelabs.boilerplate.domain.interactors.impl.WelcomingInteractorImpl;
import com.kodelabs.boilerplate.domain.repository.MessageRepository;
import com.kodelabs.boilerplate.presentation.presenters.MainPresenter;
import com.kodelabs.boilerplate.presentation.presenters.impl.MainPresenterImpl;
import com.kodelabs.boilerplate.storage.WelcomeMessageRepository;

import dagger.Module;
import dagger.Provides;

/**
 * Created by GoranCol on 2/23/2016.
 */
@Module
public class MainActivityModule {

    private MainPresenter.View view;

    public MainActivityModule(MainPresenter.View view) {
        this.view = view;
    }

    @Provides
    public MainPresenter.View provideView() {
        return view;
    }


    @Provides
    public WelcomingInteractor provideInteractor(WelcomingInteractorImpl interactor) {
        return interactor;
    }

    @Provides
    public MainPresenter providePresenter(MainPresenterImpl presenter) {
        return presenter;
    }

    @Provides
    public MessageRepository provideMessageRepository() {
        return new WelcomeMessageRepository();
    }

}
