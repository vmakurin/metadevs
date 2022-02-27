package com.metadevs;

import java.util.Scanner;

public class LiveCoding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        double value1 = scanInt(scan);
        System.out.println("Введите второе число");
        double value2 = scanInt(scan);
        gettingOperationsSwitch(value1, value2);
        //gettingOperationsIfElse(value1, value2);
        // Вызвать нужный метод - gettingOperationsSwitch(value1, value2); / gettingOperationsIfElse(value1, value2);. Работает одинаково.
    }

    public static int scanInt(Scanner scan) {
        while (!scan.hasNextInt()) {
            System.out.println("Это не число");
            scan.next();
        }
        return scan.nextInt();
    }

    public static void gettingOperationsSwitch(double a, double b) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите операцию: 1.Сложение, 2.Вычитание, 3.Произведение, 4.Частное");
        int checkOperations = scanInt(scan);
        while (checkOperations != 1 && checkOperations != 2 && checkOperations != 3 && checkOperations != 4) {
            System.out.println("Введите номер операции в интервале [1,4]");
            scanInt(scan);
        }
            switch (checkOperations) {
                case 1:
                    System.out.println(a + b);
                    break;
                case 2:
                    System.out.println(a - b);
                    break;
                case 3:
                    System.out.println(a * b);
                    break;
                case 4:
                    System.out.println(a / b);
                    break;
            }
        }

    public static void gettingOperationsIfElse(double c, double d) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите операцию: 1.Сложение, 2.Вычитание, 3.Произведение, 4.Частное");
        int checkOperations = scanInt(scan);
        while (checkOperations != 1 && checkOperations != 2 && checkOperations != 3 && checkOperations != 4) {
            System.out.println("Введите номер операции в интервале [1,4]");
            scanInt(scan);
        }
            if (checkOperations == 1) {
                System.out.println(c + d);
            }
            if (checkOperations == 2) {
                System.out.println(c - d);
            }
            if (checkOperations == 3) {
                System.out.println(c * d);
            }
            if (checkOperations == 4) {
                System.out.println(c / d);
            }
        }
    }
