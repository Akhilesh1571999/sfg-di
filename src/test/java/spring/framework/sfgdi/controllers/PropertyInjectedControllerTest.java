package spring.framework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spring.framework.sfgdi.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUP(){

        controller = new PropertyInjectedController();
        controller.greetingService=new GreetingServiceImpl();
    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }

}