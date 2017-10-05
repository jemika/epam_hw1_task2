package com.company;


public class Main {

    public static void main(String[] args) {
        System.out.print("result === >" );
        System.out.println(func());
    }

    public static double func() {
        double an = 1;
        int n = 0;
        while (1.0 + an > 1.0) {
            an = 1 / Math.pow((n + 1), 2);
            n += 1;
        }
        return n - 1;
    }
}