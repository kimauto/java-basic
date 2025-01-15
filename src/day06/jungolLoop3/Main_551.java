package day06.jungolLoop3;


import java.util.Scanner;

public class Main_551 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //입력기 생성을 위해 스캐너 클래스만들기
        int n = in.nextInt();
        for (int row = 0; row < n; row++) {   //행  반복
            for (int column = 0; column <= row; column++) {
                System.out.print(" ");
            }
            for (int star = 0; star < n - row; star++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }


}

