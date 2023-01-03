package com.example.spring;

import org.springframework.cache.Cache;

public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
