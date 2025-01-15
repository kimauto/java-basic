package day06.jungolLoop1;
// 조건 1. 한 개의 정수 입력
// 조건 2. 입력기 생성
// 조건 3. 1부터 입력받은 정수 가 양수인지 음수인지를 판별해서 Loop (반복문) 출력
// 조건 4. 정수를 입력받았을때 0 이라면 프로그램을 종료 (0 은 출력하지 않는다.)


import java.util.Scanner;

public class Main_538 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.print("number? ");
            int num = in.nextInt();
            if(num == 0){
                break;
            } else if(num > 0 ){
                System.out.println("positive integer");
            } else if(num < 0 ) {
                System.out.println("negative number");
            }
        }
    }
}
