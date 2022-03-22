package com.metadevs;

import java.util.Scanner;

public class liveCodingSwitch {
    final static int FIRST_DECLINATION = 1;
    final static int SECOND_DECLINATION = 2;
    final static int THIRD_DECLINATION = 3;
    final static int FOURTH_DECLINATION = 4;
    public static void main(String[] args) {
        printYear();
    }

    public static void printYear () {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int x = k % 10;
        switch (x) {
            case FIRST_DECLINATION:
                switch (k) {
                    case 11:
                        System.out.println("Мне " + k + " лет.");
                        break;
                    default:
                        System.out.println("Мне " + k + " год.");
                        break;
                }
            case SECOND_DECLINATION:
                switch (k) {
                    case 12:
                        System.out.println("Мне " + k + " лет.");
                        break;
                    default:
                        System.out.println("Мне " + k + " года.");
                        break;
                }
            case THIRD_DECLINATION:
                switch (k) {
                    case 13:
                        System.out.println("Мне " + k + " лет.");
                        break;
                    default:
                        System.out.println("Мне " + k + " года.");
                        break;
                }
            case FOURTH_DECLINATION:
                switch (k) {
                    case 14:
                        System.out.println("Мне " + k + " лет.");
                        break;
                    default:
                        System.out.println("Мне " + k + " года.");
                        break;
                }
            default:
                System.out.println("Мне " + k + " лет.");
                //  int k = (int)(1+Math.random()*100);
        }
    }
}
