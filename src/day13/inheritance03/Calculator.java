package day13.inheritance03;

public class Calculator {

    private int row;
    private int col;

    public Calculator() {
    }

    public Calculator(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void areaCompute(){
        System.out.println("사각형 면적을 계산하는 기능을 수행합니다.");
        int result = this.row * this.col;
        System.out.println("계산이 끝낫습니다. 면적은 " + result);
    }
}
