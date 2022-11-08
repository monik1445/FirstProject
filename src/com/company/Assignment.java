package com.company;

public class Assignment {
    public static void main(String[] args) {
        sum();//add methods
    }

    public static void sum() {
        int sum=0;
        for(int i =1;i<=10;++i){
            sum=sum+i;
        }
        System.out.println("The sum of natural numbers upto 10 is:"+sum);
        System.out.println("vivek changes");
    }
}
