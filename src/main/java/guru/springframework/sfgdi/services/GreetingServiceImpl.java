package guru.springframework.sfgdi.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
       // System.out.println("GreetingServiceImpl.sayGreeting");
        return "MK404 GreetingServiceImpl.sayGreeting HELLO WORLD!!!!!!!";
    }
}
