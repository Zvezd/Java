package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    public Solution(int a){}
    public Solution(Integer a1){}
    public Solution(String a2){}

    Solution(Number b){}
    Solution(char b1){}
    Solution(double b2){}

    protected Solution(float s){}
    protected Solution(byte s1){}
    protected Solution(Object s2){}

    private Solution(Character c){}
    private Solution(Double c1){}
    private Solution(Exception c2){}

}

