package com.ruppyrup.it.listeners;

import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.EventPublisher;
import io.cucumber.plugin.event.TestCaseStarted;
import io.cucumber.plugin.event.TestRunStarted;

public class MyPlugin implements ConcurrentEventListener {

    @Override
    public void setEventPublisher(EventPublisher publisher) {
        publisher.registerHandlerFor(
                TestCaseStarted.class,
                (TestCaseStarted event) -> System.out.println("Test case started with event listener : " + event.getTestCase().getName())
        );
    }
}
