package com.teachmeskills.lesson15.task3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter collection size: ");
            int collectionSize = scanner.nextInt();
            ArrayList<Integer> randomNumberCollection = new ArrayList<>();

            if (collectionSize <= 0) {
                System.out.println("The size can't be negative. Please try again.");
            } else {
                for (int i = 0; i < collectionSize; i++) {
                    int randomNumber = (int) (Math.random() * 10);
                    randomNumberCollection.add(randomNumber);
                }
                int result = 0;
                for (Integer i : randomNumberCollection) {
                    result += i;
                }
                scanner.close();
                System.out.println("The arithmetic average of array " + randomNumberCollection + " equals: " + result / collectionSize);
            }
        } catch (InputMismatchException e){
            System.out.println("Wrong data. Please enter numbers.");
        }
    }
}

