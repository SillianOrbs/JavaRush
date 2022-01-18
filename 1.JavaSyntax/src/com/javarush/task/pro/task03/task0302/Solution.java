package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        //напишите тут ваш код
        String name;
        int age;
        Scanner sc = new Scanner(System.in);

        name = sc.next();
        age = sc.nextInt();

        if (age >= 18 && age <= 28) {
            System.out.println(name + militaryCommissar);
        }
    }
}
