package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

public class ConstructorInjectedController {

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    private final GreetingService greetingService;
    public String getGreetings()
    {
        return   greetingService.sayGreeting();
    }
}
