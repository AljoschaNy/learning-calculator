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

        System.out.println("Bitte gebe Nummmer 1: ");
        double userInputNum1 = sc.nextDouble();

        System.out.println("Bitte gebe Nummmer 2: ");
        double userInputNum2 = sc.nextDouble();
        sc.close();
        System.out.println("User input operation = " + userInputForOperation);
        System.out.println("User input num1 = " + userInputNum1);
        System.out.println("User inout num2 = " + userInputNum2);

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