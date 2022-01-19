package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;

        while (sc.hasNextInt()) {
            int number = sc.nextInt();
            if (number % 2 == 0 && number > max)
                max = number;
        }

        System.out.println(max);
    }
}