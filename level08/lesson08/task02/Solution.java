package com.javarush.test.level08.lesson08.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;


/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> numbers = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        return numbers;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        Iterator<Integer> iterator = set.iterator();//вызываем итератор
        while (iterator.hasNext()){
            if (iterator.next()>10 && iterator.next()%2 == 0) iterator.remove();//если значение больше 10, то удаляем и переходим к следующему
        }
        return set;
    }

    public static void main (String [] args) throws IOException{//от себя
        HashSet<Integer> set = createSet();
        System.out.println(removeAllNumbersMoreThan10(set));
    }
}
/*
модифицыровал так : удаляэт все четные цыфры мз списка которые идут выше 10
 */