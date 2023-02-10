package jan2023;

import java.util.Scanner;

public class TestCode {
    public static void main(String[] args) {

        // IF ELSE
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st value ");
        int x = sc.nextInt();
        System.out.println("Enter 2nd value ");
        int y = sc.nextInt();


        // int x = 5;
        // int y = 6;
        if (x == y) {
            System.out.println("Both are same");
        } else {
            System.out.println("Both are different");
        }


    }

}
