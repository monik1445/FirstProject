package com.company;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] marks = {100, 200, 300, 400, 500};
        int sum = 0;
        int i;
        for (i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        System.out.println(sum/ marks.length);
    }
}