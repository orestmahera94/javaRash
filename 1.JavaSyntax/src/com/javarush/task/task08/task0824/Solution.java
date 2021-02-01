package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {

      Human dodther = new Human("Ira",false,23);
      Human chil = new Human("Nazik", true,21);
      Human dytyna =new Human("Kira", false,18);

      Human mother = new Human("Nina",false,47,dytyna,dodther,chil);
      Human tato = new Human("Sirochza", true,50,dodther,dytyna,chil);

      Human did = new Human("Vasyl",true,78,tato);
      Human baba = new Human("Horpynka", false,73,tato);

      Human dido = new Human("Stepan",true,79,mother);
      Human bibi = new Human("Dunja", false,76,mother);


        System.out.println(chil);
        System.out.println(dytyna);
        System.out.println(dodther);
        System.out.println(mother);
        System.out.println(did);
        System.out.println(baba);
        System.out.println(dido);
        System.out.println(bibi);
    }

    public static class Human {
       String name;
       boolean sex;
       int age;
       ArrayList <Human> children = new ArrayList<>();

      public Human (String name,boolean sex,int age){
           this.name = name;
           this.sex = sex;
           this.age = age;
       }

       public Human (String name , boolean sex, int age, Human ... children){
          this.name = name;
          this.sex = sex;
          this.age = age;
          Collections.addAll(this.children,children);
       }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            else if(childCount==0){
                text+= " , дети: нет.";
            }
            return text;
        }
    }
}
