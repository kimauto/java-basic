package day02;

import java.util.Scanner;

public class TotalEx01 {
    //멤버변수
    static Scanner input= new Scanner(System.in);

    //사칙연산 기능 메서드 fourArithmetic
    static  void fourArithmetic(){
        System.out.print("첫번째 숫자를 입력해 주세요. ");
        int a = input.nextInt();
        System.out.print("두번째 숫자를 입력해 주세요. ");
        int b = input.nextInt();;
        int result = a + b ;
        result = a + b;
        System.out.printf("a + b = %d%n",result);
        //System.out.println("a + b = " + result);
        result = a - b;
        System.out.printf("a - b = %d%n",result);
        result = a * b;
        System.out.printf("a * b = %d%n",result);
        result = a / b;
        System.out.printf("a / b = %d%n",result);
    }

    //operator 기능 메서드
    static void operator(){
        System.out.print("국어점수 입력: ");
        int kor = input.nextInt();
        System.out.print("영어점수 입력: ");
        int eng = input.nextInt();
        int total = 0;
        double average = 0.0;

        total = kor + eng;
        average = total/2.0;

        System.out.printf("총점:%d%n",total);
        System.out.printf("평균:%.2f",average);  //소수점 3번째 자리에서 반올림한 결과 출력
    }

    //실행 메서드
    public static void main(String[] args) {
        //fourArithmetic();
        operator();
    }


}
