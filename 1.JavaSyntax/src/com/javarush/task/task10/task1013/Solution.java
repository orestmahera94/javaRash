package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {

       private String name;
       private String lastName;
       private String sex;
       private int age;
       private int height;
       private int weight;

     public   Human( String name, String lastName, String sex,int age, int height, int weight){//1
           this.name = name;
           this.lastName = lastName;
           this.sex = sex;
           this.age = age;
           this.height = height;
           this.weight = weight;
       }
      public Human(String name, int age){ //2
           this.name = name;
           this.age = age;
       }
      public Human(String name , String lastName, String sex){//3
           this.name = name;
           this.lastName = lastName;
           this.sex = sex;
       }
      public Human(String name, int age, int height, int weight){//4
           this.name = name;
           this.age = age;
           this.height = height;
           this.weight = weight;
       }
      public Human(String name){//5
           this.name = name;
       }
      public Human(int age){//6
           this.age = age;
       }
      public Human(String sex, int age, String name){//7
           this.sex = sex;
           this.age = age;
           this.name = name;
       }
      public Human(int age, int height, int weight){//8
           this.age = age;
           this.height = height;
           this.weight = weight;
       }
      public Human(String name , int age , String lastName, int weight){//9
          this.name = name;
          this.age = age;
          this.lastName = lastName;
          this.weight = weight;
       }
      public Human (int age, int weight){
           this.age = age;
           this.weight = weight;
       }
    }
}
