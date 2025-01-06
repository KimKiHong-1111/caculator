package com.example.calculator2;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    private Queue<Integer>answerque = new LinkedList<>();
    int num1;
    int num2;
    String operator;

    public Calculator(){}

    public Calculator(int num1, int num2, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public void calculate(){
        int answer = 0;

        switch (operator) {
            case "+" -> System.out.println("결과 : " + (answer = num1 + num2));
            case "-" -> System.out.println("결과 : " + (answer = num1 - num2));
            case "*" -> System.out.println("결과 : " + (answer = num1 * num2));
            case "/" -> {
                if (num2== 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }else System.out.println("결과 : " + (answer = num1 / num2));
                answerque.add(answer);
            }
            default -> System.out.println("사칙연산 기호를 확인해주세요");
        }
    }



    public void removeResult() {
        answerque.poll();
    }



    public Queue<Integer> getAnswerque() {
        return answerque;
    }

    public void setAnswerque(Queue<Integer> answerque) {
        this.answerque = answerque;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getOperator() {
        return operator;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}

