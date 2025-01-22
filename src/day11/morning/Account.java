package day11.morning;
//20번
public class Account {

    private String accountNumber;
    private String owner;
    private int money;

    public Account() {
    }

    public Account(String accountNumber, String owner, int money) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.money = money;
    }



    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}



    //19번
  /*  static final int MAX_BALANCE = 1000000;
    static final int MIN_BALANCE = 0;


    private int balance;

    public Account() {
    }

    public Account(int balance) {
        this.balance = balance;
    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
            this.balance =balance;
        }
*/

