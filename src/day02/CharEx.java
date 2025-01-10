package day02;

public class CharEx {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 65;  //유니코드 직접 저장

        char c3 = '가';
        char c4 = 44032;

        char c =' '; //char 타입의 변수에 어떤 문자도 대입하지 않으면 에러, 초기화 할 목적으로 ' ' 공백(유니코드 :32)

        System.out.printf("%c %c %c %c",c1,c2,c3,c4);

        double a = 100.0;
        int b = 200;
        System.out.println(a + " " + b);
        System.out.printf("%.2f      %d",a,b);

    }
}
