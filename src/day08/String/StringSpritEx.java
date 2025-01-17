package day08.String;
//자바 문자열 자르는 방법 2가지
//1. String 클래스의 split()  java.lang.String
//매개변수(parameter)갯수가 다른 2개로 오버로딩 되어 있다.
//다형성 : 오버로딩 : 메서드의 이름이 같으면서 매개변수 타입이나 매개변수 개수를 달리해서
//2. StringTokenizer 클래스   java.util.StringTokenizer

public class StringSpritEx {
    public static void main(String[] args) {
        String str = "input-github.com@thatzcool#aaaa@bbb";
        String[] splitter = str.split("[%-@#]");


        System.out.println(splitter[0]);
        System.out.println(splitter[1]);
        System.out.println(splitter[2]);
        System.out.println(splitter[3]);
        System.out.println(splitter[4]);
        System.out.println(splitter[5]);
//        int i = 0;
//        for (String data : splitter) {
//            System.out.printf("% d 위치 : %s%n", ++i, data);
//        }
//      for (int index = 0; index < splitter.length; index++) {
//           System.out.println(splitter[index]);
//        }

        }

    }
