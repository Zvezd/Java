package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int max = inputStream.read(); // int max = 0;
        //ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while (inputStream.available() > 0){
            int a = inputStream.read();
            //arrayList.add(a);
            if (a > max){
                max = a;
            }

        }
        //int [] ints = new int[arrayList.size()];
        //for (int i = 0; i < ints.length; i++){
        //    ints[i] = arrayList.get(i);
        //}
        //Arrays.sort(ints);
        //System.out.println(ints[ints.length-1]);
        System.out.println(max);
        inputStream.close();
    }
}
