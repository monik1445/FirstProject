package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i<=4; i++ ){
            System.out.println("Enter marks");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}