package com.vaijyant.rest.service;

import com.vaijyant.rest.model.Greeting;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingServiceImpl implements GreetingService {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Override
    public Greeting getGreeting(String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
