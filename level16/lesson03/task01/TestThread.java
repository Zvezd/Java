package com.javarush.test.level16.lesson03.task01;

/**
 * Created by Tiur on 25.10.2015.
 */
public class TestThread implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("My first thread");
    }
}
