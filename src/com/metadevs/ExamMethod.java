package com.metadevs;

import java.util.Random;

public class ExamMethod {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt();
        System.out.println(a);
        int b = rand.nextInt();
        System.out.println(b);
        comparison(a, b);
    }

    public static boolean comparison(int num1, int num2) {
        if (num1 > 50 && num2 > 50) {
            System.out.println(true);
        }
        return true;
    }
}
