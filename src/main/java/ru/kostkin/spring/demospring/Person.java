package ru.kostkin.spring.demospring;

import lombok.Getter;
import lombok.ToString;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@Component("personBean")
public class Person {
    private static Logger log = LogManager.getLogger(Person.class);

    private Pet pet;
//    @Value("${person.surname}")
    private String surname;
//    @Value("${person.age}")
    private int age;

//    public Person() {
//        log.debug("Person bean is created!");
//    }

    @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
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
