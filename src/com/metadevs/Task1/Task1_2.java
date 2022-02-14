package com.metadevs.Task1;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int value1 = s.nextInt();
        int value2 = s.nextInt();
        System.out.println("Сумма: " + (value1 + value2));
        System.out.println("Разность" + (value1 - value2));
        System.out.println("Произведение: " + (value1 * value2));
        System.out.println("Частное: " + (value1 / value2));
    }
}
