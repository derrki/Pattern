package ua.com.dagget.tutorialspoint.Strategy;

public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }
}
