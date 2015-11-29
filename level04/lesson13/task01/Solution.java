package com.javarush.test.level04.lesson13.task01;

/* Четные числа
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int q = 2;
        for(int i = 2; i < 102;){
            System.out.println(i);
            i=i+q;
        }
        //напишите тут ваш код

    }
}
