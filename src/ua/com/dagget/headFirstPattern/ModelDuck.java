package ua.com.dagget.headFirstPattern;

public class ModelDuck extends Duck {

    ModelDuck (){
        flyInterface = new NoFly();
        quackInterface = new NoQuack();
    }

    @Override
    void display() {
        System.out.println("Я модель качки.");
    }
}
