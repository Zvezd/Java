package com.javarush.test.level16.lesson13.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Клубок
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. нить 1 должна бесконечно выполняться;
1.2. нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. нить 3 должна каждые полсекунды выводить "Ура";
1.4. нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. нить 5 должна читать с консоли цифры пока не введено слово "N", а потом вывести в консоль сумму введенных цифр.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.
Подсказка: Нить 4 можно проверить методом isAlive()
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<Thread>(5);

    static {
        threads.add(new Th1());
        threads.add(new Th2());
        threads.add(new Th3());
        threads.add(new Th4());
        threads.add(new Th5());
    }
//    public static void main (String[] args) {
//        Th1 th1 = new Th1();
//
//
//    }
    public static class Th1 extends Thread {
        @Override
        public void run()
        {
            while (true){

            }
        }
    }
    public static class Th2 extends Thread {
        @Override
        public void run(){
            try{
            throw new InterruptedException();
            }catch (InterruptedException e){
                System.out.println("InterruptedException");
            }

        }
    }
    public static class Th3 extends Thread {
        @Override
        public void run()
        {
            try
            {
                while (true){
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            }catch (InterruptedException e){

            }
        }
    }
    public static class Th4 extends Thread implements Message {
        @Override
        public void run()
        {
            Thread thread = Thread.currentThread();
            while (!thread.isInterrupted()){

            }
        }

        @Override
        public void showWarning()
        {
            this.interrupt();
            try
            {
                this.join();
            }catch (Exception e){

            }

        }
    }
    public static class Th5 extends Thread {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum;

        @Override
        public void run()
        {
            try {
                while (!isInterrupted()){
                    String s = reader.readLine();
                    if (s.equals("N"))this.interrupt();
                    else sum = sum + Integer.parseInt(s);
                }
                throw new InterruptedException();
            }catch (IOException e){

            }
            catch (InterruptedException  e){
                System.out.println(sum);
            }

        }
    }
}
