package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello()
    {
        System.out.println("Hello from MyController::sayHello");

        return "MK404 return from MyController::sayHello";
    }
}
