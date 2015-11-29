package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Tiur on 16.10.2015.
 */
public class Earth implements Planet{
    static Earth EARTH = null;
    private Earth(){}
    static Earth getInstance(){
        if (EARTH == null){
            EARTH = new Earth();
        }
        return EARTH;
    }
}
