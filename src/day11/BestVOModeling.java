package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class BestVOModeling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 영화의 총 개수를 입력하세요.");
        int movieTotal = sc.nextInt();
        sc.nextLine();

        ArrayList<MovieVO> movieVOArrayList = new ArrayList<>();

        for (int i = 0; i < movieTotal; i++) {
            System.out.println(i + "번째 제목, 배우, 등급을 입력하세요.");
            MovieVO movieVO = new MovieVO();
            System.out.print("제목: ");
            movieVO.setTitle(sc.nextLine());
            System.out.print("배우: ");
            movieVO.setActor(sc.nextLine());
            System.out.print("등급: ");
            movieVO.setGrade(sc.nextInt());
            sc.nextLine();
            movieVOArrayList.add(movieVO);
        }
        //정보 출력
        movieVOArrayList.stream().forEach(x -> {
            System.out.printf("제목 : %s, 배우 : %s, 등급 : %d\n",
                    x.getTitle(), x.getActor(), x.getGrade());
        });

    }


}
