package com.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] argv) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("Simka");
        Dog otherDog = context.getBean("myPet", Dog.class);
        otherDog.setName("Nolic");

        System.out.println("Ref myDog == otherDog?"+
                (myDog == otherDog) + "\n\n\n" + myDog.getName()+ "\n" + otherDog.getName()+ "\n\n\n");

        context.close();
    }
}
