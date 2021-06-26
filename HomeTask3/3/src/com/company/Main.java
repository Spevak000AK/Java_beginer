package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("Введите два числа для вычисления суммы:");
        System.out.printf("Сумма:       %d \n", cin.nextInt() + cin.nextInt() );

        System.out.println("Введите два числа для вычисления разности:");
        System.out.printf("Разность:    %d \n", cin.nextInt() - cin.nextInt()  );

        System.out.println("Введите два числа для вычисления произведения:");
        System.out.printf("Умножение:   %d \n", cin.nextInt() * cin.nextInt()  );

        System.out.println("Введите два числа  для вычисления частного:");
        System.out.printf("Деление:     %f \n", ((double)cin.nextInt() / (double)cin.nextInt()) );
    }
}