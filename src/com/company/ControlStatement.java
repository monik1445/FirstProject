package com.company;

import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args) {
        testEvenOrOdd(7);
        testPositiveOrNegative(-0);
        testMonthDays(9);
        greatestOf3(12, 4, 8);

    }

    public static void testEvenOrOdd(int x) {
        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println(("Odd"));
        }
    }

    public static void testPositiveOrNegative(int x) {
        if (x > 0) {
            System.out.println("Positive");
        } else if (x < 0) {
            System.out.println("Negative");
        } else if (x == 0) {
            System.out.println("Zero");
        }

    }

    public static void testMonthDays(int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31");
        } else if (month == 4 || month == 6 || month == 8 || month == 7 || month == 9 || month == 11) {
            System.out.println("30");
        } else if (month == 2) {
            System.out.println("28");
        }
    }

    public static void greatestOf3(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println("greatest number is " + a);
        } else if (b >= a && b >= c) {
            System.out.println("greatest number is " + b);
        } else {
            System.out.println("greatest number is " + c);
        }

    }

    public static void checkEligible(boolean isSleeping) {
        if (!isSleeping) {
            System.out.println("Active");
        }
        }
    }

