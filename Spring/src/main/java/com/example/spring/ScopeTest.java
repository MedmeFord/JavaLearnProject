package com.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        
        Dog myDog = context.getBean("dogBean", Dog.class);

        myDog.say();

        context.close();
    }
}
