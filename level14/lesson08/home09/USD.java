package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Tiur on 09.10.2015.
 */
public class USD extends Money
{

    @Override
    public String getCurrencyName()
    {
        return "USD";
    }

    public USD(double amount)
    {
        super(amount);
    }
}
