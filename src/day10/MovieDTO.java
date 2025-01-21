package day10;

import java.util.Date;

public class MovieDTO {
    //영화 제목
      String title;
    //개봉일
     Integer startDate;
    //주인공
     String actor;
    //장르
     String gender;
    //러닝타임
     String runningTime;
    //등급
     String grade;

    @Override
    public String toString() {
        return "MovieDTO{" +
                "title='" + title + '\'' +
                ", startDate=" + startDate +
                ", actor='" + actor + '\'' +
                ", gender='" + gender + '\'' +
                ", runningTime='" + runningTime + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
