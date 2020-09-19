package com.vaijyant.rest.service;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class GreetingServiceTest {

    @InjectMocks
    GreetingService greetingServiceMock = new GreetingServiceImpl();

    @Test
    public void testGetGreeting() {
        String name = "Vaijyant";
        assertNotNull(greetingServiceMock.getGreeting(name).getId(),"ID should not be null.");
        assertEquals("Hello, Vaijyant!",  greetingServiceMock.getGreeting(name).getContent(),"Should be a formatted value");
    }
}
