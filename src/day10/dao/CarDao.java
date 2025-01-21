package day10.dao;


import day10.dto.CarDTo;

public class CarDao {
        private CarDTo car;
    
        public CarDao(CarDTo car) {
            this.car = car;
    }
    
    public void insert(){
        System.out.println("DB애 CAR 1대 정보 입력 ");
    }
    public void delete(){
        System.out.println("DB애 CAR 1대 정보 삭제 ");
            
    }
    public void select(){
        System.out.println("DB애 CAR 1대 정보 검색 ");
            
    }
    public void update(){
        System.out.println("DB애 CAR 1대 정보 갱신 ");
            
    }
}
