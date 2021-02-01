package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sNom1 = reader.readLine();
        int nNom1 = Integer.parseInt(sNom1);
        String sNom2 = reader.readLine();
        int nNom2 = Integer.parseInt(sNom2);
        System.out.println(name +" получает "+nNom1+" через "+nNom2+" лет.");

    }
}
