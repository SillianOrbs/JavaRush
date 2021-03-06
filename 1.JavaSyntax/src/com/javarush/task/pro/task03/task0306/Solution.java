package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean isNot = false;

        if (a >= b + c) {
            System.out.println(TRIANGLE_NOT_EXISTS);
            isNot = true;
        } else if (b >= a + c) {
            System.out.println(TRIANGLE_NOT_EXISTS);
            isNot = true;
        } else if (c >= a + b) {
            System.out.println(TRIANGLE_NOT_EXISTS);
            isNot = true;
        }

        if (!isNot) {
            System.out.println(TRIANGLE_EXISTS);
        }
    }
}
