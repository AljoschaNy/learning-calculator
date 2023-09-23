package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        userChoice();
    }

    public static void userChoice() {
        System.out.println("Welche Rechenmethode möchten Sie verwenden?");
        System.out.println("Addieren=1, Subtrahieren=2, Multiplizieren=3, Dividieren=4");
        Scanner sc = new Scanner(System.in);
        int userInputForOperation = sc.nextInt();
        boolean correctUserInput = false;

        if(userInputForOperation>0 && userInputForOperation<5) {
            correctUserInput = true;
        }

        while(!correctUserInput) {
            System.out.println("Eingabe inkorrekt! Bitte wähle neu");
            userInputForOperation = sc.nextInt();
            if(userInputForOperation>0 && userInputForOperation<5) {
                correctUserInput = true;
            }
        }

        System.out.println("Bitte gebe Nummmer 1: ");
        double userInputNum1 = sc.nextDouble();

        System.out.println("Bitte gebe Nummmer 2: ");
        double userInputNum2 = sc.nextDouble();
        sc.close();

        double result = getResultOfOperation(userInputForOperation,userInputNum1,userInputNum2);
        System.out.println(result);
    }

    public static double getResultOfOperation(int userInputForOperation, double number1, double number2) {
    if(userInputForOperation == 1){
        return add(number1, number2);
    } else if(userInputForOperation == 2){
        return sub(number1, number2);
    } else if(userInputForOperation == 3){
        return multi(number1, number2);
    } else if(userInputForOperation == 4){
        return divide(number1, number2);
    } else{
        System.out.println("Eingabe inkorrekt!");
        return 0.0;
    }
    }

    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    public static double sub(double number1, double number2) {
        return number1 - number2;
    }

    public static double multi(double number1, double number2) {
        return number1 * number2;
    }

    public static double divide(double number1, double number2) {
        if(number2 == 0){
            return 0;
        }
        return number1/number2;
    }
}