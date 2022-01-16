package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter count");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] returnArray = readIntegers(count);
        int minValue = findMin(returnArray);
        System.out.println("Min value is: "+minValue);
    }

    private static int[] readIntegers(int count){

        int[] array = new int[count];

        for(int i = 0; i < array.length; i++){
            System.out.println("Enter a number");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin (int[] array){

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < min; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

}
