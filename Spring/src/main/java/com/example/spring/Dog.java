package com.example.spring;

public class Dog implements Pet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("Gav-Gav");
    }

    public void init() {
        System.out.println("init");
    }

    public void destroy() {
        System.out.println("destroy");
    }
}
