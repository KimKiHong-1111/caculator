package com.example.calculator2;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    private Queue<Integer>answerque = new LinkedList<>();


    public Calculator(int num1, int num2, String operator) {
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
}

