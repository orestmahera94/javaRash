package com.javarush.task.task04.task0406;

/* 
Программа учета имен
*/

public class Cat {
    private String fullName;

    public void setName(String firstName, String lastName) {

        fullName = firstName + " " + lastName;
        String fullName = this.fullName;
        System.out.println(fullName);

    }

    public static void main(String[] args) {

    }
}
