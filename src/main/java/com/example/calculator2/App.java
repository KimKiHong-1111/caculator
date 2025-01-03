package com.example.calculator2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요:");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요:");
        int num2 = sc.nextInt();

        System.out.print("사칙연산 기호를 입력하세요: ");
        String operator = sc.next();
        String more= "";
        do {
            Calculator calculator = new Calculator(num1,num2,operator);
            calculator.operate(calculator.operator);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            more = sc.next();
        }while (!more.equals("exit"));
        System.out.println("계산을 종료합니다.");
    }
}
