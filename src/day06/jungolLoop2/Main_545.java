package day06.jungolLoop2;


import java.util.Scanner;

public class Main_545 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //입력기 생성을 위해 스캐너 클래스만들기
        int num = in.nextInt();
        int threeCount = 0;  //3의 배수의 개수
        int fiveCount =  0;  // 5의 배수의 개수
        int inputCount = 0;  // 10개의 정수 입력 check


        while(true){ // 반복시작
            int number = in.nextInt();
            inputCount++;

            if(number % 3 == 0) threeCount++;
            if(number % 5 == 0) fiveCount++;
            if(inputCount == 10) break;

        }
        System.out.printf("Multiples of 3 : %d\n",threeCount);
        System.out.printf("Multiples of 5 : %d\n",fiveCount);

    }


}

