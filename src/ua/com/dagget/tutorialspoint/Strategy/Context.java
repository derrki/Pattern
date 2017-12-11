package ua.com.dagget.tutorialspoint.Strategy;

/**
 * Strategy. Intent. Define a family of algorithms, encapsulate each one,
 * and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
 *Стратегія. Призначення. Визначає сім’ю алгоритмів, інкапсулює кожен з них і робить їх взаємозамінними.
 * Стратегія дозволяє видозмінювати алгоритм незалежно від клієнтського коду, що використовує стратегію.
 */

public class Context {
    private Strategy strategy;

    Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
