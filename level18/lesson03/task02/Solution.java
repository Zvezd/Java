package com.javarush.test.level18.lesson03.task02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        //int min = inputStream.read();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while (inputStream.available() > 0){
            int a = inputStream.read();
            arrayList.add(a);
            //if (a < min){
            //   min = a;
            //}

        }
        int [] ints = new int[arrayList.size()];
        for (int i = 0; i < ints.length; i++){
            ints[i] = arrayList.get(i);
        }
        Arrays.sort(ints);
        System.out.println(ints[0]);
        //System.out.println(min);
        inputStream.close();
    }
}
