package day07;

public class Q1 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        System.out.println(a.hashCode() + " " + b.hashCode() + " ");
        a = a + "JAVA";
        System.out.println(a.hashCode() + " " + b.hashCode() + " ");

        // 도대체 왜? 불변으로 설계 되었는가?
        //1. JVM 에서는 String Constrant Pool(문자열 상수풀 운영) 문자열을 상수(값 변경 불가)화 시켜서 다른 변수 또는 다른 객체 공유하게 한다.
        //2. 데이터가 불변하다면, Multi-Thread 환경에서 동기화 문제 발생하지 않기 때문에 안정된 서비스를 제공할 수 있다.
        //3. 보안(Security)

        // String 주소할당 방식 : 1. 리터럴 할당 방식 2. new String() 할당 방식

    }
}

