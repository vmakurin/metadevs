package com.metadevs.Task4;

import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите количество элементов");
        int size = scanInt(scan);
        String[] array = scanArray(size, scan);
        String[] newArray = reverseArray(array);
        System.out.println("Элементы в обратном порядке");
        printArray(newArray);
    }

    public static int scanInt(Scanner scan) {
        while (!scan.hasNextInt()) {
            System.out.println("Это не число");
            scan.next();
        }
        return scan.nextInt();
    }

    public static String[] scanArray(int size, Scanner scan) {
        String[] array = new String[size];
        scan.nextLine();
        System.out.println("введите элементы");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextLine();
        }
        return array;
    }

    public static String[] reverseArray(String[] array) {
        int size = array.length;
        String[] newArray = new String[size];
        for (int i = 0; i <= size - 1; i++) {
            int j = size - 1 - i;
            newArray[j] = array[i];
        }
        return newArray;
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
