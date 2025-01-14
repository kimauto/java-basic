package day05;

import java.sql.SQLOutput;

public class LoopEx01 {

    public static void main(String[] args) {

        for(int i = 1;i<=15;i++){
            System.out.print(i + " ");
        }
        System.out.println();   // newLine 문장
        int start = 1;

        while(start <= 15){
            System.out.print(start + " ");
            start++;
        }

    }
}
