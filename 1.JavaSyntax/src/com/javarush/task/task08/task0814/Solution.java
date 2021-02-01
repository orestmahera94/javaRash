package com.javarush.task.task08.task0814;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set <Integer> nom = new HashSet<>();
        nom.add(3);
        nom.add(29);
        nom.add(3);
        nom.add(59);
        nom.add(29);

        nom.add(4);
        nom.add(57);
        nom.add(3);
        nom.add(78);
        nom.add(4);

        nom.add(3);
        nom.add(7);
        nom.add(7);
        nom.add(5);
        nom.add(4);
        nom.add(854);

        nom.add(73);
        nom.add(2);
        nom.add(45);
        nom.add(5);
        nom.add(2);
        return nom;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {

        set.removeIf(s -> s > 5);
        return set;
    }

    public static void main(String[] args) {

    }
}
