package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/*
Массив списков строк
*/

        public class Solution {
            public static void main(String[] args) {
                ArrayList<String>[] arrayOfStringList = createList();
                printList(arrayOfStringList);
            }

            public static ArrayList<String>[] createList() {
                ArrayList <String> one = new ArrayList<>();
                one.add("Drug");
                one.add("Korol");
                one.add("Den");

                ArrayList<String> two = new ArrayList<>();
                two.add("d");
                two.add("s");
                two.add("q");

                ArrayList<String> three = new ArrayList<>();
                three.add("435435");
                three.add("234");
                three.add("19902032");

                ArrayList <String>[] mas = new ArrayList[3];
                mas[0] = one;
                mas[1] = two;
                mas[2] = three;

                return mas;
            }

            public static void printList(ArrayList<String>[] arrayOfStringList) {
                for (ArrayList<String> list : arrayOfStringList) {
                    for (String string : list) {
                        System.out.println(string);
                    }
                }
            }
        }
