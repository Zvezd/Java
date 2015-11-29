package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String,Cat> map = new HashMap<String, Cat>();
        map.put("name1",new Cat());
        map.put("name2",new Cat());
        map.put("name3",new Cat());
        map.put("name4",new Cat());
        map.put("name5",new Cat());
        map.put("name6",new Cat());
        map.put("name7",new Cat());
        map.put("name8",new Cat());
        map.put("name9",new Cat());
        map.put("name10",new Cat());
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> set = new HashSet<Cat>();
        for(Map.Entry<String,Cat> a : map.entrySet()){
            set.add(a.getValue());
        }
        //напишите тут ваш код
        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public Cat()
        {

        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
