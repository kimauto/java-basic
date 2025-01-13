package day04;

public class InfinityAndNaNCheckEx {

    public static void main(String[] args) {
          int x = 5;
          double y = 2;
          //double z = x / y;   // Infinity
          double z = x % y;       //NaN : Not a Number
        // Infinity 와 NaN 의 의미는 무한대의 값을 정수로 표현할 수 없다.

        System.out.println(z + 2);

        //알맞은 코드로 리팩토링  // if의 결과가 false 일경우만 연산 진행함
        if(Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("값 산출 불가");
        } else {
            System.out.println(z + 2);
        }
    }
}
