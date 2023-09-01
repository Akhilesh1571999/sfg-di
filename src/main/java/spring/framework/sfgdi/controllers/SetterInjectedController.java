package spring.framework.sfgdi.controllers;

import spring.framework.sfgdi.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService){
        this.greetingService= greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
