package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
       Map<String, Cat> kyzi = new HashMap<>();
    kyzi.put("Bibo",new Cat("Bibo"));
    kyzi.put("Boba",new Cat("Boba"));
    kyzi.put("Didi",new Cat("Didi"));
    kyzi.put("Dodo",new Cat("Dodo"));
    kyzi.put("Kiti",new Cat("Kiti"));

    kyzi.put("Pipi", new Cat("Pipi"));
    kyzi.put("Lili",new Cat("Lili"));
    kyzi.put("Sisi",new Cat("Sisi"));
    kyzi.put("Kiki", new Cat("Kiki"));
    kyzi.put("Titi",new Cat("Titi"));

       return kyzi;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
          Map <String,Cat> cat = map;
          Set<Cat> set = new HashSet<>(cat.values());
             return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
