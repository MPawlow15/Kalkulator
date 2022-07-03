package com.kalkulator;

public class Application {

    public static void main(String[] args) {
        Calculator simpleCalculator = new Calculator();

        double result = simpleCalculator.substractAFromB(6.1, 4.9);

        System.out.println(String.format("%.2f", result));
    }

}
