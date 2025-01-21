package day10.dao;

import day10.dto.Person;

public class PersonMain {
    public static void main(String[] args) {

        Person person = new Person("김병곤", 28,"01023191306");


        person.run();
        person.eat();
        person.walk();
    }
}
