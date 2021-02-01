package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        
        int [] getInts = new int [20];
         
        int maximum = getInts[0];
        int minimum = maximum;
        
        for (int i = 0; i<getInts.length; i++){
            if(getInts[i] > maximum){
                  maximum = i;
            }
            if (getInts[i] < minimum){
                  minimum=i;
            }
          }
        System.out.print(maximum + " " + minimum);
    }
    
    


      }

