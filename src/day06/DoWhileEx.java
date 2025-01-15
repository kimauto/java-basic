package day06;

import java.util.Scanner;

public class DoWhileEx {
//채팅창에서 메세지를 키패드를 이용하여 입력하고, 입력메세지를 채팅창에 출력할때 사용하는 기능
    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요");
        System.out.println("프로그램을 종료하려면 \"exit\"를 입력하세요");

        Scanner in = new Scanner(System.in);
        String inputString;   //입력된 내용중 "exit" 가 입력되면 프로그램 종료, 아니면 반복
        
        do{
            System.out.print("> ");
            inputString = in.nextLine();
            System.out.println(inputString);
            
        }while(  !inputString.equals("exit")   );

        System.out.println();
        System.out.println("프로그램 종료");
        
    }
}
