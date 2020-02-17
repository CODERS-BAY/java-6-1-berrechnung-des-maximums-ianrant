package com.codersbay;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[0];
        Scanner scanner = new Scanner(System.in);

        /*
        TODO: The following while-loop is stopped once a upper-case or lower-case "q" is entered
        TODO: within the loop, there is the int variable newNumber and the int array numberArray
        TODO: they are re-established with every iteration of the loop
        TODO: numberArray has the length of numbers (see above) plus 1
        TODO: the for-loop within the while-loop then copies the values of numbers' indexes to
        TODO: the corresponding indexes in numberArray
        TODO: after the for-loop the latest input from the Scanner is saved in the last/highest index of numberArray
        TODO: then numbers is overwritten with the values of numberArray

         */

        System.out.println("Please input some int values!");
        while (!scanner.hasNext("q") && !scanner.hasNext("Q")) {

            int newNumber = scanner.nextInt();
            int[] numberArray = new int[numbers.length + 1];
            for (int i = 0; i < numbers.length; i++) {
                numberArray[i] = numbers[i];
            }
            numberArray[numbers.length] = newNumber;
            numbers = numberArray;

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
