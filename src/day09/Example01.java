package day09;
// 짝홀수를 판별하는 코드를 메서드 두가지 유형으로 작성해보자
//1. 메소드의 반환값이 있는경우
//2. 메소드의 반환값이 없는경우
//3. 메소드의 매개변수가 없는경우
//4. 메소드의 매개변수가 있는경우

public class Example01 {
    public static String method1(int num){
        if(num % 2 == 0){
            System.out.println("짝수");
        }else {
            System.out.println("홀수");
        }
        return "짝수";
    }
    public static void main(String[] args) {
         int num = 10;
         String name = method1(num) + "입니다.";
         System.out.println(name);
         System.out.println(method1(num));

    }

}
