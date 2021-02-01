package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("rino",39,"da");
        System.out.println(man1.toString());
        Man man2 = new Man("dido",30,"dina");
        System.out.println(man2);

        Woman woman1 = new Woman("Anna",29,"Siro");
        System.out.println(woman1);
        Woman woman2 = new Woman("Nina",30,"dixa");
        System.out.println(woman2);


    }

    public static class Man {
        private String name;
        private int age;
        private String address;

        public String toString() {
            return name + " " + age + " " + address;
        }

        public  Man() {

        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public  Man(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public  Man(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public  Man(int age, String address) {
            this.age = age;
            this.address = address;
        }

        public  Man(int age) {
            this.age = age;
        }

        public  Man(String name) {
            this.name = name;
        }

    }

    public static class Woman {
        String name;
        int age;
        String address;

        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }

        public  Woman() {

        }

        public  Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public  Woman(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public  Woman(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public Woman(int age) {
            this.age = age;
        }

        public  Woman(int age, String address) {
            this.age = age;
            this.address = address;
        }

        public  Woman(String name) {
            this.name = name;
        }
    }
}


