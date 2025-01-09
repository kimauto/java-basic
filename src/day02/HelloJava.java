package day02;

import java.util.Scanner;

/*
1. "Hello Java" 문자열을 출력하는 HelloJava 클래스를 작성하세요.
2. "Hello Java"를 출력한 후 사용자에게 이름을 입력받아 "Hello 구탱이" 출력하세요
 */
public class HelloJava {
    public static void main(String[] args) {

        System.out.println("Hello Java");
        callName();
        System.out.println("당신의 이름을 입력해 주세요");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("당신의 이름은 " + name);

        callName();
       String eat =  callStringName();
        System.out.println(eat);
        eat = eat + "맛있다. 냠냠";
        System.out.println(eat);

        callStringParam(eat);
    }

    public static void callName(){
        System.out.println("내 이름을 불러죠...아하하하");
    }

    public static String callStringName(){
        String name ="라면";
        return name;
    }
    
    public static void callStringParam(String eat){
        System.out.println(eat);
    }

}
