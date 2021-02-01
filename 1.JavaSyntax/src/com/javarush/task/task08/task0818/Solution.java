package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map <String,Integer> map = new HashMap<>();
        map.put("Гащенко",10000);
        map.put("Заграй",400);
        map.put("Бузок",700);
        map.put("Горих",200);
        map.put("Пивень",650);
        map.put("Матрос",499);
        map.put("Квитка",900);
        map.put("Джерело",400);
        map.put("Дракон",300);
        map.put("Пень",100);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {

     map.entrySet().removeIf(entry->entry.getValue()<500);

      }


    public static void main(String[] args) {

    }
}