package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Tiur on 05.10.2015.
 */
public class UkrainianHen extends Hen implements Country
{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 30;//return (int)Math.floor(Math.random() * 1000);
    }
    @Override
    String getDescription()
    {
        return super.getDescription()+" Моя страна - "+UKRAINE+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
