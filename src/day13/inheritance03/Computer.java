package day13.inheritance03;

public class Computer extends Calculator{

    //원의 면적 계산 기능: 항상 메소드명을 같게 하겠다.

    private double radius;

    public Computer() {
        super();
    }

    public Computer(double radius) {
        this.radius = radius;
    }

    @Override
    public void areaCompute() {
        System.out.println("원의 면적을 계산하는 기능을 수행합니다.");
        double result = Math.PI * this.radius * this.radius;
        System.out.println("계산이 끝낫습니다. 면적은 " + result);
    }


}

