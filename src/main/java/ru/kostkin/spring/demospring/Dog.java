package ru.kostkin.spring.demospring;

import lombok.ToString;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@ToString
public class Dog implements Pet{

    private static Logger log = LogManager.getLogger(Dog.class);

    public Dog() {
        log.debug("Dog bean is created!");
    }
    public void say() {
        System.out.println("Bow-Wow");
    }
}
