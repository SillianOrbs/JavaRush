package com.javarush.task.pro.task08.task0812;

public class Pair {
    private int x;
    private int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x=%d, y=%d", x, y);
    }

    public void swap() {
        //напишите тут ваш код
        //да, не принимает с комментариями: первый блок принял, второ й я уже эксперементировала без проверки
        /*int buf = x;
        x = y;
        y = buf;*/
        x ^= y;
        y ^= x;
        x ^= y;
    }
}
