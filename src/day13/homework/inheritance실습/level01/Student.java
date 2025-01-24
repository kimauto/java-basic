package day13.homework.inheritance실습.level01;

public class Student {
    private String name;
    private String subject;
    private int fee;
    private double returnFee;

    public Student(String name, String subject, int fee) {
        this.name = name;
        this.subject = subject;
        this.fee = fee;
    }

    public void calcReturnFee(){
        if (subject.equals("javaprogram")) {
            returnFee = fee * 0.25;
        }else if (subject.equals("jsppromgram")) {
            returnFee =  fee * 0.2;
        }else
            System.out.println("그런 과정명은 없습니다.");
    }
    public void print(){
        System.out.println(this.name + "의 과정명은 " + this.subject + "이고 교육비는 " + this.fee +"이며 환급금은 " + returnFee + "입니다.")  ;
    }

    //    /public static void main(String args[]){
////	Student stu = new Student("장동건", "jspprogram",
////			500000);
////	 stu.calcReturnFee();
////	stu.print();

}
