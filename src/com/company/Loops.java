package com.company;

public class Loops {
    public static void main(String[] args) {
        int sum = 0;        // int sum=1 for multiply and divide operator
        for (int i = 1; i <= 10; i++) {
                            // (i%2==0) will give even numbers      (i%2!=0) for odd numbers        --->System.out.println(i);
        sum = sum + i;
            System.out.println(sum);
        }
    }
}
