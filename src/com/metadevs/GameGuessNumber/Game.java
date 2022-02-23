package com.metadevs.GameGuessNumber;

import java.util.Scanner;

public class Game {
    // Что бы вызвать реализацию через for/while необходимо вызвать guessFor(100)/guessWhile(100).
    public static void main(String[] args) {
        guessWhile(100);
    }

    public static int scanInt(Scanner scan) {
        while (!scan.hasNextInt()) {
            System.out.println("Это не число");
            scan.next();
        }
        return scan.nextInt();
    }

    public static void guessFor(int max) {
        Scanner scan = new Scanner(System.in);
        int randomValue = (int) (1 + Math.random() * max);
        System.out.println("Угадай");
        for (int i = 0, match = 0; i < 10 && match == 0; i++) {
            System.out.println("Введите число");
            int num = scanInt(scan);
            if (num > randomValue) {
                System.out.println("Загаданное число меньше");
            }
            if (num < randomValue) {
                System.out.println("Загаданное число больше");
            }
            if (num == randomValue) {
                System.out.println("Вы угадали");
                match = 1;
            }
        }
        System.out.println(randomValue);
    }

    public static void guessWhile(int max) {
        Scanner scan = new Scanner(System.in);
        int randomValue = (int) (1 + Math.random() * max);
        System.out.println("Угадай");
        int i = 0;
        boolean match = false;
        while (i < 10 && match == false) {
            System.out.println("Введите число");
            int num = scanInt(scan);
            if (num > randomValue) {
                System.out.println("Загаданное число меньше");
            }
            if (num < randomValue) {
                System.out.println("Загаданное число больше");
            }
            if (num == randomValue) {
                System.out.println("Вы угадали");
                match = true;
            }
            i++;
        }
        System.out.println(randomValue);
    }
}

