package day06.jungolLoop1;
// 조건 1. 정수를 입력(무한 루프)
// 조건 2. 입력기 생성
// 조건 3. 입력된 수가 3의 배수이면 3으로 나누어 몫을 출력 , 3의 배수가 아니면 작업내용이 없다. Loop (반복문) 출력


import java.util.Scanner;

public class Main_540 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0;   // 3의 배수일경우 3으로 나눈 몫을 저장

        while(true){
             int num = in.nextInt();

             result = (num/3);

             if(num == -1){
                 break;
             }
             if(num % 3 == 0) {
                 System.out.println(result);
             }

        }



    }
}
