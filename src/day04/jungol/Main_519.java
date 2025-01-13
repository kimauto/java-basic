package day04.jungol;

import java.util.Scanner;

public class Main_519 {
    public static void main(String[] args) {
        //정수 2개를 입력받아서 첫 번째 수에는 100을 증가시켜 저장하고 두 번째 수는 10으로 나눈 나머지를 저장한 후 두 수를 차례로 출력하는 프로그램을 작성하시오.
        //1. 입력기 생성
             Scanner input = new Scanner(System.in);
        //2. 변수선언
             int n1,n2,result;
        //3. 데이터 입력
        n1 = input.nextInt();
        n2 = input.nextInt();

        //4. 데이터 처리
        n1 = n1 + 100;
        n2 = n2 % 10;

        //5. 출력
        System.out.printf("%d %d",n1,n2);
    }
}
