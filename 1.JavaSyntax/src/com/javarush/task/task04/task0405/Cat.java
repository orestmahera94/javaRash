package com.javarush.task.task04.task0405;

/* 
Задаем количество котов
*/

public class Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int newcatsCount) {
       catsCount = newcatsCount;
        System.out.println(catsCount);

    }

    public static void main(String[] args) {
      Cat cat = new Cat ();
        setCatsCount(20);
    }
}
