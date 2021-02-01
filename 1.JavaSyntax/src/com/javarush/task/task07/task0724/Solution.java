package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
    }

    public static class Human {

        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

      public Human (String name , boolean sex , int age) {
          this.name = name;
          this.sex = sex;
          this.age = age;
        }

        Human(String name, boolean sex, int age, Human father, Human mother) {
          this.name = name;
          this.sex = sex;
          this.age = age;
          this.father = father;
          this.mother= mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}