package com.company.LevelNine.lesson11;

public class task7 {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public void main(String[] args)
    {
        task7 room = new task7();
        room.A = 5;

        task7.D = 5;
    }

    public int getA()
    {
        return A;
    }
}
