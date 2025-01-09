package com.example.calculator3;


import java.util.ArrayList;

public class ArithmeticCalculator<T extends Number> {
    private T num1;
    private T num2;
    ArrayList<Double> list = new ArrayList<Double>();

    public ArithmeticCalculator() {

    }

    public ArithmeticCalculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public T getNum1() {
        return num1;
    }

    public T getNum2() {
        return num2;
    }

    public void setNum1(T num1) {
        this.num1 = num1;
    }

    public void setNum2(T num2) {
        this.num2 = num2;
    }

    public void arithmeticCalculate(T num1, T num2, OperatorType operator) {
        double answer = 0;
        switch (operator) {
            case ADD : answer = num1.doubleValue()+num2.doubleValue();
            case DIVIDE : answer =  num1.doubleValue()/num2.doubleValue();
            case SUBTRACT : answer = num1.doubleValue()-num2.doubleValue();
            case MULTIPLY : answer = num1.doubleValue()*num2.doubleValue();
            default : System.out.println("사칙연산 기호를 확인해주세요");
        }
        System.out.println("결과:" + answer);
        list.add(answer);
    }
}
