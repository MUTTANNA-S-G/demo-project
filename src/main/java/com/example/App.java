package com.example;

public class App {

    // ✅ ADD THIS METHOD
    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        App obj = new App();
        System.out.println("Multiplication: " + obj.multiply(2, 3));
    }
}
