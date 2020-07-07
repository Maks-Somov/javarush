package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class lessonFour {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(reader.readLine());
//        int c = Integer.parseInt(reader.readLine());
//        int b = Integer.parseInt(reader.readLine());
//        System.out.println("TriangloOrNot(a,b,c) = " + TriangloOrNot(a, b, c));

//        float time = Float.parseFloat(reader.readLine());
//        System.out.println(trafficlight(time));

//        int a = Integer.parseInt(reader.readLine());
//        int c = Integer.parseInt(reader.readLine());
//        int b = Integer.parseInt(reader.readLine());
//        order(a,b,c);

//        table(2,4);

        triangle(10);
    }

    private static void order(int a, int b, int c) {
        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;

        Arrays.sort(arr);
        for (int i = 2; i>=0; i--){
            System.out.println(arr[i]);
        }

    }

    private static String trafficlight(float time) {
        String color = null;

        if (time%5<3) color = "Green";
        if (time%5<4 && time>=3) color = "Yellow";
        if (time%5<5 && time>=4) color = "Red";

        return color;
    }

    private static String TriangloOrNot(int a, int b, int c) {
        if(((a+b)<c) && ((a+c)<b) && ((b+c)<a)){
            return "Yes";
        }
        return "No";
    }

    private static void table(int a){
        int i = 1;
        int j = 1;
        while (i<a){
            while (j<a){
                System.out.print(i*j+" ");
                j++;
            }
            System.out.println();
            i++;
            j=1;
        }
    }

    private static void table(int n, int m){
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                System.out.print("s"+" ");
            }
            System.out.println();
        }
    }

    private static void triangle(int a){
        for (int i = a; i>0; i--){
            for (int j=i; j<a+1;j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
