package day13.animal;

import java.sql.SQLOutput;

public class ObjMain {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.sound();
        cat.eat();
        dog.sound();
        dog.eat();
    }

}
