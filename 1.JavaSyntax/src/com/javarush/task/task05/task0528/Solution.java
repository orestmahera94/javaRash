package com.javarush.task.task05.task0528;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    int day;
    int month;
    int years;

   public  void time(int day, int month, int years){
       this.day = day;
       this.month = month;
       this.years = years;
       System.out.println(day+" "+month+" "+years);
   }

    public static void main(String[] args) {
     Solution solution = new Solution();
   solution.time(3,6,2021);

    }
}
