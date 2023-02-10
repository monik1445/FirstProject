package com.company;

import java.util.Arrays;

public class stringMethods {
    public static void main(String[] args) {
        String s ="Monik Patel ";
        String f = "Monik Rasikbhai Patel";
        System.out.println(s.substring(2)); // to cut between string
        System.out.println(s.substring(2, 4));


        byte[] bytes = s.getBytes();// to convert into bytes
        System.out.println((Arrays.toString(bytes)));

        System.out.println(s.compareTo("dhruvi"));  // to compare two strings

        System.out.println(s.concat(" Patel")); // to add two strings

        String[] s1 = s.split(" ");
        System.out.println(Arrays.toString(s1));

        System.out.println(s.replace("M", "N"));    // to replace character/string

        char[] chars = s.toCharArray();
        System.out.println(Arrays.toString(chars)); // to convert into char array

        System.out.println(s.startsWith("Mo")); // checks and returns in boolean

        System.out.println(s.length());     // checks length of string

        System.out.println(s.indexOf('a',4)); // checks index of string

        String a = "123456";

        int i = Integer.parseInt("1234");       // parse--> convert string into int
        System.out.println(i);

        Integer integer = Integer.valueOf("456789");        // convert string into wrapper
        System.out.println(integer);


    }
}
