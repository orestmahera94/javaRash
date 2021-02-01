package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader ( new InputStreamReader(System.in));
       int parni =0;
       int neparni = 0;
        int [] array = new int [15];
        for (int i = 0; i<15 ; i++) {
            array[i] = Integer.parseInt(reader.readLine());
            if (i%2!=0){
                neparni+=array[i];
            }
              else if(i%2==0){
                  parni+=array[i];
            }
              if (neparni>parni){
                  System.out.println("В домах с нечетными номерами проживает больше жителей.");
              }
              else if (parni>neparni){
                System.out.println("В домах с четными номерами проживает больше жителей.");
            }
        }
    }
}
