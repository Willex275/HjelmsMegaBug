package com.company;


public class Main {

    public static void main(String[] args) {

        Animal[] animal = {new Bird(), new Tiger(), new Shark()};
        for (Animal function : animal) {
            function.sound();
            function.sleep();
            function.eat();

            System.out.println();

        }
    }
}
