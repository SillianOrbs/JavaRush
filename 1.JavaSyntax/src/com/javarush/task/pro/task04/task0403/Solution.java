package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);

        boolean isNotFinish = true;
        int sum = 0;

        while (isNotFinish) {
            if (sc.hasNextInt())
                sum += sc.nextInt();
            else {
                String str = sc.next();
                if (str.equals("ENTER"))
                    isNotFinish = false;
            }
        }

        System.out.println(sum);

    }
}