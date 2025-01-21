package day10;

import day10.dto.MovieDTO;

public class MovieMain {

    public static void main(String[] args) {
        MovieDTO movie1 = new MovieDTO();
//        movie1.title = "검은수녀들";
//        movie1.startDate =20250105;
//        movie1.actor = "송혜교";
//        movie1.runningTime = "150";
//        movie1.grade ="15이상";
//
//        //히트맨2의 정보를 참조하여 영화를 생성해 주세요
//        MovieDTO movie2 = new MovieDTO();
//        movie2.title = "히트맨2";
//        movie2.startDate =20250110;
//        movie2.actor = "권상우";
//        movie2.runningTime = "180";
//        movie2.grade ="15이상";


        // 검은수녀들 영화에 대한 정보를 출력하세요 
//        System.out.println(movie1.title + " 정보를 확인하세요");
//        System.out.println(movie1.startDate);
//        System.out.println(movie1.actor);
//        System.out.println(movie1.runningTime);
//        System.out.println(movie1.grade);

        //히트맨 2의 정보 출력하세요
//        System.out.println(movie2.title + " 정보를 확인하세요");
//        System.out.println(movie2.startDate);
//        System.out.println(movie2.actor);
//        System.out.println(movie2.runningTime);
//        System.out.println(movie2.grade);

        //영화정보를 출력할때 마다 반복적인 문장의 묶음 , printMovie 메서드로 리팩토링 하세요 !
         movie1.moviePrint(movie1);
//         movie2.moviePrint(movie2);
        //영화정보를 입력받는 inputMovie 메서드 생성하세요
        InputMovieSc movieSc = new InputMovieSc();
        MovieDTO movie3 = new MovieDTO();
        MovieDTO movie4 =  movieSc.inputObject(movie3);
        movie3.moviePrint(movie4);
    }


}
