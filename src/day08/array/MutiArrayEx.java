package day08.array;

public class MutiArrayEx {
    public static void main(String[] args) {
    //정수형 2차원 배열 생성
        int[][] scores = {
                {80,90,96},
                {76,88}
        };
        //배열의 길이  1차원 배열의 길이(반의 수)
        System.out.println(scores.length + "scores[0]" + "scores[1]");
        System.out.println(scores[0][0]);
        //scores[1] 88출력
        System.out.println(scores[1][1]);

       for(int ban = 0 ; ban < scores.length; ban++){   //반의 수만큼 반복

           for(int student = 0 ; student<scores[ban].length; student++ ){ //해당 반의 학생 수 만큼 반복
               System.out.println(scores[ban][student]);           //전체 scores 점수 출력 
           }
       }


    }
}
