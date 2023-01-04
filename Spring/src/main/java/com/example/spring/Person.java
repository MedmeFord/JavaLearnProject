package com.example.spring;

public class Person {
    private String surname;
    private int age;

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

    private Pet pet;

    public Person() {
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
