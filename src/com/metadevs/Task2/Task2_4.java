package com.metadevs.Task2;

import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число value1:");
        int value1 = scan.nextInt();
        System.out.println("Введите число Value2:");
        int value2 = scan.nextInt();
        boolean statement1 = value1 > value2;
        boolean statement2 = value1 < value2;
        if (statement1) {
            System.out.println("Первое введённое число больше второго");
        }
        if (statement2) {
            System.out.println("Первое введённое число меньше второго");
        } else if (value1 == value2) {
            System.out.println("Числа равны");
        }
    }
}
