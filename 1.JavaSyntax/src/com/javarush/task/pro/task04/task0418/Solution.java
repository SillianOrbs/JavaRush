package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);

        boolean b = sc.nextBoolean();

        if(b)
            System.out.println((int) Math.ceil(glass));
        else
            System.out.println((int) Math.floor(glass));

    }
}