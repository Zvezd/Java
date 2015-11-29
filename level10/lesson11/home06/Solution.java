package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        int age;
        int weight;
        int height;
        boolean sex;
        String address;

        public Human(String name, String address){
            this.name = name;
            this.address = address;
        }
        public Human(String name, String address, boolean sex){
            this.name = name;
            this.address = address;
            this.sex = sex;
        }
        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Human(String name, int weight, String address){
            this.name = name;
            this.weight = weight;
            this.address = address;
        }
        public Human(int height, int weight, int age){
            this.height = height;
            this.weight = weight;
            this.age = age;
        }
        public Human(String name, boolean sex){
            this.name = name;
            this.sex = sex;
        }
        public Human(int height, int age, boolean sex){
            this.height = height;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name, int weight, int height){
            this.name = name;
            this.weight = weight;
            this.height = height;
        }
        public Human(String address, boolean sex, int age){
            this.address = address;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, String address, int age, int height, int weight){
            this.name = name;
            this.address = address;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }
        //напишите тут ваши переменные и конструкторы
    }
}
