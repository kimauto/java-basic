package day10;

class A {
    //필드 선언
    A a1 = new A(true);
    A a2 = new A(1);
    A a3 = new A("문자열");

    //기본생성자
    public A() {
    }

    //public 접근 제한 생성자 선언
    public A(boolean b) {

    }
    //default 접근 제한 생성자 선언
    A(int i) {

    }
  //private 접근 제한 생성자 선언
    private A(String s) {

    }



}

