package day06;

import java.util.Scanner;

public class BreakEx {
    //주사위 6개의 면에는 1~6까지의 숫자있다. 1~5까지의 숫자가 나오면 계속 주사위를 던지고, 6이 나오면 게임을 종료
    //플레이를 할 때 주사위의 숫자는 예측할 수 없다.
    //현재 num = 6 이면 종료되는 코드를, 사용자가 exit 입력했을때 종료되는 코드로 바꿔주세요!
    public static void main(String[] args) {
        System.out.println("===주사위 게임====");
        System.out.println("게임을 종료하려면 \"exit\"를 입력하세요");

        Scanner in = new Scanner(System.in);
        String inputString;
        while(true){
              int num  = (int)(Math.random()*6)+1;    //Math.random() 메소드는 0.0~1 사이의 무한히 가까운 수를 제공  0.0,0,0001,0.000000001,0.9
              System.out.println(num);
//            if(num == 6){
//                System.out.println("주사위 게임을 종료합니다.");
//                break;
//            }
              System.out.println("게임을 중단하시겠습니까? ");
              String message = in.nextLine();
              if(message.equals("exit")){
                  break;
              }
        }

    }
}
