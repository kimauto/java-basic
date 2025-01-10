package day03;

import java.util.Scanner;

public class Calculator {

    //요구사항
    // 1. 두개의 정수와  +,-,*,/ 해당 연산자를 입력받아서 연산을 출력한다.
    // 2. "exit" 문자가 입력되기 전까지 사칙연산을 수행하는 루틴을 만든다.

    //생각하기
    //1. 사칙연산을 수행하는 메소드를 만든다.
    //2. 사용자 입력을 위한 입력기능
    //3. 두개의 정수 데이터와 사칙연산 구분을 위한 하나의 문자 ("+", "-","*","/")
    //4. 만약에 "+" 가 입력되었다면 덧셈연산을 한다. (덧셈기능 메소드를 호출) - if(operator.equals("+")){
    //              add(int num1, int num2)
    // }

    public static void main(String[] args) {

        String result = input();
        System.out.println(result);



    }

    static void adder(int num1, int num2) {
    }   //덧셈연산 메소드

    static void minus(int num1, int num2) {
    }   //빼기연산 메소드

    static void multiply(int num1, int num2) {
    } //곱셈연산 메소드

    static void div(int num1, int num2) {
    }

    static String input() {
        Scanner input = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력해 주세요");
        String num1 = input.nextLine();
        System.out.print("두번째 숫자를 입력해 주세요");
        String num2 = input.nextLine();
        System.out.print("연산자를 입력해 주세요. (+, - , * , /)");
        String operator = input.nextLine();
        String result = num1 + " " + num2 + " " + operator;
        System.out.println(result);
        return result;
    }

}
