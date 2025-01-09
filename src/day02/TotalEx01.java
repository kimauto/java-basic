package day02;

import java.util.Scanner;

public class TotalEx01 {
    //멤버변수
    static Scanner input = new Scanner(System.in);

    //사칙연산 가능 메서드 forArithmetic
    static void fourArithmetic() {
        System.out.print("첫 번쨰 숫자를 입력해 주세요. ");
        int a = input.nextInt();
        System.out.print("두 번쨰 숫자를 입력해 주세요. ");
        int b = input.nextInt();
        int result = a + b;

        System.out.printf("a + b = %d" , result);

    }

    //Operator 기능 메서드
    static void operator(){
        System.out.print("국어 점수를 입력해주세요 ");
        int kor = input.nextInt();
        System.out.print("영어 점수를 입력해주세요 ");
        int eng = input.nextInt();
        int total = kor + eng;
        double average = total/2;

        System.out.printf("총점:%d%n",total);
        System.out.printf("평균:%f",average);
    }

    //메인 메서드
    public static void main(String[] args) {

        operator();
    }
}
