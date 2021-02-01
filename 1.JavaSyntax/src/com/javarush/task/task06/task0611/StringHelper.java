package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
     StringBuilder  sb = new StringBuilder().append("Пахать").append("Пахать").append("Пахать").append("Пахать").append("Пахать");

        return sb.toString();

    }

    public static String multiply(String s, int count) {
        String result = "";
        for (int i = 0;i<=count; i++){
            result+=s;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
