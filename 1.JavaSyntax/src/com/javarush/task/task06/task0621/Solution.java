package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String didoName = reader.readLine();
        Cat catDido = new Cat(didoName);

        String babaName = reader.readLine();
        Cat catBaba = new Cat(babaName);

        String tatoName = reader.readLine();
        Cat catTato = new Cat(tatoName, null, catDido);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catBaba, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catTato);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catTato);

        System.out.println(catDido);
        System.out.println(catBaba);
        System.out.println(catTato);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat m;
        private Cat f;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mather, Cat father) {
            this.name = name;
            this.m = mather;
            this.f = father;
        }

        @Override
        public String toString() {
            if (m==null && f==null )
               return "The cat's "+name+" no mother, no father";
            else if ( m== null )
                return "The Cat's "+name+" no mother, father is "+f.name;
            else if (f==null)
                return "The Cat's "+name+"mother is "+m.name+", no father";
            else
                return "The Cat's "+name+"mother is "+m.name+", father is "+f.name;
        }
    }
}


        

    
    


