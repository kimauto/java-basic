package day05;

public class ConditionEx01 {

    public static void main(String[] args) {

        boolean rainStatus = false;
        rainStatus = true;
        if (!rainStatus) {
            System.out.println("우산을 챙기세요");
        }

        int num = 10;
        if (num < 50) {
            System.out.println("숫자가 50보다 작은 수입니다.");
        } else {
            System.out.println("숫자가 50보다 큰 수입니다.");
        }
        System.out.println("메뉴를 번호(1-2)로 고르세요. 1.중식 2.양식 ");
        int menuChoice = 0;
        menuChoice = 1;
        if(menuChoice ==1 ){
            System.out.println("짜장면 맛있게 드세요");
        }else if(menuChoice == 2){
            System.out.println("파스타 맛있게 드세요");
        }else if(menuChoice == 3){
        System.out.println("카레 맛있게 드세요");
         }
        else{
            System.out.println("비빔밥 맛있게 드세요");
        }
    }
}
