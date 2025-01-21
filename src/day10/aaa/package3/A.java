package day10.aaa.package3;

public class A {

    public int field1;
    int field2;
    private int field3;

    public A() {
        field1 = 1;
        field2 = 1;
        field3 = 1;
        method1();

    }

    public void method1() {
        System.out.printf(" %d  %d %d %n",this.field1,this.field2,this.field3  );
        method2();
    }

    void method2() {
        System.out.printf(" %d  %d %d %n",this.field1,this.field2,this.field3  );
        method3();
    }

    private void method3() {
        System.out.printf(" %d  %d %d %n",this.field1,this.field2,this.field3  );
    }
}
