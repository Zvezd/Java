package com.javarush.test.level15.lesson12.home04;


/**
 * Created by Tiur on 15.10.2015.
 */
public class Sun implements Planet{
    static Sun SUN = null;
    private Sun() {}
    static Sun getInstance(){
        if (SUN == null){
            SUN = new Sun();
        }
        return SUN;
    }

}
