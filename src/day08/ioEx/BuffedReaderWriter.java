package day08.ioEx;
//BufferedReader ,BufferedWriter

import java.io.*;
import java.util.StringTokenizer;
//java.io.모든 클래스 import 하겠다.   import java.io.*;

public class BuffedReaderWriter {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // 키보드 입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  //콘솔 출력
//        String str = br.readLine();  //한줄에 입력받기
//        bw.write(str);
//        bw.flush();    //남은 값 모두 출력하면서 비우기 기능

          int number = Integer.parseInt(br.readLine());    // 5를 정수로 형변환 한 후 저장

         for(int i = 1;  i <= number; i++){
             StringTokenizer st = new StringTokenizer(br.readLine());
             int first = Integer.parseInt(st.nextToken());   //첫번째로 입력된 숫자 저장
             int second = Integer.parseInt(st.nextToken());  //두번째로 입력된 숫자 저장

             bw.write(String.valueOf(first)+ " ");
             bw.write(String.valueOf(second)+"\n");
         }
         bw.flush();



    }
}
