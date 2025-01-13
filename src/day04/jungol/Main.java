package day04.jungol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Scanner 선택하여 입력기 생성
        Scanner input = new Scanner(System.in);
        //2. 데이터를 저장하기 위한 변수 선언
        int num1, num2, result;

        //3. 데이터 입력받기
        num1 = input.nextInt();
        num2 = input.nextInt();
        //4. 데이터 연산처리
        result = num1 + num2;
        System.out.println(num1 +" "+"+"+" " + "=" +" "+result);
        System.out.printf("%d + %d = %d",num1,num2,result);
        result = num1 - num2;
        System.out.printf("%d - %d = %d",num1,num2,result);
        result = num1 * num2;
        System.out.printf("%d * %d = %d",num1,num2,result);
        result = num1 / num2;
        System.out.printf("%d / %d = %d",num1,num2,result);
        result = num1 % num2;
        System.out.printf("%d  %d = %d",num1,num2,result);


        //5. 출력포맷에 맞도록 출력


    }
}
