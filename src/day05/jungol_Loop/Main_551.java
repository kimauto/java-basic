package day05.jungol_Loop;

import java.util.Scanner;

public class Main_551 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for(int i = 0 ; i < num ; i++){

            for(int a = 0 ; a < i ; a++){
                System.out.print(" ");
            }

            for(int j = 0 ; j < num-i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
