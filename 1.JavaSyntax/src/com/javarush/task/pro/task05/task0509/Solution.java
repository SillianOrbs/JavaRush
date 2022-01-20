package com.javarush.task.pro.task05.task0509;

/* 
Таблица умножения
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //напишите тут ваш код
        int n = 10;
        MULTIPLICATION_TABLE = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                MULTIPLICATION_TABLE[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Пришлось закоментировать красоту, т.к. валидатор пропускает только с одним пробелом между цифрами
                /*if (MULTIPLICATION_TABLE[i][j] < 10)
                    System.out.print("  " + MULTIPLICATION_TABLE[i][j]);
                else*/
                    System.out.print(" " + MULTIPLICATION_TABLE[i][j]);
            }
            System.out.println();
        }
    }
}
