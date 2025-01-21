package day09;

public class EncapusulationMain {

    public static void main(String[] args) {
        Encapsulation en1 = new Encapsulation();
        System.out.println(en1.getName());   //직접 접근 불가
        en1.setName("신세경");
        System.out.println(en1.getName());
    }
}

//객체지향에서 캡슐화라는 의미는 클래스의 멤버(데이터)의 보호
//안전하게 직접접근하여 데이터를 조작하는 것을 제한한다.
//다만, public 메소드를 통하여 해당 데이터의 데이터를 보고, 데이터를 변경하는 것을 간접적으로 지원한다.
