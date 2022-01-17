package com.javarush.task.pro.task02.task0221;

public class Solution {
    public static void main(String[] args) {
        String latitude = "40.7281";
        String longitude = "-74.042";
        String numberS = "87";
        String numberF = "89";
        String comma = ",";
        //40.728189,-74.0428987
        System.out.println(latitude + numberF + comma + longitude + numberF + numberS);
    }
}
