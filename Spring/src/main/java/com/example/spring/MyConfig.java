package com.example.spring;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("com.example.spring")
@PropertySource("classpath:myApp.properties")
public class MyConfig {
    @Bean
    @Scope("prototype")
    public Pet catBean() {
        return new Cat();
    }
    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
