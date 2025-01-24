package day13.inheritance02;

public class Phone {

    //멤버
    private String brander;
    private String model;
    private String color;

    //멤버메소드


    public Phone() {
    }

    public Phone(String brander, String model, String color) {
        this.brander = brander;
        this.model = model;
        this.color = color;
    }

    public String getBrander() {
        return brander;
    }


    public String getModel() {
        return model;
    }


    public String getColor() {
        return color;
    }


    //벨이 울린다.
    public void bell(){
        System.out.println("벨이 울린다.");
    }
    //음성을 전송한다.
    public void sendSound(String message) {
        System.out.println("보낸사람" + message);
    }

    //전송된 음성을 상대방이 들을 수 있다.
    public void receiveVoice(String message) {
        System.out.println("받는사람" + message);
    }
    //벨이 울리면 전화를 받는다.
    public void hangOn(){
        System.out.println("전화를 받다.");
    }
    //전화를 끊는다.
    public void hangUp(){
        System.out.println("전화를 끊는다.");
    }
}
