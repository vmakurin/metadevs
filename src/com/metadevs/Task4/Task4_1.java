package com.metadevs.Task4;

import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        getFractal();
    }

    public static int scanInt(Scanner scan) {
        while (!scan.hasNextInt()) {
            System.out.println("Это не число");
            scan.next();
        }
        return scan.nextInt();
    }

    public static void getFractal() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер фрактала:");
        int k = scanInt(scan);
        for (int i = 0, f = 1; i < k; i++) {
            f += f * i;
            System.out.println(f);
        }
    }
}