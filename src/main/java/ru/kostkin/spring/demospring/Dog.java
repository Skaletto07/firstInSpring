package ru.kostkin.spring.demospring;

import lombok.ToString;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@ToString
//@Component
@Scope
public class Dog implements Pet{

    private static Logger log = LogManager.getLogger(Dog.class);

    public Dog() {
        log.debug("Dog bean is created!");
    }
    public void say() {
        System.out.println("Bow-Wow");
    }

//    @PostConstruct
//    private void init() {
//        log.debug("Class Dog: init method");
//    }
//
//    @PreDestroy
//    private void destroy() {
//        log.debug("Class Dog: destroy method");
//    }
}
