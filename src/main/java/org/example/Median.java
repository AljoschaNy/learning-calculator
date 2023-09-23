package org.example;

import java.util.Scanner;

public class Median {
    public static void main(String[] args){
        int userArrayLength = getArrayLength();
        int[] userArray = getArray(userArrayLength);
        System.out.println(userArray[1]);
    }

    public static int getArrayLength(){
        System.out.println("Wie viele Zahlen möchtest du eingeben?");
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        sc.close();
        return arrayLength;
    }

    public static int[] getArray(int arrayLength){
        int[] numbersForMedian = new int[arrayLength];
        System.out.println("Gib bitte die Zahlen ein!");
        //Scanner sc = new Scanner(System.in);
       // for(int i = 0; i < arrayLength; i++){
            System.out.println("Zahl " + (1+1));
            Scanner sc2 = new Scanner(System.in);
            int num = sc2.nextInt();
            numbersForMedian[0] = num;
            sc2.close();
        //}
        return numbersForMedian;
    }
}
