package ua.com.dagget.headFirstPattern;

public class NoFly implements FlyInterface {
    @Override
    public void fly() {
        System.out.println("Я не літаю.");
    }
}
