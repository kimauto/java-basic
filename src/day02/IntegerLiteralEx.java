package day02;
//코드에서 프로그래머가 직접 입력한 값을 리터럴(Literal) , 변수에 대입할 정수 리터럴을 진수에 따라 작성해 본것이다.
public class IntegerLiteralEx {
    public static void main(String[] args) {
        // 10진수 11을 이진수로 저장하려고 한다. 어떻게 표현하면 될까?
        int x = 0b1011;   //0B1011  = 11
        System.out.println(x);

        // 10진수 11을 8진수로 저장하려고 한다. 어떻게 표현하면 될까?
        int y = 013;
        System.out.println(y);

        // 16진수 0x, 0x 로 시작하고 0~9   숫자 그대로 10~15 A~F , a~f 로 표현한다.
        int z = 0xB;
        System.out.println(z);


    }
}
