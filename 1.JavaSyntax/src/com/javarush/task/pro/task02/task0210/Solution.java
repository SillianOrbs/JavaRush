package com.javarush.task.pro.task02.task0210;

/* 
С каждым разом огромнее
*/

public class Solution {

    public static void main(String[] args) {
        String bigAmount = "500";
        String greatAmount = "100000";

        //100500
        int hugeAmount = Integer.parseInt(greatAmount) + Integer.parseInt(bigAmount); //напишите тут ваш код

        System.out.println(hugeAmount);
    }
}
