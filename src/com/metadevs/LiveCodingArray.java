package com.metadevs;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LiveCodingArray {
    final static int inputArray = 1;
    final static int outputArray = 2;
    final static int changeEL = 3;
    final static int deleteEL = 4;
    final static int addEl = 5;
    final static int fullingOneEl = 6;
    final static int exitMenu = 7;

    static Scanner scan = new Scanner(System.in);
    static int arraySyze = 5;
    static int[] array = new int[arraySyze];
    static boolean exit = false;

    public static void main(String[] args) {
        while (!exit) {
            getCom();
        }
    }

    public static void arrayFulling() {
        Random rand = new Random();
        for (int i = 0; i < arraySyze; i++) {
            array[i] = rand.nextInt();
        }
        outputArray();
    }

    public static void outputArray() {
        System.out.println(Arrays.toString(array));
    }

    public static void changeElement() {
        System.out.println("Введите индекс элеменат от 0 до 4, который вы хотите изменить");
        int indexChange = scanInt(scan);
        System.out.println("Введите новое число");
        array[indexChange] = scanInt(scan);
        outputArray();
    }

    public static void deleteElOfArray() {
        System.out.println("Введите индекс числа, который вы хотите удалить");
        int skip = scanInt(scan);
        int[] arrayCopyDel = new int[array.length - 1];
        for (int i = 0, j = 0; j < arrayCopyDel.length; i++, j++) {
            if (i == skip) {
                i += 1;
            }
            arrayCopyDel[j] = array[i];
        }
        array = arrayCopyDel;
        outputArray();
    }

    public static void addEl() {
        System.out.println("Введите индекс числа, вместо которого вы хотите добавить новый");
        int newIndex = scanInt(scan);
        System.out.println("Введите число");
        int newEl = scanInt(scan);
        int[] arrayCopyAdd = new int[array.length + 1];
        for (int i = 0, j = 0; j < arrayCopyAdd.length; i++, j++) {
            if (j == newIndex) {
                arrayCopyAdd[j] = newEl;
                i--;
            } else {
                arrayCopyAdd[j] = array[i];
            }
            }
       array = arrayCopyAdd;
        outputArray();
    }

    public static void fullingOneEl() {
        System.out.println("Введите число, которым вы хотите заменить все числа массива:");
        int fullingEl = scanInt(scan);
        for (int i = 0; i < array.length; i++) {
            array[i] = fullingEl;
        }
        outputArray();
    }

    public static int scanInt(Scanner scan) {
        while (!scan.hasNextInt()) {
            System.out.println("Это не число");
            scan.next();
        }
        return scan.nextInt();
    }

    public static void getCom() {
        System.out.println('\n' + "Длинна исходного массива 5." + '\n');
        System.out.println("Меню:");
        System.out.println("1.Ввести массив чисел.");
        System.out.println("2.Вывести массив чисел.");
        System.out.println("3.Изменить элемент массива (ввести его номер и новое значение).");
        System.out.println("4.Удалить элемент массива.");
        System.out.println("5.Добавить новый элемент массива.");
        System.out.println("6.Заполнить весь массив введённым числом.");
        System.out.println("7.Выйти из программы.");

        int com = scanInt(scan);
        switch (com) {
            case inputArray:
                arrayFulling();
                break;
            case outputArray:
                outputArray();
                break;
            case changeEL:
                changeElement();
                break;
            case deleteEL:
                deleteElOfArray();
                break;
            case addEl:
                addEl();
                break;
            case fullingOneEl:
                fullingOneEl();
                break;
            case exitMenu:
                exit = true;
                break;
        }

    }
}

