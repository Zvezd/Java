package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;
import java.util.Arrays;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer N = Integer.parseInt(reader.readLine());
        int numbers [] = new int[N];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(numbers);//можно еще пузырьком, но так легче(скорость тут неимеет значения)
        for (int i = numbers.length-1; i >= 0; i--){
            System.out.println(numbers[i=(N-1)]);
            break;
        }

    }
}
/* Альтернативный вариант от товарища Daniil1178
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = -999999999;
        int N = Integer.parseInt(reader.readLine());
        int s = 0;
        if (N > 0) {
            for (int i = 0; i < N; i++) {
                int m = Integer.parseInt(reader.readLine());

                if (m > maximum) maximum = m;
            }
            System.out.println(maximum);
        } else System.out.println("Ошибка");
    }
 */