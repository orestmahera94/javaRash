package com.javarush.task.task03.task0315;

/* 
Каждый охотник желает знать…
*/

public class Solution {

    public static void main(String[] args) {
        Red red = new Red();
        Orange orange = new Orange();
        Yellow yellow = new Yellow();
        Green green = new Green();
        Blue blue = new Blue();
        Indigo indigo = new Indigo();
        Violet violet = new Violet();

    }

    static class Red {
        public Red() {
            System.out.println("Red");
        }
    }

   static  class Orange {
        public Orange() {
            System.out.println("Orange");
        }
    }

    static class Yellow {
        public Yellow() {
            System.out.println("Yellow");
        }
    }

    static class Green {
        public Green() {
            System.out.println("Green");
        }
    }

    static class Blue {
        public Blue() {
            System.out.println("Blue");
        }
    }

    static class Indigo {
        public Indigo() {
            System.out.println("Indigo");
        }
    }

    static class Violet {
        public Violet() {
            System.out.println("Violet");
        }
    }
}
