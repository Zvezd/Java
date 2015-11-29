package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Tiur on 09.10.2015.
 */
public class Computer
{
    private Keyboard Keyboard;
    private Mouse Mouse;
    private Monitor Monitor;

    public Computer()
    {
        Keyboard = new Keyboard();
        Mouse = new Mouse();
        Monitor = new Monitor();
    }


    public Keyboard getKeyboard()
    {
        return Keyboard;
    }

    public Mouse getMouse()
    {
        return Mouse;
    }

    public Monitor getMonitor()
    {
        return Monitor;
    }
}
