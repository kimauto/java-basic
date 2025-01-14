package day05;

public class SwitchEx {
    public static void main(String[] args) {
        char ch = 'B';

        switch (ch) {
            case 'A':
                System.out.println("매우 우수");
                break;
            case 'B':
                System.out.println("우수");
                break;
            case 'C':
                System.out.println("좋음");

                break;
            default:
                System.out.println("잘못된 등급");
        }
    }
}
