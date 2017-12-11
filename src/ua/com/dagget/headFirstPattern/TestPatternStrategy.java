package ua.com.dagget.headFirstPattern;

/**
 * Strategy. Intent. Define a family of algorithms, encapsulate each one,
 * and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
 *Стратегія. Призначення. Визначає сім’ю алгоритмів, інкапсулює кожен з них і робить їх взаємозамінними.
 * Стратегія дозволяє видозмінювати алгоритм незалежно від клієнтського коду, що використовує стратегію.
 */

public class TestPatternStrategy {
    public static void main(String[] args) {
        Duck redDuck = new RedDuck();
        redDuck.display();
        redDuck.performFly();
        redDuck.performQuack();

        System.out.println("------");

        Duck grenDuck = new GrenDuck();
        grenDuck.display();
        grenDuck.performFly();
        grenDuck.performQuack();

        System.out.println("-------");

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.setFlyInterface(new Rocket());
        rubberDuck.performFly();

        System.out.println("--------");

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setFlyInterface(new Rocket());
        modelDuck.performFly();

    }
}
