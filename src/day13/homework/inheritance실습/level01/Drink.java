package day13.homework.inheritance실습.level01;

public class Drink {

    private String name;
    private int price;
    private int count;

    public Drink(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static void printTitle() {
        System.out.print("상품명\t");
        System.out.print("단가\t");
        System.out.print("수량\t");
        System.out.println("금액");
    }

    public int getTotalPrice() {
        return price * count;
    }

    public void printData() {
        System.out.println(this.name + "\t\t" + this.price + "\t" + this.count + "\t" + this.getTotalPrice() );
    }
}
