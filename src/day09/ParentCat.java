package day09;

public class ParentCat {
    private String breed = "샴 고양이";
    void methodParentCat() {
        System.out.println("어미고양이 냐옹");
    }
}

class Kitten extends ParentCat {
        void methodKitten(){
            System.out.println("아기고양이 냐옹");
        }
    }
