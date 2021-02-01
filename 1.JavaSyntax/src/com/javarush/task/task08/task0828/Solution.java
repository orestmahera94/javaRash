package com.javarush.task.task08.task0828;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList <String> year = new ArrayList<>();
        Collections.addAll(year,"January","February", "March","April","May","June","July","August","September","October","November","December");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        for (int i  = 0 ; i< year.size();i++){
           if (s.equals(year.get(i))){
               System.out.println(s+" is the"+i+" month");
           }
        }
    }
}
