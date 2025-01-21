package day10.car;


public class CarMain {

    public static void main(String[] args) {

        CarDTO car = new CarDTO("모닝","김병곤",0);

        car.setSpeed(10);
        System.out.println(car);

        for (int i = 0; i < 10; i++) {
            car.speedDown();
        }
        System.out.println(car);
    }
}
