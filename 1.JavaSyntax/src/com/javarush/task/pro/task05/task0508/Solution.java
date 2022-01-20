package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        strings = new String[6];
        String nullStr = null;;
        for (int i = 0; i < strings.length; i++) {
            strings[i] = sc.nextLine();
        }
        for (int i = 0; i < strings.length - 1; i++) {
            if (strings[i] == nullStr)
                continue;
            boolean isNull = false;
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].equals(strings[j])){
                    isNull = true;
                    strings[j] = nullStr;
                }
            }
            if (isNull)
                strings[i] = nullStr;
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
