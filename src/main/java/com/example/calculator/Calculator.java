package com.example.calculator;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = " ";
        int n = 0;
        do {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int a = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int b = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            String c = sc.next();
            if (c.equals("/") && b == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            } else {
                switch (c) {
                    case "+" -> System.out.println("결과 : " + (n = a + b));
                    case "-" -> System.out.println("결과 : " + (n = a - b));
                    case "*" -> System.out.println("결과 : " + (n = a * b));
                    case "/" -> System.out.println("결과 : " + (n = a / b));
                    default -> System.out.println("사칙연산 기호를 확인해주세요");
                }
            }
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
            str = sc.next();
        } while (!Objects.equals(str,"exit"));
        System.out.println("계산을 종료합니다.");
    }
}
