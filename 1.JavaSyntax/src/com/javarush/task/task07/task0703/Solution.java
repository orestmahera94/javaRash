package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader ( new InputStreamReader(System.in));
        int [] array = new int [20];
        for(int i = 0; i<20 ; i++)
            array [i] = Integer.parseInt(reader.readLine());
        int [] mas1 = new int [10];

        System.arraycopy (array, 0, mas1, 0, 10);

        int [] mas2 = new int [10];

        System.arraycopy (array, 10, mas2,0 , 10);
        for (int i=0; i < mas2.length; i++) {
            System.out.print(mas2[i] + " ");
        }
    }
}

