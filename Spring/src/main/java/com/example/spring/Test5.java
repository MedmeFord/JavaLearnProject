package com.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] argv) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();
        Dog myDog1 = context.getBean("myPet", Dog.class);
        myDog1.say();

        context.close();
    }
}
