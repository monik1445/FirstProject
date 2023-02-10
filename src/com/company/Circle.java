package com.company;

public class Circle {

    double radius;

    public void main(String[] args) {
        Circle obj = new Circle();
        System.out.println(obj.area(5.0));
        System.out.println(obj.circumference(5.0));

    }

    public double area(double radius) {
        this.radius = radius;
        double area =  3.14 * radius * radius;
        return area;
    }
    public double circumference(double radius) {
        this.radius = radius;
        double circumference = 2 * 3.14 * radius;
        return circumference;
    }

}


