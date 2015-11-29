package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        reader.close();
        FileInputStream in = new FileInputStream(file1);
        FileOutputStream out1 = new FileOutputStream(file2);
        FileOutputStream out2 = new FileOutputStream(file3);
        byte[] buffer = new byte[in.available()];
        if (in.available() > 0) {
            int count = in.read(buffer);
            if (count%2 != 0)
            {
                out1.write(buffer, 0, count/2+1);
                out2.write(buffer, count/2+1, count/2);

            }
            else
            {
                out1.write(buffer, 0, count/2);
                out2.write(buffer, count/2, count/2);
            }
        }
        in.close();
        out1.close();
        out2.close();
    }
}
