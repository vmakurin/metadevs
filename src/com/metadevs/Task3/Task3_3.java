package com.metadevs.Task3;

import java.util.Scanner;

public class Task3_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число a: ");
        float a = scan.nextFloat();
        a = (a == 0 || a == 2) ? a + 7 : a / 10;
        System.out.println(a);


        System.out.println("Введите число a: ");
        a = scan.nextFloat();
        String answer = (a > 0 && a < 5) ? "Верно" : "Неверно";
        System.out.println(answer);
    }
}
