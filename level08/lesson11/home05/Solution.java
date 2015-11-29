package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char [] charArr = s.toCharArray();
        charArr[0] = Character.toUpperCase(charArr[0]);//Комент 1
        for (int i = 0; i < charArr.length-1; i++) {
            if (charArr[i] == ' '){
                charArr[i+1] = Character.toUpperCase(charArr[i+1]);
            }
        }
        System.out.println(charArr);
    }
}
/*Комент 1:
Этот цыкл превращает 1вую букву в заглавную, все остальные в маленькие(даже если они были введены заглавными)
            for (int k = 0; k < charArr.length; k++) {
            if (k == 0){
                charArr[k] = Character.toUpperCase(charArr[k]);
            } else
                charArr[k] = Character.toLowerCase(charArr[k]);
        }
 */