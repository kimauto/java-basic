package day07;
// 자바에서는 문자열을 처리할때 자료형 클래스 (String , StringBuffer , StringBuilder)
// 문자열을 다루는데 있어 공통적으로 사용되지만, 사용 목적에 따라 쓰임새가 다르다.

//기본 자바에서는 String 객체의 값을 변경 할 수 없다. (Immutable 불변의: 바꿀수 없다.)
public class StringStringBufferStringBuilderEx {

    public static void main(String[] args) {
           int age = 40;
           String name = "신세계";
        System.out.println(name.hashCode());
           name = "신숙주";
        System.out.println(name.hashCode());

        String a = "Hello";
        System.out.println(a.hashCode());
        a = "Hello"+ " JAVA";
        System.out.println(a.hashCode());
        // 참조별수 a 가 참조하는 메모리의 "Hello" 값에 "JAVA" 문자열을 더해서 String객체의 값을 변경 시킨것이다.
        // 실제 메모리에서는 "Hello JAVA" 따로 만들고 참조 변수 a를 새로운 주소값으로 할당한다.
        //hashCode() : 객체의 메모리 번지를 이용해서 만든 해시코드를 반환한다.
        // 문자열 값 자체는 불변이라 변경할 수 없기때문에 새로운 문자열 데이터 객체를 대입하는 방식으로 운영하기 때문이다.
    }


}
