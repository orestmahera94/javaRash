package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));


    }

    public static int getMinimum(List<Integer> array) {
        List<Integer>list = array;
         int b = Collections.min(array) ;
      return b;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        List<Integer> array = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i<n;i++){
            int p =  Integer.parseInt(reader.readLine());
            array.add(p);
        }
        return array;
    }
}

