package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Tiur on 16.10.2015.
 */
public class Moon implements Planet{
    static Moon MOON = null;
    private Moon(){}
    static Moon getInstance(){
        if (MOON == null){
            MOON = new Moon();
        }
        return MOON;
    }
}
