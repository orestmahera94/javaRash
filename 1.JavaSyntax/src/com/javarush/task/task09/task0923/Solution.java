package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String vvod = reader.readLine();
        char[] bukvy = vvod.toCharArray();
        ArrayList<Character> holosni = new ArrayList<>();
        ArrayList<Character> pryholosni = new ArrayList<>();
        for(char a: bukvy){
            if(isVowel(a)){
                holosni.add(a);
            }
            else if(!isVowel(a) && a!=' '){
                pryholosni.add(a);
            }
        }

        for (char h: holosni){
            System.out.print(h);
        }
        for (char p: pryholosni ){
            System.out.print(p);
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}