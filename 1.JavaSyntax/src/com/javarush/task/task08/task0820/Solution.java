package com.javarush.task.task08.task0820;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();

       result.add(new Cat());
       result.add(new Cat());
       result.add(new Cat());
       result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> dog = new HashSet<>();
       dog.add(new Dog());
       dog.add(new Dog());
       dog.add(new Dog());

        return dog;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet<Object> result = new HashSet<>();


        Iterator <Cat> itCat = cats.iterator();
        Iterator <Dog> itDog = dogs.iterator();

        while (itCat.hasNext()) {
            result.add(itCat.next());
        }
        while (itDog.hasNext()) {
            result.add(itDog.next());
        }
        return result;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {

        for (Object s:pets)
            System.out.println(s);

    }

   public static class Dog{

   }
   public static class Cat{

   }
}
