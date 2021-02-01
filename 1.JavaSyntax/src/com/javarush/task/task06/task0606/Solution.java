package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader((System.in)));
        int  num = Integer.parseInt(reader.readLine());
        int a = 0;
        int b = 0;
        if (num%2!=0) b++;
        else{
            a++;
        }
        num = num/10;
        System.out.println("Even:"+a+" Odd:"+ b);


    }
}
