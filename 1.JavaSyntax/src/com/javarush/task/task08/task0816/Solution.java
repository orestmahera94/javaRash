package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Iterator;
/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);

        Map<String, Date> map = new HashMap<>();

        map.put("Смирнов", dateFormat.parse(" DECEMBER 1 2012"));
        map.put("Магера", dateFormat.parse("APRIL 1 2012"));
        map.put("Коваль", dateFormat.parse("OCTOBER 1 2012"));
        map.put("Кит", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Дончак", dateFormat.parse("APRIL 1 2012"));
        map.put("Боднар", dateFormat.parse("MARCH 1 2012"));
        map.put("Бондар", dateFormat.parse("MAY 1 2012"));
        map.put("Богдан", dateFormat.parse("MARCH  1 2012"));
        map.put("Цымбалюк", dateFormat.parse("JUNE 1 2012"));
        map.put("Дыдар", dateFormat.parse("JANUARY 1 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {

        Iterator <Map.Entry <String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry <String, Date> pair = iterator.next();
            int month = pair.getValue().getMonth();
            if ((month > 4) && (month < 8)) {
                iterator.remove();
            }
        }
    }
    public static void main(String[] args) {

    }
}
