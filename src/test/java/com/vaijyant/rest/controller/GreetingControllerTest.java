package com.vaijyant.rest.controller;

import com.vaijyant.rest.model.Greeting;
import com.vaijyant.rest.service.GreetingService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GreetingControllerTest {

    @Mock
    GreetingService greetingService;

    @InjectMocks
    GreetingController greetingController;

    @Test
    public void testGreeting() {
        String name = "Vaijyant";
        when(greetingService.getGreeting(name)).thenReturn(new Greeting(1L, name));
        assertNotNull(greetingController.greeting(name), "Greeting should not be null");
    }
}
