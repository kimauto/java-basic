package day13.inheritance02;

public class Main {

    public static void main(String[] args) {

        //Phone 타입으로 유선전화를 생성하여
        Phone phone = new Phone();
        //1. 전화를 건다.
        phone.bell();
        //2. 전화를 받는다.
        phone.hangOn();
        //3. 메세지를 전송한다.
        phone.sendSound("김병곤");
        //4. 메세지를 수신한다.
        phone.receiveVoice("김병곤");
        //5. 전화를 끊는다.
        phone.hangUp();

        System.out.println("--------------------------");

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setWifi(true);
        smartPhone.bell();
        smartPhone.hangOn();
        smartPhone.sendSound("김병곤");
        smartPhone.receiveVoice("김병곤");
        smartPhone.hangUp();

        System.out.println("--------------------------");

        SmartPhone smartPhone1 = new SmartPhone("사과", "15 pro", "화이트");
        smartPhone1.setWifi(true);

        smartPhone1.bell();
        smartPhone1.hangOn();
        smartPhone1.sendSound("김병곤");
        smartPhone1.receiveVoice("김병곤");
        smartPhone1.hangUp();




    }
}
