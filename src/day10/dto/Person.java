package day10.dto;

public class Person {

    private String name;
    private int age;
    private String number;



    public Person(String name, int age, String number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", number='" + number + '\'' +
                '}';
    }

    public void run(){
        System.out.println(this.name + "은 운동한다.");
    }

    public void eat(){
        System.out.println(this.name + "은 점심시간에 우동을 먹는다.");
    }

    public void walk(){
        System.out.println(this.name + "점신시간에 걷다.");
    }
}
