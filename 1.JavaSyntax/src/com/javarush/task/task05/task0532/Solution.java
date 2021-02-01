package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     int maximum = 0;   
    int a = Integer.parseInt(reader.readLine());

    if (a>=0){
     maximum = a;  
    int b;
    int i;
    for (i=1; i<=a;i++){
    b = Integer.parseInt(reader.readLine());
    maximum = maximum>=b?maximum:b;
    }
    }
    System.out.println(maximum);
    
}
}