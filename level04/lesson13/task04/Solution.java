package com.javarush.test.level04.lesson13.task04;

import java.io.*;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        for(int i=0; i<=10; i++)//дебильная задача, мб кто будет читать так знайте что нужно
        {                       //вывести 10 и 10 цыфр, т.е. в вертикальном ряду будет 11
            for(int j=0; j<10; j++)
            {
                if( i==0 || j==0 ) //если i = 0 то печатает в ряд наши 10ть восьмерок
                                    //после этого і уже никогда небудет = 0, после печатает столбиком
                                    //т.к. j будет равно і при каждой итерации(цыкле)
                    System.out.print("8");
            }
            System.out.println();
        }
        /*
        Более простой способ, но мыж не ищем лёгких путей :)
        for (int i=0;i<9;i++)
            System.out.print("8");
        for (int i=0;i<11;i++)
            System.out.println("8");
         */

    }
}
