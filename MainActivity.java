package com.example.simplecalculator;

public class MainActivity {

    public static void main(String[] args) {

        double firstNumber = 20;
        double secondNumber = 5;

        double addition = firstNumber + secondNumber;
        double subtraction = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;

        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);

        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);

        if (secondNumber != 0) {
            double division = firstNumber / secondNumber;
            System.out.println("Division = " + division);
        } else {
            System.out.println("Cannot divide by zero.");
        }

    }

}
