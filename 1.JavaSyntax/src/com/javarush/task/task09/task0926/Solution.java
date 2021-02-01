package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
       ArrayList<int[]> mas = new ArrayList<>(Arrays.asList(new int[5],new int[-2],new int[-4],new int[7],new int[0]));
        return mas;
    }

    public static void printList(ArrayList<int[]> list) throws NegativeArraySizeException{
       try {
           for (int[] array : list) {
               for (int x : array) {
                   System.out.println(x);
               }
           }
       }
       catch (NegativeArraySizeException e){
           System.out.println("");
       }
    }
}
