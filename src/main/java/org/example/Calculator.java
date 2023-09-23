package org.example;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(0/8);
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