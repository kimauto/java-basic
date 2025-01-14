package day05.jungol_Loop;

import java.util.Scanner;

public class Main_549 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //변수 선언 (자연수 n , 홀수의 합 , 홀수의 개수)
        int num = in.nextInt();
        int total = 0;   // 1~num 사이의 값중 홀수만의 누적값
        int count = 0;
        for (int i = 0 ; i < num ; i++){
            if(i % 2 == 1){   //홀수의 경우를 찾기위한 조건문
                count++;   //홀수 카운트
                total += i;   //홀수의 누적값
            }

            if(total >= num) break;
        }
        System.out.printf("%d %d",count,total);

    }
}
