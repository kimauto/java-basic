package day13.homework.class실습;

public class Tv {

    private String color;
    private boolean power;
    private int channel;

    public Tv() {
        this.color = "black";
        this.power = false;
        this.channel = 0;
    }

    public void print() {
        System.out.println("color: " + color + ", power: " + power + ", channel: " + channel);
    }

    public void power() {
        if (power == false) {
            this.power = true;
        }else {
            this.power = false;
        }
    }

    public void channelUp() {
        this.channel++;
    }

    public void channelDown() {
        this.channel--;
    }
}
