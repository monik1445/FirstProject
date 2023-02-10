package com.company;

public class constructor {

    long id;
    String name;
    int grade;

    public constructor(long id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "constructor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
