package com.currency.converter;

import java.util.Scanner;

public class CurrencyConverter {
    // Conversion rates
    static double inrToUsdRate = 0.012;  // Example rate: 1 INR = 0.012 USD
    static double inrToEurRate = 0.011;  // Example rate: 1 INR = 0.011 EUR
    static double inrToGbpRate = 0.0096; // Example rate: 1 INR = 0.0096 GBP

    static double usdToInrRate = 82.0;   // Example rate: 1 USD = 82 INR
    static double eurToInrRate = 90.0;   // Example rate: 1 EUR = 90 INR
    static double gbpToInrRate = 104.0;  // Example rate: 1 GBP = 104 INR

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueConversion = true; // Variable to control the loop

        while (continueConversion) { // Loop to allow multiple conversions
            // Welcome message
            System.out.println("Welcome to the Currency Converter!");
            System.out.println("Choose the conversion type:");
            System.out.println("1. INR to USD");
            System.out.println("2. INR to EUR");
            System.out.println("3. INR to GBP");
            System.out.println("4. USD to INR");
            System.out.println("5. EUR to INR");
            System.out.println("6. GBP to INR");

            int choice = sc.nextInt();

            // Validate user choice
            if (choice < 1 || choice > 6) {
                System.out.println("Invalid choice. Please select a valid option (1-6).");
                continue; // Skip to the next iteration of the loop
            }

            System.out.println("Enter the amount you want to convert:");
            double amount = sc.nextDouble();

            double convertedAmount = 0;
            switch (choice) {
                case 1:
                    convertedAmount = inrToUsd(amount);
                    System.out.printf("%.2f INR = %.2f USD\n", amount, convertedAmount);
                    break;
                case 2:
                    convertedAmount = inrToEur(amount);
                    System.out.printf("%.2f INR = %.2f EUR\n", amount, convertedAmount);
                    break;
                case 3:
                    convertedAmount = inrToGbp(amount);
                    System.out.printf("%.2f INR = %.2f GBP\n", amount, convertedAmount);
                    break;
                case 4:
                    convertedAmount = usdToInr(amount);
                    System.out.printf("%.2f USD = %.2f INR\n", amount, convertedAmount);
                    break;
                case 5:
                    convertedAmount = eurToInr(amount);
                    System.out.printf("%.2f EUR = %.2f INR\n", amount, convertedAmount);
                    break;
                case 6:
                    convertedAmount = gbpToInr(amount);
                    System.out.printf("%.2f GBP = %.2f INR\n", amount, convertedAmount);
                    break;
            }

            // Ask user if they want to convert again
            System.out.println("Do you want to convert again? (yes/no)");
            String response = sc.next();
            if (response.equalsIgnoreCase("no")) {
                continueConversion = false; // Exit loop if user chooses 'no'
            }
        }

        // Close the scanner
        sc.close();
        System.out.println("Thank you for using the Currency Converter!");
    }

    // Conversion methods
    public static double inrToUsd(double inr) {
        return inr * inrToUsdRate;
    }

    public static double inrToEur(double inr) {
        return inr * inrToEurRate;
    }

    public static double inrToGbp(double inr) {
        return inr * inrToGbpRate;
    }

    public static double usdToInr(double usd) {
        return usd * usdToInrRate;
    }

    public static double eurToInr(double eur) {
        return eur * eurToInrRate;
    }

    public static double gbpToInr(double gbp) {
        return gbp * gbpToInrRate;
    }
}