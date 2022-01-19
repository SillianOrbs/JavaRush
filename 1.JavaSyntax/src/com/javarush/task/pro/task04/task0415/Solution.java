package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        if (radius > 0) {
            int s = (int) (3.14 * radius * radius);

            System.out.println(s);
        }

    }
}