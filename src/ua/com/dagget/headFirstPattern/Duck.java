package ua.com.dagget.headFirstPattern;

public abstract class Duck {
    protected FlyInterface flyInterface;
    protected QuackInterface quackInterface;

    public void setFlyInterface(FlyInterface flyInterface){
        this.flyInterface = flyInterface;
    }

    public void setQuackInterface(QuackInterface quackInterface){
        this.quackInterface = quackInterface;
    }

    abstract void display();

    void performFly() {
        flyInterface.fly();
    }

    void performQuack() {
        quackInterface.quack();
    }

    void swim(){
        System.out.println("Я плаваю !!!");
    }
}
