package com.company.LevelTen.lesson11;

public class task7 {
    /*Расставьте как можно меньше модификаторов static так, чтобы пример скомпилировался.*/
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args)
    {
        task7 solution = new task7();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        task7.D = 5 * D * C;

        task7.D = 5;
    }

    public int getA()
    {
        return A;
    }
}
