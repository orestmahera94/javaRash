package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



public class Solution {
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       
        List<Integer> list = new ArrayList<> ();
        list.add(Integer.parseInt(reader.readLine()));
        int a = 1;
        int b = 1;
        for (int i = 0 ; i<list.size()-1; i++){
            if (list.get(i).equals(list.get(i+1))) {
                a++;
                if (b < a) {
                    b = a;
                }
            }
                else {
                    a = 1;
                }

        }
        System.out.println(a);
    }
}
