package day06;
//continue 문은 반복문 for, while,do-while 문 안에서만 사용되는 명령어
//블록 내부에서 continue 문이 실행되면, for,while,do-while 문의 증감식,(조건식)으로 바로 이동한다.

// 1에서 10사이의 수 중에서 짝수만 출력하고 홀수인 경우는 다음 반복으로 넘어가도록 프로그램
public class ContinueEx {
    public static void main(String[] args) {

       for(int i = 1 ; i<=10 ; i++){
           if(i%2 == 0){                 //i%2 != 0   ,  i%2 == 1
               continue;
           }
           System.out.print(i + " ");

       }


    }
}
