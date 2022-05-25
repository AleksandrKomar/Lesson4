package homework.task1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число:= ");
        double operand1 = scanner.nextDouble();

        System.out.print("Введите второе число:= ");
        double operand2 = scanner.nextDouble();

        System.out.print("Введите знак арифметической операции - ");
        String sign = scanner.next();

        calculate(operand1, operand2, sign);

    }

    static void calculate(double a, double b, String sign) {

        switch (sign) {

            default: {
                System.out.println("Неизвестная арифметическая операция.\nПовторите еще раз.");
                break;
            }
            case "+": {
                System.out.println(a + " " + sign + " " + b + " = " + (a + b));
                break;
            }
            case "-": {
                System.out.println(a + " " + sign + " " + b + " = " + (a - b));
                break;
            }
            case "*": {
                System.out.println(a + " " + sign + " " + b + " = " + (a * b));
                break;
            }

            case "%": {
                System.out.println(a + " " + sign + " " + b + " = " + (a % b));
                break;
            }

            case "/": {
                if (b != 0) {
                    System.out.println(a + " " + sign + " " + b + " = " + (a / b));
                } else {
                    System.out.println("Попытка деления на 0!");
                }
                break;
            }
        }
    }
}

