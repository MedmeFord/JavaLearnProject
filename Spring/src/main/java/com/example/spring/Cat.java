package com.example.spring;

public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
