package Assignments;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number whose reverse is to be found: ");
        String originalStr = sc.nextLine();
        String reversedStr = "";
        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }
        System.out.println("Reversed string: " + reversedStr);
    }

}

