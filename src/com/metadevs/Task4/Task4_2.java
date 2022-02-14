package com.metadevs.Task4;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число value1");
        int value1 = scan.nextInt();
        System.out.println("Введите число value2");
        int value2 = scan.nextInt();
        printEven(value1, value2);
    }

    public static void printEven(int x, int y) {
        for (int i = x; i < y; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
