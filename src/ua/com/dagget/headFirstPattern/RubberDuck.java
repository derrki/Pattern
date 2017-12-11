package ua.com.dagget.headFirstPattern;

public class RubberDuck extends Duck {

    RubberDuck(){
        flyInterface = new NoFly();
        quackInterface = new NoQuack();
    }

    @Override
    void display() {
        System.out.println("Я резинова качка.");
    }
}
