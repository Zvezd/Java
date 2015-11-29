package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        System.out.println(nod(a, b));
    }


    public static int nod(int a, int b){
        int min;
        int nod = 0;
        if(a > b)
            min = b;
        else
            min = a;
        for(int count = 1;count <= min;count++)
        {
            if(a % count == 0 && b % count == 0){
                if(count>nod)
                    nod = count;
            }
        }
        return nod;
    }
}
/*
        if (a > b) a = a - b; else b = b - a;
        if (b == 0)
        {
            System.out.println(a);
            return;
        }
        nod(a, b);
 */
/*
int min;
        int nod = 0;
        if(a > b)
            min = b;
        else
            min = a;
        for(int count = 1;count <= min;count++)
        {
            if(a % count == 0 && b % count == 0){
                if(count>nod)
                    nod = count;
            }
        }
        return nod;
 */
