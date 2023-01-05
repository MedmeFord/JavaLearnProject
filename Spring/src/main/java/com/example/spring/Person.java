package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("dogBean")
    private Pet pet;
    private String surname;
    private int age;
//    @Autowired
//    public Person(@Qualifier("catBean") Pet pet) {
//        this.pet = pet;
//    }
    public Person(Pet pet) {
        System.out.println("Person object created");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callYouPet() {
        System.out.println("Hello my Pet!");
        pet.say();
    }
}
