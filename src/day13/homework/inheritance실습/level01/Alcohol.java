package day13.homework.inheritance실습.level01;

public class Alcohol extends Drink{

    double alcper;

    public Alcohol(String name, int price, int count, double alcper) {
        super(name, price, count);
        this.alcper = alcper;
    }

    public static void printTitle(){
        System.out.print("상품명(도수[%])\t");
        System.out.print("단기\t");
        System.out.print("수량\t");
        System.out.println("금액\t");
    }
    @Override
    public void printData() {
        System.out.printf("%s(%.1f)\t\t%d  %d\t %d", super.getName(), alcper, super.getPrice(), super.getCount(),super.getTotalPrice());

    }
}
