package day13.homework.inheritance실습.level02;

public class CheckingAccount extends Account{
    private String cardNo;

    public CheckingAccount(String accId,  String ownerName,long balance ,String cardNo) {
        super(accId, balance, ownerName);
        this.cardNo = cardNo;
    }

    public void pay(long amount, String cardNo) {
        if (this.cardNo == cardNo && amount < super.getBalance()) {
            super.setBalance(super.getBalance() - amount);
        }else {
            System.out.println("지불이 불가능합니다.");
        }

    }

    @Override
    public void calcRate() {

    }
}
