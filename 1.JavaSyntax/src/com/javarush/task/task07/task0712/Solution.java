package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<String> list = new ArrayList<String>();
    
    for (int i = 0; i<10; i++)
        list.add(reader.readLine());

    int min = list.get(0).length();
    int max = list.get(0).length();
        for (int i = 0; i<10;i++){
            if (max>=list.get(i).length())
                max = list.get(i).length();
        }

    for (String string: list){
        if (min<string.length())
            min = string.length();
    }

    for (String string: list)
        if(max>list.size()){
            System.out.println(list.get(0));
            break;
        }
        else if (list.get(0).length()<min){
            System.out.println(list.get(0));
            break;
        }

        
        
        
    }
    
    
    
    
        
}

