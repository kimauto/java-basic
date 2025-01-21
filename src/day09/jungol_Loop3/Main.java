package day09.jungol_Loop3;

import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        int row = 5;
        int column = 5;
        int[][] array = new int[row][column];

        System.out.println(1);
        array[0][0]= 1;
        for(int i =1; i < row ; i++){
            System.out.print(1 + " ");
            array[i][0] = 1;
            for(int j = 1; j < i +1 ;j++){
                if(j == i) array[i][j] = 1;
                else array[i][j] = array[i-1][j] + array[i-1][j-1];
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

}