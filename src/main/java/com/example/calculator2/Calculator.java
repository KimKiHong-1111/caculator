package com.example.calculator2;

public class Calculator {
   int num1;
   int num2;
   char operator;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;

    }

    public Calculator(char operator) {
        this.operator = operator;
    }
}
