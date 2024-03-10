package com.teachmeskills.lesson15.task4.person;

public class Person {
    public String groupNumber;
    public String status;
    public String name;
    public int age;

    public Person(String groupNumber, String status, String name, int age) {
        this.groupNumber = String.valueOf(groupNumber);
        this.status = status;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "groupNumber=" + groupNumber +
                ", status='" + status + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
