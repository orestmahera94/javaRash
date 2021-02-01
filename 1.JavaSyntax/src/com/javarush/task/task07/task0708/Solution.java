package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();

        for (int i = 0; i<5;i++) {
            String s = reader.readLine();
            strings.add(s);
        }

        int max = strings.get(0).length();

        for ( String string:strings) {
            if ( string.length()>max) {
                max = string.length();

            }
        }

        for ( String string: strings){
            if(max == string.length()){
                System.out.println(string);
            }
        }



    }
}
