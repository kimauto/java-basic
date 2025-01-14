package day05.jungol_condition;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ex01();
        ex02();
        ex3();
    }

    static void ex3() {
        System.out.print("점수를 입력하세요. ");
        int score = input.nextInt();

        if (score >= 80) {
            System.out.println("축하합니다. 합격입니다.");
        } else {
            System.out.println("불합격입니다.");
        }


    }

    static void ex01() {
        int num = input.nextInt();
        System.out.println(num);
        if (num > 10) {
            System.out.println("10보다 큰 수를 입력하셨습니다.");
        }
    }

    static void ex02() {
        int n1, n2;
        n1 = input.nextInt();
        n2 = input.nextInt();

        if (n1 > n2) {
            System.out.printf("입력받은 수 중 큰 수는 %d이고 작은 수는 %d입니다.", n1, n2);
        }
    }
}
