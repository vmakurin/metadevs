package com.metadevs.Task2;

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Task2_2_a();
        Task2_2_b();
        Task2_2_c();
        Task2_2_d();
        Task2_2_e();
        Task2_2_f();
        Task2_2_g();
        Task2_2_h();
    }

    public static void Task2_2_a() {
        int a = 10;
        int b = 5;
        boolean statement = a > b;
        if (statement) {
            System.out.println(statement);
        }
        return;
    }

    public static void Task2_2_b() {
        int a = 50;
        int b = 25;
        boolean statement = a > b;
        if (statement) {
            System.out.println(statement);
        }
        return;
    }

    public static void Task2_2_c() {
        int a = 67;
        int b = 23;
        boolean statement = a < b;
        if (statement) {
            System.out.println(statement);
        }
        return;
    }

    public static void Task2_2_d() {
        int a = 90;
        int b = 80;
        boolean statement = (a == b);
        if (statement) {
            System.out.println(statement);
        }
        return;
    }

    public static void Task2_2_e() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = scan.nextInt();
        int b = 60;
        boolean statement = (a == b);
        if (statement) {
            System.out.println(statement);
        }
        return;
    }

    public static void Task2_2_f() {
        Scanner scan1 = new Scanner(System.in);
        int a = 100;
        System.out.println("Введите число b: ");
        int b = scan1.nextInt();
        boolean statement = (a < b);
        if (statement) {
            System.out.println(statement);
        }
        return;
    }

    public static void Task2_2_g() {
        Scanner scan2 = new Scanner(System.in);
        int b = 60;
        System.out.println("Введте число a: ");
        int a = scan2.nextInt() + b / 2;
        boolean statement = (a == b);
        if (statement) {
            System.out.println(statement);
        }
        return;
    }

    public static void Task2_2_h() {
        Scanner scan3 = new Scanner(System.in);
        int b = 146;
        System.out.println("Введте число a: ");
        int a = scan3.nextInt() + (b / 2);
        boolean statement = (a == b);
        if (statement) {
            System.out.println(statement);
        }
    }
}
