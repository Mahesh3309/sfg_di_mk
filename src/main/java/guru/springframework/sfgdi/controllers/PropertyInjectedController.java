package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;
    public String getGreetings()
    {
      return   greetingService.sayGreeting();
    }
}
