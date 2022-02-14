package com.metadevs.Task2;

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 10;
        int b = 5;
        boolean statement = a > b;
        boolean aGreaterThenB = a > b;
        boolean aLessThenB = a < b;
        boolean aEqualsThenB = a == b;
        if (a > b) {
            System.out.println(statement);
        }
        a = 50;
        b = 25;
        if (a > b) {
            statement = a > b;
            System.out.println(statement);
        }
        a = 67;
        b = 23;
        if (a < b) {
            statement = a < b;
            System.out.println(statement);
        }
        a = 90;
        b = 80;
        if (a == b) {
            statement = (a == b);
            System.out.println(statement);
        }
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите число a: ");
        a = scan1.nextInt();
        b = 60;
        if (a == b) {
            statement = (a == b);
            System.out.println(statement);
        }
        System.out.println("Введите число b: ");
        a = 100;
        b = scan.nextInt();
        if (a < b) {
            statement = a < b;
            System.out.println(statement);
        } else {
            System.out.println(statement);
        }

        System.out.println("Введте число a: ");
        b = 60;
        a = scan.nextInt() + b / 2;
        System.out.println(a);
        if (a == b) {
            statement = (a == b);
            System.out.println(statement);
        } else {
            System.out.println(statement);
        }

        System.out.println("Введте число a: ");
        a = scan.nextInt() + (b / 2);
        b = 146;
        System.out.println(a);
        if (a == b) {
            statement = (a == b);
            System.out.println(statement);
        } else {
            System.out.println(statement);
        }
    }
}
