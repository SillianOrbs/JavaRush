package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);

        int speed = sc.nextInt();
        double newSpeed = 3.6 * speed;

        System.out.println(Math.round(newSpeed));
    }
}