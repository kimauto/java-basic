package day13.inheritance02;

public class SmartPhone extends Phone {
    //wifi 기능 추가
    private boolean wifi;

    public SmartPhone() {
        super();
    }
    public SmartPhone(String bander, String model, String color) {
        super(bander, model, color);
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        String brander = super.getBrander();

        System.out.println(brander + "wifi 의 상태를 변경하였습니다.");
        internet();
    }

    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }
}
