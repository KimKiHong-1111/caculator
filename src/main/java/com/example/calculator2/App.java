package com.example.calculator2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String more= "";
        System.out.print("계산할 숫자 2개와 사칙연산 기호를 입력하세요: ");
        do {
            Calculator calculator = new Calculator(sc.nextInt(),sc.nextInt(),sc.next());
            calculator.operate(calculator.kiho);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            more = sc.next();
        }while (!more.equals("exit"));
        System.out.println("계산을 종료합니다.");
    }
}
