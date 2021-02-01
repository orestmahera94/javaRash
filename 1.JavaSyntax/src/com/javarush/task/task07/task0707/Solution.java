package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Pryvit");
        list.add("hlopzi");
        list.add("ta");
        list.add("divchata");
        list.add("Sho take");
        System.out.println(list.size());
        for (int i = 0; i<list.size(); i++){


            System.out.println(i);
        }
    }
}
