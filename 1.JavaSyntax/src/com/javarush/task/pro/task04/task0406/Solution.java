package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next();
            if ("enough".equals(str))
                break;
            System.out.println(str);
        }

    }
}