package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
         BufferedReader r = new BufferedReader( new InputStreamReader(System.in));
         
          int y = 0;
          int x = 0;
    if (Integer.parseInt(r.readLine())>=1) x++;
    else {
        y++;
     }
    if (Integer.parseInt(r.readLine())>=1) x++;
     else {
        y++;
    }
    if (Integer.parseInt(r.readLine())>=1) x++;
     else {
        y++;
    }
System.out.println("количество отрицательных чисел: "+y+" количество положительных чисел: "+x);


    }
}
