package day06.jungolLoop2;


import java.util.Scanner;

public class Main_543 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //입력기 생성을 위해 스캐너 클래스만들기
        int num = in.nextInt();
        int i = 2;

        while(true){
            System.out.printf(i + " ");
            i += 2;
            if(i > num) break;
        }


    }


}

