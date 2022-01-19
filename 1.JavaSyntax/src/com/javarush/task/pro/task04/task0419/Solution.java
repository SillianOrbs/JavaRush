package com.javarush.task.pro.task04.task0419;

import java.util.Scanner;

/* 
Защита от землетрясения
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        //напишите тут ваш код
        if (number > 0) {
            int i = 1;
            while (i <= number){
                sum += i;
                i++;
            }
        }
        System.out.println(sum);
    }
}