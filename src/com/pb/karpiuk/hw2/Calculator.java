package com.pb.karpiuk.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int operand1, operand2;
        String sign;

        Scanner scan = new Scanner(System.in);

        System.out.print("Введіть operand1:");
        operand1 = scan.nextInt();
        System.out.println("");

        System.out.print("Введіть operand2:");
        operand2 = scan.nextInt();
        System.out.println("");

        System.out.print("Введіть знак:");
        sign = scan.next();
        System.out.println("");

        System.out.print("Результат: " + operand1 + " " + sign + " " + operand2 + " = ");

        switch (sign) {
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "-":
                System.out.println(operand1 - operand2);
                break;
            case "/":
                if (operand2 == 0){
                    System.out.println("Ділення на 0 неможливе! %)");
                }
                else {
                    System.out.println(1.0 * operand1 / operand2);
                }
                break;
            case "*":
                System.out.println(operand1 * operand2);
                break;
            case "^":
                System.out.println(Math.pow(operand1,operand2));
                break;
            default:
                System.out.println("Такого робити не вмію :(");
        }
    }
}

