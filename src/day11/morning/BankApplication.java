package day11.morning;

import java.util.Scanner;
//20번
public class BankApplication {

    static Scanner input = new Scanner(System.in);
    static Account[] accounts = new Account[100];

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            printMenu();
            int number = input.nextInt();
            input.nextLine();

            switch (number) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    showAccounts();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    running = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("-".repeat(50));
        System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
        System.out.println("-".repeat(50));
        System.out.print("선택 > ");
    }

    private static void createAccount() {
        System.out.println("-".repeat(10));
        System.out.println("계좌생성");
        System.out.println("-".repeat(10));
        System.out.print("계좌번호: ");
        String accountNumber = input.nextLine();
        System.out.print("계좌주: ");
        String owner = input.nextLine();
        System.out.print("초기입금액: ");
        int money = input.nextInt();
        input.nextLine(); // 줄바꿈 문자 처리

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = new Account(accountNumber, owner, money);
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
    }

    private static void showAccounts() {
        System.out.println("-".repeat(10));
        System.out.println("계좌목록");
        System.out.println("-".repeat(10));
        for (Account account : accounts) {
            if (account != null) {
                System.out.println(account.getAccountNumber() + "  " + account.getOwner() + "  " + account.getMoney());
            }
        }
    }

    private static void deposit() {
        System.out.println("-".repeat(10));
        System.out.println("예금");
        System.out.println("-".repeat(10));
        System.out.print("계좌번호: ");
        String accountNumber = input.nextLine();
        System.out.print("예금액: ");
        int money = input.nextInt();
        input.nextLine(); // 줄바꿈 문자 처리

        boolean found = false;
        for (Account account : accounts) {
            if (account != null && accountNumber.equals(account.getAccountNumber())) {
                account.setMoney(account.getMoney() + money);
                System.out.println("결과: 입금이 완료되었습니다.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("없는 계좌입니다. 다시 확인해주세요.");
        }
    }

    private static void withdraw() {
        System.out.println("-".repeat(10));
        System.out.println("출금");
        System.out.println("-".repeat(10));
        System.out.print("계좌번호: ");
        String accountNumber = input.nextLine();
        System.out.print("출금액: ");
        int money = input.nextInt();
        input.nextLine(); // 줄바꿈 문자 처리

        boolean found = false;
        for (Account account : accounts) {
            if (account != null && accountNumber.equals(account.getAccountNumber())) {
                if (account.getMoney() >= money) {
                    account.setMoney(account.getMoney() - money);
                    System.out.println("결과: 출금이 성공적으로 처리되었습니다.");
                } else {
                    System.out.println("잔액이 부족합니다.");
                }
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("없는 계좌입니다. 다시 확인해주세요.");
        }
    }
}
