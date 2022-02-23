package com.metadevs.Task4;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число value1");
        int value1 = scanInt(scan);
        System.out.println("Введите число value2");
        int value2 = scanInt(scan);
        printEven(value1, value2);
    }

    public static int scanInt(Scanner scan) {
        while (!scan.hasNextInt()) {
            System.out.println("Это не число");
            scan.next();
        }
        return scan.nextInt();
    }

    public static void printEven(int x, int y) {
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
