package com.example.calculator2;

public class Calculator {
    int num1;
    int num2;
    String kiho;
    int answer;


    public Calculator(int num1, int num2, String kiho) {
        this.num1 = num1;
        this.num2 = num2;
        this.kiho = kiho;

    }


    void operate(String kiho) {
        if (kiho.equals("/") && num2 == 0) {
            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        } else {
            switch (kiho) {
                case "+" -> System.out.println("결과 : " + (answer = num1 + num2));
                case "-" -> System.out.println("결과 : " + (answer = num1 - num2));
                case "*" -> System.out.println("결과 : " + (answer = num1 * num2));
                case "/" -> System.out.println("결과 : " + (answer = num1 / num2));
                default -> System.out.println("사칙연산 기호를 확인해주세요");
            }
        }
    }
}
