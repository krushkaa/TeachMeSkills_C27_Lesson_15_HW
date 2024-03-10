package com.teachmeskills.lesson15.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Please enter your numbers. To finish the program type 'exit'.");
        try {
            while (true) {
                String number = scanner.nextLine();
                if (number.matches("^-?[0-9]+$")) {
                    int a = Integer.parseInt(number);
                    arrayList.add(a);
                } else if (number.toLowerCase().equals("exit")) {
                    break;
                } else {
                    System.out.println("Wrong symbol. Please enter only integer numbers or 'exit'");
                }
            }
            scanner.close();
            System.out.println(arrayList);
            System.out.println("Even numbers from your array: ");
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) % 2 == 0 && arrayList.get(i) != 0) {
                    System.out.print(arrayList.get(i) + " ");
                }
            }
        } catch (NumberFormatException exception) {
            System.out.println("Wrong symbol. Please enter only integer numbers or 'exit'");
        }
    }
}

