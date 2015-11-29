package com.javarush.test.level16.lesson03.task03;

import java.util.ArrayList;
import java.util.List;

/* Список и нити
В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread thread1 = new SpecialThread();
        list.add(new Thread(thread1));
        SpecialThread thread2 = new SpecialThread();
        list.add(new Thread(thread2));
        SpecialThread thread3 = new SpecialThread();
        list.add(new Thread(thread3));
        SpecialThread thread4 = new SpecialThread();
        list.add(new Thread(thread4));
        SpecialThread thread5 = new SpecialThread();
        list.add(new Thread(thread5));

        System.out.println(list);
    }

    public static class SpecialThread implements Runnable {

        public void run() {
            System.out.println("it's run method inside SpecialThread");
        }
    }
}
