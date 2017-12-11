package ua.com.dagget.headFirstPattern;

public class NoQuack implements QuackInterface {
    @Override
    public void quack() {
        System.out.println("Я не вмію крякати.");
    }
}
