package spring.framework.sfgdi.controllers;

import spring.framework.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){

        return greetingService.sayGreeting();

    }
}
