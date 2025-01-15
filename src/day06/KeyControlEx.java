package day06;

import java.util.Scanner;

//CLI Application : 키보드에서 1 (증가),2(감소),3(프로그램 종료) 입력했을때 속도를 증가,감소,종료하는 프로그램
public class KeyControlEx {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean run = true;   // 현실세계에서 자동차가 달리다. ==> 컴퓨터 세계 boolean run = true (엔진을 켜다)
        int speed = 0;
        while (run) {   //메뉴생성
            System.out.println("-------------------------------");
            System.out.println("1. 속도증가  | 2. 감속  | 3. 중지");
            System.out.println("-------------------------------");
            System.out.print("선택하세요");

            String strNum = in.nextLine();    // 키보드에서 입력한 내용 읽어서 변수 strNum에 저장


            if (strNum.equals("1")) {
                speed++;
                System.out.println("현재 속도 = " + speed);
            } else if (strNum.equals("2")) {
                speed--;
                System.out.println("현재 속도 = " + speed);
            } else if (strNum.equals("3")) {
                run = false;
            }
        }

        System.out.println("프로그램 종료");
    }

}
