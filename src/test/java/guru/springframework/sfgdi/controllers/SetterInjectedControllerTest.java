package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;
    @BeforeEach
    void setUp() {
    setterInjectedController=new SetterInjectedController();
    setterInjectedController.setGreetingService(new ConstructorInjectedGreetingService());
    }

    @Test
    void getGreetings() {
        System.out.println(setterInjectedController.getGreetings());
    }
}