package ru.kostkin.spring.demospring;

import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigReactiveWebApplicationContext context = new AnnotationConfigReactiveWebApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person);

//        Pet cat = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);




        context.close();
    }
}
