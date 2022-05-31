package ru.kostkin.spring.demospring;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("ru.kostkin.spring.demospring")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }



}
