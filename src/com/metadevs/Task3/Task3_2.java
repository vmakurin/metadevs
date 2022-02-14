package com.metadevs.Task3;

import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число number:");
        int number = scan.nextInt();
        System.out.println("Введите число i:");
        int i = scan.nextInt();
        if (number < i) {
            while (number < i) {
                System.out.println("Любая фраза: " + number++);
            }
        } else {
            System.out.println("Заданное число больше или равно i");
        }
    }
}
