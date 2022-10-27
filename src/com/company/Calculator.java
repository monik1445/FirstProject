package com.company;

public class Calculator {

    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        int additionResult = Addition(a,b);
        int subtractionResult = Subtraction(a,b);
        int multiplicationResult = Multiplication(a,b);
        int divisiononResult = Division(a,b);

        System.out.println("Addition:"+ additionResult);
        System.out.println("Subtraction:"+ subtractionResult);
        System.out.println("Multiplication:"+ multiplicationResult);
        System.out.println("Division:"+ divisiononResult);

    }

    public static void Welcome(){
        System.out.println("Welcome To My Calculator");
    }

    public static int Addition(int a, int b){
        return a + b;
    }
    public static int Subtraction(int a, int b){
        return a - b;
    }
    public static int Multiplication(int a, int b){
        return a * b;
    }
    public static int Division(int a, int b){
        return a / b;
    }
}
