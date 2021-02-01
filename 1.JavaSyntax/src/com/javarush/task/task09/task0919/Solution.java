package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {


       try {
             divideByZero();
       }
       catch (Throwable exeption){
           exeption.printStackTrace();
       }
    }


    public static void divideByZero(){

        int y = 1;
        int x = y/0;
        System.out.println(y);
    }


}
