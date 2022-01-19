package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        String text = " любит меня.";
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);

        String name = sc.next();

        int count = 10;

        while (count > 0) {
            System.out.println(name + text);
            count--;
        }

    }
}
