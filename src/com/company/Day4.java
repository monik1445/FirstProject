package com.company;

import java.util.Date;

public class Day4 {
    public static void main(String[] args) {
        double a = 12, b = 25;
        double additionResult, subtractionResult, multiplicationResult, divisionResult;
        additionResult = sum(a, b);
        subtractionResult = sub(a, b);
        multiplicationResult = mul(a, b);
        divisionResult = div(a, b);
        System.out.println("Addition: "+additionResult);
        System.out.println("Subtraction: "+subtractionResult);
        System.out.println("Multiplication: "+multiplicationResult);
        System.out.println("Division: "+divisionResult);
    }

    public static double sum(double a, double b){
        return a + b;
    }

    public static double sub(double a, double b){
        return a - b;
    }

    public static double mul(double a, double b){
        return a * b;
    }

    public static double div(double a, double b){
        return a / b;
    }
}