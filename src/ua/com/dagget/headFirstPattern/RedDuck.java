package ua.com.dagget.headFirstPattern;

public class RedDuck extends Duck {

    RedDuck(){
        flyInterface = new Fly();
        quackInterface = new Quack();
    }

    @Override
    void display() {
        System.out.println("Я червона качка.");
    }
}
