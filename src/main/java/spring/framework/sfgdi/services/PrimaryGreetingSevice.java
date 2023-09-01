package spring.framework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingSevice implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world- Primary";
    }
}
