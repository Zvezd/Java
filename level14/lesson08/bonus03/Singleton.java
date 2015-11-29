package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Tiur on 09.10.2015.
 */
public class Singleton
{
    static Singleton INSTANCE = null;
    private Singleton() {}

    static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
