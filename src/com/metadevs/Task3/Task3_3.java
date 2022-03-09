package com.metadevs.Task3;

import java.util.Scanner;

public class Task3_3 {
    public static void main(String[] args) {
        float[] array = new float[]{5, 0, -3, 2};
        for (int i = 0; i < array.length; i++) {
            float a = array[i];
            a = (a == 0 || a == 2) ? a + 7 : a / 10;
            System.out.println(a);
        }

        for (int i = 0; i < array.length; i++) {
            float a = array[i];
            String answer = (a > 0 && a < 5) ? "Верно" : "Неверно";
            System.out.println(answer);
        }
    }
}
