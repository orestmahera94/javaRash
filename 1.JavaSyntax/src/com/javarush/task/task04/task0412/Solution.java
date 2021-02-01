package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String snum = reader.readLine();
        int nnum =Integer.parseInt(snum);
         if (nnum >0){
             System.out.println(nnum*2);
         }
         else if ( nnum<0){
             System.out.println(nnum+1);
         }
          else {
             System.out.println("0");

         }

    }


}