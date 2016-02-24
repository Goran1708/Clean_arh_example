package com.kodelabs.boilerplate.dagger_di.modules;

import com.kodelabs.boilerplate.domain.executor.Executor;
import com.kodelabs.boilerplate.domain.executor.MainThread;
import com.kodelabs.boilerplate.domain.executor.impl.ThreadExecutor;
import com.kodelabs.boilerplate.domain.repository.MessageRepository;
import com.kodelabs.boilerplate.storage.WelcomeMessageRepository;
import com.kodelabs.boilerplate.threading.MainThreadImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by GoranCol on 2/23/2016.
 */
@Module
public class ExecutorModule {

    @Provides
    public Executor provideExecutor() {
        return ThreadExecutor.getInstance();
    }

    @Provides
    public MainThread provideMainThread() {
        return MainThreadImpl.getInstance();
    }

}
