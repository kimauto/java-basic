package day12;

import java.util.Calendar;

public class WeekMain {
    public static void main(String[] args) {

        Week today = null;

        //자바 캘린더 클래스: 컴퓨터에서 제공하는 날짜, 요일, 시간을 얻어올떄 사용함
        Calendar now = Calendar.getInstance(); //Calendar 객체 얻기
        int year = now.get(Calendar.YEAR);//년
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);

        int week = now.get(Calendar.DAY_OF_WEEK); //일요일(1)~토요일(7)까지의 숫자를 얻어온다.
        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);


        //요일은 1~7까지 사이의 숫자입니다.

        switch (week) {
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;

        }

        if (today == Week.THURSDAY) {
            System.out.println("스터디가 있습니다.");
        }else {
            System.out.println("자바 혼자 공부");
        }


    }
}
