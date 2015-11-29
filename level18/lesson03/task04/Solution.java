package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Byte,Integer> map = new HashMap<Byte, Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        reader.close();
        byte[]bytes = new byte[inputStream.available()];
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

        for (Map.Entry<Byte,Integer> pair : map.entrySet()){
            if (pair.getValue().equals(1)){
                System.out.print(pair.getKey() + " ");
            }
        }
    }
}
