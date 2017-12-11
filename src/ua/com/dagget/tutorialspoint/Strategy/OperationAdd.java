package ua.com.dagget.tutorialspoint.Strategy;

public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
}
