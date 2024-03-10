package com.teachmeskills.lesson15.task2.run;

import com.teachmeskills.lesson15.task2.figure.Circle;
import com.teachmeskills.lesson15.task2.figure.Figure;
import com.teachmeskills.lesson15.task2.figure.Rectangle;
import com.teachmeskills.lesson15.task2.figure.Triangle;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Circle cr1 = new Circle("Circle1", 20);
        Circle cr2 = new Circle("Circle2", 5);
        Rectangle rcgl1 = new Rectangle("Rectangle", 3, 4);
        Triangle trgl1 = new Triangle("Triangle1", 12, 9, 7);
        Triangle trgl2 = new Triangle("Triangle2", 3, 4, 5);

        ArrayList<Figure> array = new ArrayList<>();
        array.add((cr1));
        array.add((cr2));
        array.add((rcgl1));
        array.add((trgl1));
        array.add((trgl2));
        for (Figure figures : array) {
            System.out.println(figures.getName() + "'s perimeter is " + figures.getPerimeter());
        }
    }
}
