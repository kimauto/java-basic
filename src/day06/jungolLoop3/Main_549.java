package day06.jungolLoop3;


import java.util.Scanner;

public class Main_549 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //입력기 생성을 위해 스캐너 클래스만들기
        int n = in.nextInt();
        int total = 0;       // 입력된 범위에서 홀수의 합계
        int oddCount = 0;   //홀수의 개수

        for(int i = 0 ;  i < n ; i++){
            if(i%2 == 1) {   //홀수의 경우 찾기
                oddCount++;
                total += i;
            }

            if(total >= n) break;
        }
        System.out.printf("%d %d",oddCount,total);
    }


}

