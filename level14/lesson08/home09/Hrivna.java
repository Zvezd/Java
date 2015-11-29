package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Tiur on 09.10.2015.
 */
public class Hrivna extends Money
{


    @Override
    public String getCurrencyName()
    {
        return "HRN";
    }

    public Hrivna(double amount)
    {
        super(amount);
    }
}
