package com.metadevs.Task4;

import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите количество элементов");
        int size = scan.nextInt();
        String array[] = new String[size];
        scan.nextLine();
        System.out.println("введите элементы");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextLine();
        }
        System.out.println("Элементы в обратном порядке");
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
