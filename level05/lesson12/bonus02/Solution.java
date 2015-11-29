package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int w = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, w);

        System.out.println("Minimum = " + minimum);
    }


    public static int min1(int a, int b)
    {
        return a < b ? a : b;
    }
    public static int min(int a, int b, int c, int d, int w){
        int m = min1(a, b);
        if (m<c && m<d) m = min1(a,b);
        else if (c<d) m = c;
        else if (d<c) m = d;
        else if (w<c) m = w;
        else if (w<d) m = w;
        return m;
    }

}//Намного проще было бы использовать массив.
