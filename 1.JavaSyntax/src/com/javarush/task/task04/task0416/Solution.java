package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());


        double a=t%5;

        if (0<a && a<3.0){
            System.out.println("\"зелёный\"");
        }
        else if( 3.0<a && a<4.0) {
            System.out.println("\"жёлтый\"");
        }
        else if ( 4.0<a && a<5.0){
            System.out.println("\"красный\"");
        }
        else {

        }
}
}