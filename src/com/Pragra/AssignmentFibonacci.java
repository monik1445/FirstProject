package com.Pragra;

public class AssignmentFibonacci {
    public static void main(String[] args) {
        int n = 10, firstnum = 0, secondnum = 1;
        System.out.println("Fibonacci series up to" + n + "is:");
        for (int i = 1; i <= n; ++i) {
            System.out.println(firstnum+",");

            int nextnum = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = nextnum;
        }
    }
}
