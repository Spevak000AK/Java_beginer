package com.company;

import java.util.Scanner;

public class Main {

    public static int pow(Integer value, Integer n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * value;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        boolean incorrectOperation = false;

        do {
            System.out.println("Введите два числа:");
            System.out.print("первое: ");
            Integer num1 = cin.nextInt();

            System.out.print("второе: ");
            Integer num2 = cin.nextInt();

            System.out.print("Введите знак операции: ");
            String ao = cin.next();

            incorrectOperation = false;
            if (ao.equals("+"))
                System.out.printf("Сумма:       %d \n", num1 + num2);
            else if (ao.equals("-"))
                System.out.printf("Разность:    %d \n", num1 - num2);
            else if (ao.equals("*"))
                System.out.printf("Умножение:   %d \n", num1 * num2);
            else if (ao.equals("/")) {
                if (num2 == 0)
                    System.out.println("На ноль делать нельзя!");
                else
                    System.out.printf("Деление:     %f \n", (double) num1 / (double) num2);
            } else if (ao.equals("div")) {
                if (num2 == 0)
                    System.out.println("На ноль делать нельзя!");
                else
                    System.out.printf("Целочисленное деление:     %d \n", num1 / num2);
            } else if (ao.equals("mod"))
                System.out.printf("Остаток от деления:     %d \n", num1 % num2);
            else if (ao.equals("^")) {
                System.out.printf("Степень:     %d \n", pow(num1, num2));
            } else {
                incorrectOperation = true;
                System.out.println(" --- Не известная операция, повторите ввод! ---");
            }

        } while (incorrectOperation);

    }
}