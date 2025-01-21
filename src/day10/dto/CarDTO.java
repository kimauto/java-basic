package day10.dto;

public class CarDTO {  // 자동차의 데이터와 기능 정의
    private String model;    //null 초기화
    private int speed;       // 0  초기화
    private boolean start;   //false  초기화
    private Tire tire;       //null   초기화

    public CarDTO(){}
    public CarDTO(String model, Tire tire){
        this.model = model;
        this.tire = tire;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", start=" + start +
                ", tire=" + tire +
                '}';
    }
}
