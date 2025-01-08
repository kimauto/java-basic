package day01;

import java.util.Scanner;

public class Calculator {
    //1 + 1 =?
    public static void main(String[] args) {
        //1. 데이터 자유 입력
        Scanner in = new Scanner(System.in);
        System.out.println("first number input: ");
        int a = in.nextInt();    //1
        System.out.println("end number input: ");
        int b = in.nextInt();   //100
        int sum = 0;
        //2. 데이터 처리   //3. 데이터 결과 저장
        //sum = a + b;


        for (int i = a; i <= b; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
            if (i % 2 == 1) {
                sum = sum + i;   //sum += i;
            }
        }
        //문제 : for문을 이용하여 1-100까지의 합을 구하는 결과 출력
        //4. 결과 출력
        System.out.println("1-100 더한 결과 값 : " + sum);
        //System.out.println("결과값 => " +  a + " + " + b + " = " + sum );


    }
}

