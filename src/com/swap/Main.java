package com.swap;

public class Main {

    public static void main(String[] args) {
        // Method #1
        int a = 30;
        int b = 12;
        System.out.println("Before");
        System.out.println("a == " + a + " b == " + b);
        a = b + (b = a - b) - (b = a + b);
        a = -a;
        b = b - a;
        a = b - a;
        System.out.println("After");
        System.out.println("a == " + a + " b == " + b);
        System.out.println();

        // Method #2
        int m = 30;
        int n = 12;
        System.out.println("Before");
        System.out.println("m == " + m + " n == " + n);
        m = m + n;
        n = m - n;
        m = m - n;
        System.out.println("After");
        System.out.println("m == " + m + " n == " + n);
    }

}
