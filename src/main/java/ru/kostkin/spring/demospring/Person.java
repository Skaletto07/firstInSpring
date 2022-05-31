package ru.kostkin.spring.demospring;

import lombok.Getter;
import lombok.ToString;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@ToString
public class Person {
    private static Logger log = LogManager.getLogger(Person.class);
    private Pet pet;
    private String surname;
    private int age;

    public Person() {
        log.debug("Person bean is created!");
    }

    public Person(Pet pet) {
        log.debug("Person bean is created!");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Give a voice, boy!");
        pet.say();
    }

    public void setPet(Pet pet) {
        log.debug("Class Person: set pet!");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        log.debug("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        log.debug("Class Person: set age");
        this.age = age;
    }

}
