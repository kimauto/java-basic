package day02;

public class Q1 {
    public static void main(String[] args) {
        String v0 = "Park g.h.";
        String v1 = "홍길동";
        String v2 = new String("홍길동");
        System.out.println(v0.hashCode()); // -121366013
        System.out.println(v1.hashCode()); // 54150062 리터럴 풀 주소값 동일
        System.out.println(v2.hashCode()); // 54150062 리터럴 풀 주소값 동일
        System.out.println("홍길동".hashCode()); // 54150062 리터럴 풀 주소값 동일
        // 비교 연산자(==)는 주소값을 비교
        System.out.println(v2 == "홍길동"); // false (v2는 동적할당 되었으므로 heap영역에서 리터럴 풀의 주소값을 참조하게 됨)
        System.out.println(v1 == "홍길동"); // true (v1은 문자열 리터럴을 바로 받았기 때문에 리터럴 풀의 주소값을 가짐)
        // 문자열 비교함수(equals)는 문자열 자체의 값을 비교
        System.out.println(v2.equals("홍길동")); // true
    }
}
