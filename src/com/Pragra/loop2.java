package com.Pragra;

public class loop2 {
    public static void main(String[] args) {
        // 1 1 1 row 1 ---> main task
        // 2 2 2 row 2
        // 3 3 3 row 3
        // 4 4 4 row 4

        int i;
        for (i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
