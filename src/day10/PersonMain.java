package day10;

import day10.dto.Person;

public class PersonMain {
    public static void main(String[] args) {
         Person 김선민 = new Person();
        // 김선민.name ="김선민";
         김선민.setName("김선민");
        // 김선민.age = 24;
        // 김선민.phone = "010-5657-8909";
         //생성자 오버로딩을 통해 객체를 생성후 멤버변수에 값을 할당할 수 있다.
         Person 최문규 = new Person("최문규",27,"010-8787-8989");

        System.out.println(최문규.getName() + "  " +  최문규.eat());
         김선민.play();
      // 자신 이름의 객체 생성 , 생성자 오버로딩한 생성자 이용. Person 클래스의 age, phone private 로 변경
         Person 서유미 =  new Person("서유미", 30 , "010-8987-8978");
      // 서유미 운동한다.
        System.out.println(서유미.getName() + " " + 서유미.play());
      // 서유미 점심시간에 우동을 먹다.
        System.out.println(서유미.getName() + " 점심시간에 우동을" + 서유미.eat());

      //서유미 점심시간에 걷다
        System.out.println(서유미.getName() + " 점심시간에" + 서유미.walk());
    }
}
