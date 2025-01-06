package com.example.week3calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new AddOperation());
        calculator.setOperation(new MultiplyOperation());
        System.out.println(calculator.calculate(10,3));
    }
}
