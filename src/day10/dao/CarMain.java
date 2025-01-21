package day10.dao;

import day10.dto.Tire;
import day10.dto.CarDTo;

public class CarMain {

    public static void main(String[] args) {
        CarDTo car1 = new CarDTo();
        Tire tire = new Tire();
        tire.setModel("한국 타이어");
        CarDTo car2 = new CarDTo("캐스퍼", tire);

        CarDao carDao = new CarDao(car2);
        carDao.insert();

    }
}
