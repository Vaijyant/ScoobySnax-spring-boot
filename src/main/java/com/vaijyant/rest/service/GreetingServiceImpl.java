package com.vaijyant.rest.service;

import com.vaijyant.rest.document.User;
import com.vaijyant.rest.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Autowired
    MongoTemplate mongoTemplate;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Override
    public Greeting getGreeting(String name) {
        long count = counter.incrementAndGet();
        User user = new User();
        user.setName(name);
        user.setId(count);
        mongoTemplate.save(user);
        return new Greeting(count, String.format(template, name));
    }
}
