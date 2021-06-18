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

        System.out.println("-----------------");

        System.out.printf("Сумма:       %d \n", num1 + num2 );
        System.out.printf("Разность:    %d \n", num1 - num2 );
        System.out.printf("Умножение:   %d \n", num1 * num2 );
        System.out.printf("Деление:     %f \n", (double)num1 / (double)num2 );

    }
}
