package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date date = new SimpleDateFormat("yyyy-M-dd", Locale.ENGLISH).parse(reader.readLine());
        SimpleDateFormat sdf = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
     try{

         System.out.println(sdf.format(date).toUpperCase(Locale.ROOT));
        }
     catch (NullPointerException e) {

     }

    }
}
