package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {

         System.out.println (convertEurToUsd(20, 1.45) );
        System.out.println (convertEurToUsd(27,1.30));

    }

    public static double convertEurToUsd(int eur, double exchangeRate) {

         return  eur*exchangeRate;

    }
}
