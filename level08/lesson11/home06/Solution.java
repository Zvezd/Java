package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human grandMother1 = new Human("grandMother1",false,50);
        Human grandMother2 = new Human("grandMother2",false,51);
        Human grandFather1 = new Human("grandFather1",true,55);
        Human grandFather2 = new Human("grandFather2",true,56);
        Human Mother = new Human("Mother",false,30);
        Human Father = new Human("Father",true,31);
        Human child1 = new Human("child1",true,12);
        Human child2 = new Human("child2",true,11);
        Human child3 = new Human("child3",false,10);

        System.out.println(grandMother1.toString());
        System.out.println(grandMother2.toString());
        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(Mother.toString());
        System.out.println(Father.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());


        //напишите тут ваш код
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();
        //напишите тут ваш код
        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;

        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
