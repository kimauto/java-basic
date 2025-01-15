package day06.jungolLoop1;
// 조건 1. 100이하의 양의 정수
// 조건 2. 입력기 생성
// 조건 3. 1부터 입력받은 정수 => Loop (반복문) for(반복구간이 정해져 있다면)
// 조건 4. 1~마지막 입력받은 수까지의 합
// 조건 5. 최종합을 출력한다.

import java.util.Scanner;

public class Main_537 {

    public static void main(String[] args) {
        int inputNum;
        Scanner in = new Scanner(System.in);
        int total = 0;  // 합계
        inputNum = in.nextInt();   //사용자가 입력한 max

        for(int i = 1; i <= inputNum;i++){
            total += i;
                   }
//        int i = 0;
//        while(i<=inputNum){
//            total += i;
//            i++;        }
        System.out.println(total);

    }
}
