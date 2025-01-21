package day09;

public class Example02 {
    public static void callPrint(){
        System.out.println("static 메서드입니다.");
        System.out.println(5+6);
    }
    public static void callPrint(String message){
        System.out.println(message);
    }
    public static void callPrint(int num1, int num2){
           System.out.println(num1+num2);
    }

    public static void main(String[] args) {
        callPrint();
        callPrint("static 메소드 callPring 이어요");
        callPrint(2,3);
    }

}
