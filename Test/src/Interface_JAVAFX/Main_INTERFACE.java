package Interface_JAVAFX;

import Abstract_class_function.*;

public class Main_INTERFACE {

    public static void main(String[] args) {

        Aminal[] animal = {new Bird(), new Tiger(), new Shark() };
        for(Animal function : animal) {
            function.sound();
            function.sleep();
            function.eat();

            System.out.println();
        }



    }
}
