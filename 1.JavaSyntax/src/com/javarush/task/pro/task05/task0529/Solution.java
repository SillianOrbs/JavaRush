package com.javarush.task.pro.task05.task0529;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* 
Галаксианские роботанки (1)
*/

public class Solution {
    public static String robotank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";
    public static int height = 10;
    public static int width = 30;
    public static String[][] field = new String[height][width];
    public static int[][] bombs = new int[height][width];

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < field.length; i++) {
            int x = (int) (Math.random() * width);
            HashSet<Integer> bomb = new HashSet<>();
            do {
                bomb.add((int) (Math.random() * width));
            } while (bomb.size() != 10);
            for (int j = 0; j < field[i].length; j++) {
                if (j == x)
                    field[i][j] = robotank;
                else
                    field[i][j] = empty;
                if (bomb.contains(j))
                    bombs[i][j] = 1;
                else
                    bombs[i][j] = 0;
                if (field[i][j] == robotank && bombs[i][j] == 1)
                    field[i][j] = hit;
            }
        }
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}
