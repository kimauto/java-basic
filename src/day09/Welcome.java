package day09;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;


public class Welcome {
    static final int NUM_BOOK = 3; //도서의 개수에 대한 상수
    static final int NUM_ITEM = 7; //도서 정보의 개수에 대한 상수
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //키보드 입력
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 키보드 출력
    static HashMap<String, Integer> bucket = new HashMap();

    public static void main(String[] args) throws IOException {
        String[][] mBook = new String[NUM_BOOK][NUM_ITEM];

        bw.write("당신의 이름을 입력하세요 : ");
        bw.flush();
        String userName = br.readLine();
        bw.write("연락처를 입력하세요 : ");
        bw.flush();
        String userMobile = br.readLine();
        WelcomeMessage(bw);


        while (true) {
            menuIntroduction(bw);

            bw.write("메뉴 번호를 선택해주세요 : ");
            bw.flush();
            int n = Integer.parseInt(br.readLine());

            if (n < 1 || n > 8) {
                bw.write("1부터 8까지의 숫자를 입력하세요.");
                bw.flush();
            } else {
                switch (n) {
                    case 1:
                        menuGuestInfo(userName, userMobile); // 고객정보확인
                        break;

                    case 2:
                        menuCartItemList(); // 장바구니 상품 목록 보기
                        break;
                    case 3:
                        menuCartClear(); //장바구니 비우기
                        break;
                    case 4:
                        menuCartAddItem(mBook); //바구니에 항목 추가하기
                        break;
                    case 5:
                        menuCartRemoveItemCount(); //장바구니 항목 수량 줄이기
                        break;

                    case 6:
                        menuCartRemoveItem(); // 장바구니 항목 삭제하기
                        break;
                    case 7:
                        menuCartBill(); //영수증 표시하기
                        break;
                    case 8:
                        menuExit(); // 종료
                        break;

                }
            }

        }

    }

    private static void WelcomeMessage(BufferedWriter bw) throws IOException {
        bw.write("*".repeat(35) + System.lineSeparator());
        bw.write("     Welcome to Shopping Mall \n");
        bw.write("     Welcome to Book Market! \n");
        bw.flush();
    }

    private static void menuIntroduction(BufferedWriter bw) throws IOException {
        bw.write("*".repeat(35) + System.lineSeparator());
        bw.write("1. 고객 정보 확인하기  4. 바구니에 항목 추가하기\n");
        bw.write("2. 장바구니 상품 목록 보기  5. 장바구니의 항목 수량 줄이기\n");
        bw.write("3. 장바구니 비우기 6. 장바구니의 항목 삭제하기\n");
        bw.write("7. 영수증 표시하기 8. 종료\n");
        bw.write("*".repeat(35) + System.lineSeparator());
        bw.write( System.lineSeparator());
        bw.flush();
    }

    private static void menuGuestInfo(String userName, String mobile) throws IOException { //고객 정보 확인하기
        bw.write("현재 고객 정보 : \n");
        bw.write(String.format("이름 : %s 연락처 : %s%n\n", userName, mobile));
        bw.flush();
    }

    private static void menuCartItemList() throws IOException { // 장바구니 상품 목록 보기
        bw.write("2. 장바구니 상품 목록 보기\n");
        bw.flush();

        for (String s : bucket.keySet()) {
            bw.write(s + "의 수량 " + bucket.get(s) + System.lineSeparator());
            bw.flush();
        }
    }

    private static void menuCartClear() throws IOException { //장바구니 비우기
        bw.write("2. 장바구니 비우기\n");
        bw.flush();

        bucket.clear();
        bw.write("장바구니가 비어졌습니다.");
        bw.flush();
    }

    private static void menuCartAddItem(String[][] book) throws IOException {//바구니에 항목 추가하기
        BookList(book);
        for (int i = 0; i < NUM_BOOK; i++) {
            for (int j = 0; j < NUM_ITEM; j++)
                bw.write(book[i][j] + " | ");
            bw.write("\n");
        }
        bw.flush();

        boolean quit = false;

        while (!quit){ // 장바구니에 항목을 추가하지 않을 떄까지 반복하는 while문
            bw.write("장바구니에 추가할 도서의 ID를 입력하세요 :");
            bw.flush();
            String str = br.readLine(); //도서 id 입력

            boolean flag = false;
            int numId = -1;

            for (int i = 0; i < NUM_BOOK; i++) {
                if (str.equals(book[i][0])) {
                    numId = i;
                    flag = true;
                    break;
                }
            }

            if (flag) {
                bw.write("장바구니에 추가하겠습니까? Y | N\n");
                bw.flush();
                str = br.readLine();

                if (str.toUpperCase().equals("Y")) {
                    Integer k = bucket.getOrDefault(book[numId][0], 0);
                    bucket.put(book[numId][0], k + 1);
                    bw.write(book[numId][0] + " 도서가 장바구니에 추가되었습니다.\n");
                    bw.flush();
                }
                quit = true;
            }else
                bw.write("다시 입력해 주세요.\n");
                bw.flush();
        }
    }

    private static void menuCartRemoveItemCount() throws IOException {//장바구니 항목 수량 줄이기
        bw.write("5. 장바구니의 항목 수량 줄이기\n");
        bw.flush();
        bw.write("수량을 줄일 책 Id를 입력하세요 : ");
        bw.flush();
        String id = br.readLine();
        if (bucket.containsKey(id)) {
            Integer i = bucket.get(id);
            if (i < 0){
                bw.write("장바구니에 해당 제품이 담겨있지 않습니다.");
                bw.flush();
            }
            bucket.put(id, --i);
            bw.write(String.format("%s의 수량이 줄었습니다.\n",id));
            bw.write(String.format("%s의 수량의 갯수 %d\n", id,bucket.get(id)));
            bw.flush();


        }


    }

    private static void menuCartRemoveItem() throws IOException {// 장바구니 항목 삭제하기
        bw.write("2. 장바구니 항목 삭제하기\n");
        bw.flush();
        bw.write("삭제할 상품ID를 입력해주세요 : ");
        bw.flush();
        String id = br.readLine();
        if (bucket.containsKey(id)) {
            bucket.remove(id);
            bw.write("해당 상품이 장바구니에서 삭제되었습니다.");
            bw.flush();
        }else {
            bw.write("입력하신 상품ID가 장바구니에 담겨있지 않습니다.");
            bw.flush();
        }
    }

    private static void menuCartBill() throws IOException {//영수증 표시하기
        bw.write("2. 영수증 표시하기\n");
        bw.flush();
    }

    private static void menuExit() throws IOException {// 종료
        bw.write("8. 종료\n");
        bw.flush();

        System.exit(0);
    }

    public static void BookList(String[][] book){
        book[0][0] = "ISBN1234";
        book[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
        book[0][2] = "27000";
        book[0][3] = "송미영";
        book[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍";
        book[0][5] = "IT전문서";
        book[0][6] = "2018/10/08";

        book[1][0] = "ISBN1235";
        book[1][1] = "안드로이드 프로그래밍";
        book[1][2] = "33000";
        book[1][3] = "우재남";
        book[1][4] = "실습 단계별 명쾌한 멘토링!";
        book[1][5] = "IT전문서";
        book[1][6] = "2022/01/22";

        book[2][0] = "ISBN1236";
        book[2][1] = "스크래치";
        book[2][2] = "22000";
        book[2][3] = "고광일";
        book[2][4] = "컴퓨팅 사고력을 키우는 블록 코딩";
        book[2][5] = "컴퓨터입문";
        book[2][6] = "2019/06/10";
    }
}
