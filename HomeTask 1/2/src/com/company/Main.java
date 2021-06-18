package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Введите два числа:");
        System.out.print("первое: ");
        Integer num1 = cin.nextInt();

        System.out.print("второе: ");
        Integer num2 = cin.nextInt();

        System.out.print("Введите знак операции: ");
        String ao = cin.next();

        if (ao.equals("+"))
          System.out.printf("Сумма:       %d \n", num1 + num2 );
        else if (ao.equals("-"))
          System.out.printf("Разность:    %d \n", num1 - num2 );
        else if (ao.equals("*"))
          System.out.printf("Умножение:   %d \n", num1 * num2 );
        else if (ao.equals("/"))
         System.out.printf("Деление:     %f \n", (double)num1 / (double)num2 );
        else
         System.out.println("Не известная операция!");


    }
}