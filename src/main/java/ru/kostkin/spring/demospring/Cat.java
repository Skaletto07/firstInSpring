package ru.kostkin.spring.demospring;

import lombok.ToString;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@ToString
public class Cat implements Pet{
    private static Logger log = LogManager.getLogger(Cat.class);
    public Cat() {
        log.debug("Cat bean is created!");
    }
    public void say() {
        System.out.println("Meow-meow");
    }
}
