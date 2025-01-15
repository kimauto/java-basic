package day06.jungolLoop2;
// 조건 1: 과목의 수는 10과목 이하이다.
// 조건 2: 변수( 과목개수 n , total , average)
// 조건 3: 평균이 80점 이상 "pass" 출력 80점 미만 "fail" 출력
// 조건 4. 출력조건: 평균은 반올림하여 소수 첫째자리까지 출력

import java.util.Scanner;

public class Main_546 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //입력기 생성을 위해 스캐너 클래스만들기
        int n = in.nextInt();  //과목수
        int total = 0;
        int count = 0;
        double average = 0.0;

        n = in.nextInt();   //과목수 입력데이터

        for (int i = 0; i < n; i++) {
            count++;
            int num1 = in.nextInt();
            total += num1;
        }
        average = (double) total / count;
        if (average >= 80) {
            System.out.printf("avg : %.1f%n", average);
            System.out.println("pass");
        } else {
            System.out.printf("avg : %.1f%n", average);
            System.out.println("fail");
        }


    }


}

