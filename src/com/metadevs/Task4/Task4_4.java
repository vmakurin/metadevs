package com.metadevs.Task4;

public class Task4_4 {
    public static void main(String[] args) {
        int[][] array = new int[3][5];
        array = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        int[][] invArray = new int[3][5];
        for (int row = 0; row < array.length; row++) {
            System.out.println();
            for (int col = 0; col < array[row].length; col++) {
                int rowIndex = array.length - 1 - row;
                int colIndex = array[row].length - 1 - col;
                invArray[row][col] = array[rowIndex][colIndex];
                System.out.print (invArray[row][col] + " ");
            }
        }
    }
}
