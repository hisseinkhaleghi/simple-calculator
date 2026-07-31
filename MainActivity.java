package com.example.simplecalculator;

public class MainActivity {

    public static void main(String[] args) {

        double number1 = 20;
        double number2 = 10;

        double sum = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println("First Number: " + number1);
        System.out.println("Second Number: " + number2);
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
    }
}
