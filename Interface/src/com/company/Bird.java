package com.company;

public class Bird implements Animal {

    @Override
    public void sound() {
        System.out.println("PIPIPIPIPI");
    }

    @Override
    public void sleep() {
        System.out.println("ZZzzzZZZzz");
    }

    @Override
    public void eat() {
        System.out.println("VeryGood");
    }
}
