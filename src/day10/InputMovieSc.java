package day10;

import java.util.Objects;
import java.util.Scanner;

public class InputMovieSc {
    static final Scanner input = new Scanner(System.in);

    public MovieDTO printObject(MovieDTO movie){
        System.out.println("영화 제목 입력");
        movie.title = input.nextLine();
        System.out.println("개봉일 입력");
        movie.startDate = input.nextInt();
        System.out.println("배우 이름 입력");
        movie.actor = input.nextLine();
        System.out.println("장르 입력");
        movie.gender = input.nextLine();
        System.out.println("등급 입력");
        movie.grade = input.nextLine();

        return movie;
    }
}
