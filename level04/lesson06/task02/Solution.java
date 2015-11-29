package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numbers [] = new int[4];
        for (int i = 0;i < numbers.length; i++){
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(numbers);
        System.out.println(numbers[3]);
    }
}
