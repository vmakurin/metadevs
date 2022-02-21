package com.metadevs.Task1;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите фамилию: ");
        String lastName = sc.nextLine();
        System.out.println("Введите имя: ");
        String name = sc.nextLine();
        System.out.println("Введите возраст: ");
        int age = sc.nextInt();

        System.out.println("Фамилия: "+ lastName);
        System.out.println("Имя: "+ name);
        System.out.println("Возраст: "+ age);

    }
}
