package day02;

public class Operator {
    public static void main(String[] args) {
        int kor = 77;
        int eng = 87;
        int total = 0;
        int average = 0;

        total = kor + eng;
        average = total/2;

        System.out.printf("총점:%d%n",total);
        System.out.printf("평균:%d",average);

    }
}
