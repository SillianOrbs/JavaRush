package com.javarush.task.pro.task04.task0423;

import java.util.Scanner;

/* 
Калибровка климата
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //напишите тут ваш код
        int summ = 0;
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            summ += num;
        }
        System.out.println(summ / 5);
    }
}
