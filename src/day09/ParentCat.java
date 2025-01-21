package day09;

<<<<<<< HEAD
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
=======
class ParentCat {
      private String breed = "샴 고양이";
      void methodParentCat(){
          System.out.println("어미고양이 냐옹!");
      }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

 class Kitten extends ParentCat{
     void methodKitten(){
         System.out.println("아기고양이 미야옹!");
     }
}
>>>>>>> upstream/main
