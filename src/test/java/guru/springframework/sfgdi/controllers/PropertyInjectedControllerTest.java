package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    @BeforeEach
    void setUp() {
        controller=new PropertyInjectedController();

        controller.greetingService=new ConstructorInjectedGreetingService();
    }

    PropertyInjectedController controller;
    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());
    }
}