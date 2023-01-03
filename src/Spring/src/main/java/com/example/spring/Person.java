package com.example.spring;

public class Person {
    Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
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
