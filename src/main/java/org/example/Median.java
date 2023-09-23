package org.example;

import java.util.Scanner;

public class Median {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int userArrayLength = getArrayLength(sc);
        int[] userArray = getArray(userArrayLength,sc);
        sc.close();
        System.out.println(userArray[1]);
        System.out.println(userArray[2]);
        System.out.println(userArray[3]);
    }

    public static int getArrayLength(Scanner scTest){
        System.out.println("Wie viele Zahlen möchtest du eingeben?");
        int arrayLength = scTest.nextInt();
        return arrayLength;
    }

    public static int[] getArray(int arrayLength,Scanner scTest){
        int[] numbersForMedian = new int[arrayLength];
        System.out.println("Gib bitte die Zahlen ein!");

        for(int i = 0; i < arrayLength; i++){
            System.out.println("Zahl " + (i+1));
            numbersForMedian[i] = scTest.nextInt();
        }
        return numbersForMedian;
    }
}
