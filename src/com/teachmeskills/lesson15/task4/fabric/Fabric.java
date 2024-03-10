package com.teachmeskills.lesson15.task4.fabric;

import java.util.LinkedHashSet;
import java.util.Set;

import com.teachmeskills.lesson15.task4.person.Person;

public class Fabric {
    public static Set<Person> listOfGroup() {

        Set<Person> list = new LinkedHashSet<>();

        Person teacher = new Person("C-27", "teacher", "Andrew", 18);
        Person student1 = new Person("C-27", "student", "Artyom", 18);
        Person student2 = new Person("C-27", "student", "Artem", 18);
        Person student3 = new Person("C-27", "student", "Alina", 18);
        Person student4 = new Person("C-27", "student", "Anastasiya", 18);
        Person student5 = new Person("C-27", "student", "RuslanR", 18);
        Person student6 = new Person("C-27", "student", "RuslanT", 18);
        Person student7 = new Person("C-27", "student", "Eugene", 18);
        Person student8 = new Person("C-27", "student", "Nikita", 18);
        Person student9 = new Person("C-27", "student", "Oleg", 18);
        Person student10 = new Person("C-27", "student", "Ivan", 18);
        Person student11 = new Person("C-27", "student", "Pavel", 18);
        Person student12 = new Person("C-27", "student", "Alex", 18);
        Person student13 = new Person("C-27", "student", "Daniil", 18);
        Person student14 = new Person("C-27", "student", "Aleksey", 18);
        Person student15 = new Person("C-27", "student", "Vladislav", 18);
        Person student16 = new Person("C-27", "student", "Kirill", 18);

        list.add(teacher);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        list.add(student7);
        list.add(student8);
        list.add(student9);
        list.add(student10);
        list.add(student11);
        list.add(student12);
        list.add(student13);
        list.add(student14);
        list.add(student15);
        list.add(student16);

        for (Person str : list) {
            System.out.println(str);
        }
        return list;
    }
}