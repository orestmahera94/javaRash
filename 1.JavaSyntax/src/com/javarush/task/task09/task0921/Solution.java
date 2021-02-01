package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

           try {
              String string;
               while (true){
                   string = reader.readLine();
                   list.add(Integer.parseInt(string));
               }

           }
          catch (IOException r){

          }
finally {
               for (Integer s : list) {
                   System.out.println(s);}
           }


    }
}
