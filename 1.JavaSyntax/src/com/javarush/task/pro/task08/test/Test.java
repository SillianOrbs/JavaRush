package com.javarush.task.pro.task08.test;

/**
 * тест псевдослучайных чисел
 */
public class Test {
        public static int a = 41;
        public static int c = 11119;
        public static int m = 11113;
        public static int seed = 1;

        public static int getNextRandom()
        {
            seed = (a * seed + c) % m;
            return seed;
        }

        public static void main(String[] args)
        {
            for (int i = 0; i < 1000; i++)
            {
                System.out.println(getNextRandom());
            }
        }
}
