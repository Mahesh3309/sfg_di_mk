package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"MA","default"})
@Service("i18nService")
public class I18nMarathiGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {

        return "MK404 I18nMarathiGreetingService.sayGreeting  Marathi!!!!!!!";
    }
}
