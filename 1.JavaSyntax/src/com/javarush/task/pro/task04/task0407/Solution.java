package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int num = 0;
        int summ = 0;

        while (num < 100) {
            num++;
            if (num % 3 == 0)
                continue;
            summ += num;
        }
        System.out.println(summ);
    }
}