package com.metadevs.GameGuessNumber;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int randomValue = (int) (1 + Math.random() * 100);
        System.out.println("Угадай");
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите число");
            int num = scan.nextInt();
            if (num > randomValue) {
                System.out.println("Загаданное число меньше");
            }
            if (num < randomValue) {
                System.out.println("Загаданное число больше");
            }
            if (num == randomValue) {
                System.out.println("Вы угадали");
            }
        }
        System.out.println(randomValue);
    }
}

