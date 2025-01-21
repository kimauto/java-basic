package day10;

public class A {
    //필드 선언
    A a1 = new A(true);
    A a2 = new A(1);
    A a3 = new A("문자열");

    // 기본 생성자
    public A(){}

    //public 접근 제한 생성자 선언
    public A(Boolean b ) {


    }
    //default 접근
    A(int i) {


    }

    //private 접근 제한 생성자 선언
    private A(String b) {


    }


    public A(A a1, A a2, A a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }
}
