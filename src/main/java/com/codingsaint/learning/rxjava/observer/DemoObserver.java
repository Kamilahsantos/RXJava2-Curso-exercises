package com.codingsaint.learning.rxjava.observer;

import com.codingsaint.learning.rxjava.observables.ObservableUsingJust;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoObserver implements Observer {


    private static final Logger LOGGER = LoggerFactory.getLogger(Observer.class);

    @Override
    public void onSubscribe(Disposable disposable) {
        LOGGER.info("OnSubscribe");

    }

    @Override
    public void onNext(Object o) {

        LOGGER.info("OnNext ->  {}", o);


    }

    @Override
    public void onError(Throwable throwable) {

        LOGGER.info("OnError{}", throwable.getMessage());


    }

    @Override
    public void onComplete() {
        LOGGER.info("onComplete");

    }
}
