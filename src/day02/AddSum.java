package day02;
import java.util.Scanner;

public class AddSum {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int value = 10; // 기본값

        // 입력받고 계산하는 메서드 호출
        int result = calculateResult(value);

        // 결과 출력
        System.out.println("결과: " + result);
    }

    // 사용자 입력을 받아 합계를 계산하는 메서드
    public static int calculateResult(int value) {
        System.out.println("숫자를 입력하시오:");
        int userInput = input.nextInt(); // 사용자 입력
        return value + userInput; // 합계 반환
    }
}
