package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
    
   ArrayList <String> list = new ArrayList<String>();
   
   for (int i = 0 ; i<5 ; i++) {
       list.add(reader.readLine());
   }
       int a= 0;
   for ( a = 0; a<13;a++) {
           list.set(0, list.get(4));
           list.remove(4);
         }
        System.out.println(list.get(a));
   
   
   
   
    }
}
