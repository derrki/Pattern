package ua.com.dagget.headFirstPattern;

public class GrenDuck extends Duck {

    GrenDuck(){
        flyInterface = new Fly();
        quackInterface = new Quack();
    }

    @Override
    void display() {
        System.out.println("Я зелена качка.");
    }
}
