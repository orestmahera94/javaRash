package com.javarush.task.task06.task0603;

/* 
По 50 000 объектов Cat и Dog
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i<=50000 ; i++){
            Cat cat = new Cat();
            cat = null;
        }

        for ( int i = 1; i<=50000 ; i++){
            Dog dog = new Dog();
            dog = null;
        }
    }
}

class Cat {

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
