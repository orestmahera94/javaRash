package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        if (n == 0) {
            System.out.println("ноль");
        }
          else if (n > 0) {
            if (n / (n / 2) == 2) {
                System.out.println("положительное  четное число");
            } else if (n / (n / 2) != 2) {
                System.out.println("положительное не четное число");
            }
        }
           else if (n<0){
              if (n %2 == 2) {
                System.out.println("отрицательное четное число");
            } else if (n %2 != 2) {
                System.out.println("отрицательное не четное число");
            }
        }
    }
}



