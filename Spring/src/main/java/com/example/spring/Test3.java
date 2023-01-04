package com.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] argv) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        Pet pet = context.getBean("myPet", Pet.class);
        Person person = context.getBean("myPerson", Person.class);
        person.callYouPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());


        context.close();
    }
}
