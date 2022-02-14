package com.metadevs.Task4;

import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int k = n.nextInt();
        for (int i = 0, f = 1; i < k; i++) {
            f += f * i;
            System.out.println(f);
        }
    }
}