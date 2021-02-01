package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map <String,String> spisok = new HashMap<>();
        spisok.put("Магера","Орест");
        spisok.put("Цимбалюк","Софія");
        spisok.put("Кубрак","Анастасія");
        spisok.put("Магера","Даніяр");
        spisok.put("Магера","Людмила");

        spisok.put("Шпак","Сергій");
        spisok.put("Кривий","Сергій");
        spisok.put("Княжук","Олександр");
        spisok.put("Нарожний","Олександр");
        spisok.put("Цимбалюк","Олександр");
        return spisok;

    }
    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int pos = 0;

   for (int i = 0 ; i< map.size();i++){
       if(map.containsKey(name))pos++;
   }

     return  pos;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
       int fam = 0;
        for (int i = 0 ; i< map.size();i++){
            if(map.containsValue(lastName))fam++;
        }
     return fam;
    }

    public static void main(String[] args) {
   Map<String,String> map1 = createMap();

        System.out.println( getCountTheSameFirstName(map1,"Сергій"));
        System.out.println( getCountTheSameLastName(map1,"Магера"));
    }
}
