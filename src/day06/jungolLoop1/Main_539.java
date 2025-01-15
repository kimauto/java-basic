package day06.jungolLoop1;
// 조건 1. 정수를 계속 입력(무한 루프)
// 조건 2. 입력기 생성
// 조건 3. 입력된 수가 100이상의 수가 입력되면 마지막 입력된 수 포함한 합계와 평균을 구하시오 음수인지를 판별해서 Loop (반복문) 출력
// 조건 4. 합계와 평균(소수 첫째자리까지) 출력


import java.util.Scanner;

public class Main_539 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //평균값 연산을 위한 수의 개수를 세어야 한다.
        int count = 0;
        //입력된 수의 합계 저장
        int total = 0;
        //평균
        double average = 0.0;

        while(true){
            int num = in.nextInt();  //100이상의 수가 나오기 전까지의 입력된 수를 저장
            count++;   //count = count + 1
            total += num;   // total = total + num ;
            if(num>=100) break;

        }
        average = (double)total/count;
        System.out.printf("%d%n",total);
        System.out.printf("%.1f%n",average);  //소수2째자리에서 반올림한 후 , 소수 첫째자리까지 출력
    }
    }
