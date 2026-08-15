package com.consumer.consumer_service.controller;

import java.math.BigInteger;
import java.util.Scanner;

/*
 Simplified Factorial.java
 - Preserves original behavior and user-facing messages.
 - Uses try-with-resources to handle Scanner closure (removes explicit finally).
 - Keeps the same factorial implementation and input validation flow.
 - Removes an extra local variable for the result when printing (prints directly).
 - Keeps comments concise for readability.
*/
public class Factorial {

    /**
     * Compute factorial using BigInteger to support large results.
     * @param n non-negative integer
     * @return n! as BigInteger
     */
    public static BigInteger factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a non-negative integer: ");
            String input = scanner.nextLine();

            if (input == null || input.trim().isEmpty()) {
                System.out.println("No input provided. Exiting.");
                return;
            }

            int n;
            try {
                n = Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid non-negative integer.");
                return;
            }

            if (n < 0) {
                System.out.println("Please enter a non-negative integer. Factorial is undefined for negative numbers.");
                return;
            }

            // Compute and print the factorial (behavior unchanged).
            System.out.println(n + "! = " + factorial(n));
        }
    }
}