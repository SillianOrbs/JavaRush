package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int n = 1;
        while (n < 11){
            int m = 1;
            while (m < 21){
                if (n == 1 || n == 10)
                    System.out.print("Б");
                else if (m == 1 || m == 20)
                    System.out.print("Б");
                else
                    System.out.print(" ");
                m++;
            }
            System.out.println();
            n++;
        }

    }
}