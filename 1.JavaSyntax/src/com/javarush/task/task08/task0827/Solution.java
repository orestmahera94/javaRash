package com.javarush.task.task08.task0827;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
    Date date1 = new  Date (date);
     SimpleDateFormat dt = new SimpleDateFormat("D");
     int x = Integer.parseInt(dt.format(date1));
      return x%2!=0;
    }
}
