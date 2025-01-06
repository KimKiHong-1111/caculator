package com.example.week4calculator;

public class DivideOperation extends AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber) {
        return (double) firstNumber / secondNumber;
    }

//    public double operate(int firstNumber, int secondNumber) {
//        return  (double) firstNumber / secondNumber;
//    }
}
