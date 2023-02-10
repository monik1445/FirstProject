package Assignments;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int i, sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a natural number whose sum is to be found: ");
        int number = sc.nextInt();

        for (i = 1; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println("sum of " + number + " is: " + sum);
    }

}

