package ua.com.dagget.tutorialspoint.Strategy;

public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }
}
