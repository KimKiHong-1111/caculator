package com.example.calculator2;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String more = "";
        while (!more.equals("exit")) {
            System.out.print("첫 번째 숫자를 입력하세요:");
            calculator.setNum1(sc.nextInt());
            System.out.print("두 번째 숫자를 입력하세요:");
            calculator.setNum2(sc.nextInt());
            System.out.print("사칙연산 기호를 입력하세요: ");
            calculator.setOperator(sc.next());
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료,remove 입력 시 첫째 값 제거)");
            calculator.calculate();
            more = sc.next();
            if (more.equals("remove")) calculator.removeResult();
        }
        System.out.println("계산을 종료합니다.");
    }
}
