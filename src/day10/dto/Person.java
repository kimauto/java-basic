package day10.dto;

public class Person {
    private String name;
    private int age;
    private String phone;
    // 생성자 오버로딩 한 경우 컴파일러는 자동으로 기본생성자를 생성해 주지 않으므로, 필요시 개발자가 기본 생성자를 기술해 주어야 한다.
    public Person(){} // default constructor 기본생성자 :만약 개발자가 기술해 놓지 않으면 컴파일시 컴파일러가 생성해준다.

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Person(String name, int age, String phone){
         this.name = name;
         this.age = age;
         this.phone = phone;    //생성자 오버로딩
    }
    public Person(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
   public  String play(){
        return "운동한다.";
    }
    public String eat(){
         return  "먹다";

    }
    public String walk(){
        return "걷다";
    }
}
