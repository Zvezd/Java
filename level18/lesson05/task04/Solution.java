package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream2 = new FileOutputStream(fileName2);
        byte[] buffer = new byte[fileInputStream.available()];
        if (fileInputStream.available() > 0)
        {
            fileInputStream.read(buffer);
        }
        byte[] buffer2 = new byte[buffer.length];
        for (int i = 0; i<buffer.length; i++) {
            buffer2[i] = buffer[buffer.length-1-i];
        }
        fileOutputStream2.write(buffer2);
        bufferedReader.close();
        fileInputStream.close();
        fileOutputStream2.close();

    }
}
/*
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(new File(reader.readLine()));
        FileOutputStream out = new FileOutputStream(reader.readLine());
        byte[] buffer = new byte[in.available()];

        for(int i = in.read(buffer); i > 0; i--)
        out.write(buffer[i-1]);
        in.close();
        out.close();

 */