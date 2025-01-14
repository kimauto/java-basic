package day05;

public class Loop_ForEx {

    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {    //행
            for (int j = 1; j <= 5; j++) {    //해당 행에 대한 열
                System.out.println("(" + i + "," + j + ")");
            }
        }
        for (int dan = 2; dan <= 9; dan++) {
            System.out.printf("===== %d 출력=======%n",dan);
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d X %d = %d%n", dan, i, dan * i);
            }

        for(int i = 1 ; i<=3; i++){
             for(int j = 1; j <= i ; j++){
               System.out.print("*" + " ");
            }
            System.out.println();
        }




        }
    }

}

