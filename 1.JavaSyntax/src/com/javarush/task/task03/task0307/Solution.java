package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {


        Zerg biba1 = new Zerg();
        biba1.name = "biba";
        Zerg boba2 = new Zerg();
        boba2.name = "boba";
        Zerg kuka3 = new Zerg();
        kuka3.name = "kuka";
        Zerg Tuta4 = new Zerg();
        Tuta4.name = "tuta";
        Zerg tama5 = new Zerg();
        tama5.name = "tama";

        Protoss pisun1 = new Protoss();
        pisun1.name = "pisun";
        Protoss dunduk2 = new Protoss();
        dunduk2.name = "dudnduk";
        Protoss kisa3 = new Protoss();
        kisa3.name = "kisa";

        Terran luba1 = new Terran();
        luba1.name = "luba";
        Terran duda2 = new Terran();
        duda2.name = "duda";
        Terran dida3 = new Terran();
        dida3.name = "dadi";
        Terran kaka4 = new Terran();
        kaka4.name = "dupa";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
