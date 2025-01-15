package day06.jungolLoop2;
// 조건 1: 과목의 수는 10과목 이하이다.
// 조건 2: 변수( 과목개수 n , total , average)
// 조건 3: 평균이 80점 이상 "pass" 출력 80점 미만 "fail" 출력
// 조건 4. 출력조건: 평균은 반올림하여 소수 첫째자리까지 출력

import java.util.Scanner;

public class Main_548 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //입력기 생성을 위해 스캐너 클래스만들기
        for (int i = 2; i <= 4; i++) {      // 단 출력 : 2 ~ 4 단
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%d * %d = %2d   ",i,j,i*j);
            }
            System.out.println();
        }


    }


}

