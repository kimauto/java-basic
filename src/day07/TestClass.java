package day07;

import java.util.Scanner;

class Car {
    String color;

    void colorReturn() {
        System.out.println("자동차 색은 " + this.color);
    }
}

public class TestClass {

    public static void main(String[] args) {
       // int number = 1;
       // Scanner sc = new Scanner(System.in);
        Car car1 = new Car();
        Car car2 = new Car();

        //System.out.println(number);
       // System.out.println(sc.getClass().getName() );
        car1.color ="read";
        car2.color = "blue";
        System.out.println(car1.color);
        System.out.println(car2.color);

    }

}
