package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        multiArray = new int[n][];

        for (int i = 0; i < multiArray.length; i++) {
            int n2 = sc.nextInt();
            multiArray[i] = new int[n2];
        }
    }
}
