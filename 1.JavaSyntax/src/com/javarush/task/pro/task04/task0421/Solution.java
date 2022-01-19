package com.javarush.task.pro.task04.task0421;

/* 
Охлаждение ядра планеты
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int num = 0;
        int summ = 0;

        while (num < 100) {
            num++;
            if (num % 2 == 0)
                summ += num;
        }

        System.out.println(summ);
    }
}