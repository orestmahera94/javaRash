package com.javarush.task.task08.task0803;

import java.util.HashMap;
import java.util.Map;

/* 
Коллекция Map из котов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        Map<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static Map<String, Cat> addCatsToMap(String[] cats) {
        Map<String,Cat> map = new HashMap<String,Cat>();
         map.put(cats[0],new Cat("васька"));
         map.put(cats[1],new Cat("мурка"));
         map.put(cats[2],new Cat("дымка"));
         map.put(cats[3],new Cat("рыжик"));
         map.put(cats[4],new Cat("серый"));
         map.put(cats[5],new Cat("снежок"));
         map.put(cats[6],new Cat("босс"));
         map.put(cats[7],new Cat("борис"));
         map.put(cats[8],new Cat("визя"));
         map.put(cats[9],new Cat("гарфи"));
        return map;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
