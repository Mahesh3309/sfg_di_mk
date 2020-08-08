package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    @BeforeEach
    void setUp() {
        controller=new PropertyInjectedController();

        controller.greetingService=new GreetingServiceImpl();
    }

    PropertyInjectedController controller;
    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());
    }
}