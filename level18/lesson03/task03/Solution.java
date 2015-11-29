package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/
//https://github.com/ailyenko/JavaRush/blob/master/src/com/javarush/test/level18/lesson03/task03/Solution.java
public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Byte,Integer> map = new HashMap<Byte, Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        reader.close();
        byte [] bytes = new byte[inputStream.available()];
        if (inputStream.available() > 0){
            inputStream.read(bytes);
        }
        for (byte c : bytes){
            int count = 0;
            for (byte c1 : bytes){
                if (c == c1)count++;
            }
            map.put(c,count);
        }
        int maxBytes = 0;
        for (Map.Entry<Byte,Integer> pair : map.entrySet()){
            if (pair.getValue() > maxBytes){
                maxBytes = pair.getValue();
            }
        }
        for (Map.Entry<Byte,Integer> pair : map.entrySet()){
            if (pair.getValue().equals(maxBytes)){
                System.out.print(pair.getKey() + " ");
            }
        }
    }
}
