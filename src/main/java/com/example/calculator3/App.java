package com.example.calculator3;


import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator<Double> calculator = new ArithmeticCalculator<>();

        String more = "";
        while (!more.equals("exit")) {
            System.out.print("첫 번째 숫자를 입력하세요:");
            calculator.setNum1(sc.nextDouble());
            System.out.print("두 번째 숫자를 입력하세요:");
            calculator.setNum2(sc.nextDouble());
            System.out.print("사칙연산 기호를 입력하세요: ");
            String operator = sc.next();
            if (operator.equals("+")) {
                OperatorType op = OperatorType.ADD;
                calculator.arithmeticCalculate(calculator.getNum1(), calculator.getNum2(),op);
            } else if (operator.equals("-")) {
                OperatorType op = OperatorType.SUBTRACT;
                calculator.arithmeticCalculate(calculator.getNum1(), calculator.getNum2(),op);
            } else if (operator.equals("*")) {
                OperatorType op = OperatorType.MULTIPLY;
                calculator.arithmeticCalculate(calculator.getNum1(), calculator.getNum2(),op);
            } else if (operator.equals("/")) {
                OperatorType op = OperatorType.MULTIPLY;
                calculator.arithmeticCalculate(calculator.getNum1(), calculator.getNum2(),op);
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료,remove 입력 시 첫째 값 제거)");
            more = sc.next();

        }
        System.out.println("계산을 종료합니다.");
    }
}
