package com.kodilla;

public class Calculator {

    public int addition(int a, int b){
        return a + b;
    }
    public int substraction(int c, int d){
        return c - d;
    }
    public static void main (String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.substraction(5, 10);
        int sum = calculator.addition(5, 8);
        System.out.println(result);
        System.out.println(sum);
}
}
