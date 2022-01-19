package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);

        int cole = sc.nextInt();
        int people = sc.nextInt();

        System.out.println(cole * 1.0 / people);
    }
}