package com.codersbay;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input " + numbers.length + " int values!");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please input int value #" + (i + 1));
            numbers[i] = scanner.nextInt();

        }
        System.out.println("Thank you!");
        System.out.println("You have entered the following numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("The largest number of those entered is....");

        int biggestNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > biggestNumber) {
                biggestNumber = numbers[i];
            }
        }
        System.out.println(biggestNumber);


    }

}
