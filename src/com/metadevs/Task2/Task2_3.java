package com.metadevs.Task2;

import java.util.Scanner;

public class Task2_3 {
    public static void main(String[] args) {
        Scanner cat = new Scanner(System.in);
        String answer;
        System.out.println("Что говорит кошка?");
        answer = cat.nextLine();
        if (answer.equalsIgnoreCase("Мяу")) {
            System.out.println("Да, верно");
        } else {
            System.out.println("Это говорит какое-то друге животное");
        }
    }
}
