package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map <String,String> map = new HashMap<>();
        map.put("Барак","Обама");
        map.put("Байден","Джо");
        map.put("Трамп","Дональд");
        map.put("Зеленський","Володимир");
        map.put("Суарес"," Габриель");
        map.put("Суарес"," Дейв");
        map.put("Кролик","Джо");
        map.put("Бакс","Бани");
        map.put("Двейн","Джонсон");
        map.put("Увильям","Смитт");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
