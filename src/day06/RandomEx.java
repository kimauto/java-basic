package day06;
   //Random (난수) : 컴퓨터가 무작위로 발생시킨 수
   //자바 : 1. Random 클래스   2. Math.random()    2가지 방법으로 난수를 발생하여 활용
import java.util.Random;

public class RandomEx {
       public static void main(String[] args) {

           Random random = new Random();   // Random 클래스를 실체화(instance : 메모리 생성) 하였다.
           //0~9까지의 범위의 난수 생성
           int n1 = random.nextInt(4);   // 4미만의 램덤 정수를 리턴한다.
           for (int i = 1; i <= 3; i++) {
               //int n2 = random.nextInt(10);
               //int n3 = random.nextInt(4)+1;   //1~4까지 범위의 난수를 발생
               int n4 = random.nextInt(6) + 100;      //100~105수 범위의 난수를 발생
               System.out.println(n4);
           }
           //int, long, float,double, boolean 타입의 무작위 값 생성
           long l = random.nextLong();
           float f = random.nextFloat();
           double d = random.nextDouble();
           boolean b = random.nextBoolean();
           System.out.println(l + " " + f + " " + d + " " + b);

           //Math.random()  사용하는 법 : 0.0~ 1.0 사이의 난수가 1개 발생
           //0~10 사이의 값
            int  num1 = (int) (Math.random()*10);
           //0~100 사이의 값
           int  num2 = (int) (Math.random()*100);
           //1~10 사이의 값
            int  num3 = (int) (Math.random()*10+1);
           //10 ~ 20 사이의 값
           int  num4 = (int) (Math.random()*10+10);
           // 1 ~ 45 난수 생성하는 식
           int  num5 = (int) (Math.random()*45);   //0~44 (+1)

           // 60 ~ -45 난수 생성하는 식
           //int num6 = random.nextInt(max - min +1) +min
           int num6 = random.nextInt(60-(-45)+ 1  + (-45));



       }
}
