package com.teachmeskills.lesson15.task2.figure;

public class Rectangle extends Figure {
    public String name = "Rectangle";
    public double sideA;
    public double sideB;

    public Rectangle(String name, double sideA, double sideB) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        double area = sideA * sideB;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = (sideA + sideB) * 2;
        return perimeter;
    }

    @Override
    public String getName() {
        return name;
    }
}
