package com;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input the first number of interval ---> ");
        int a = sc.nextInt();
        System.out.println("Please, input the last number of interval ---> ");
        int b = sc.nextInt();
        int counter = wholeSquareCounter(a, b);
        System.out.println("The number of the whole squares in the interval = " + counter);
    }

    public static int wholeSquareCounter(int a, int b) {
        int count = 0;
        if (a < b) {

            for (int i = a; i <= b; i++) {
                if (Math.sqrt(i) % 1 == 0) {
                    count++;
                }
            }
            return count;
        } else
            System.out.println("Wrong number input");
        return 0;

    }
}
