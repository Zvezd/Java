package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numbers [] = new int[3]; // делаем массив на 3 числа
        for (int i = 0; i < numbers.length; i++){   //заганяем числа через цыкл
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(numbers); //сортируем(данные метод сортирует от меньшего к большему
        for (int k = numbers.length-1; k >= 0; k--){ //тут делаем пересортировку чисел, т.е. нам вывести нужно
                                                    // в порядке убывания, а не возрастания.
            System.out.println(numbers[k]);
        }

    }
}
