package com.example.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Pet cat = context.getBean("catBean", Pet.class);
        Pet cat1 = context.getBean("catBean", Pet.class);
        cat.say();
        cat1.say();
//        Person person = context.getBean("personBean", Person.class);
//        person.callYouPet();
    }
}
