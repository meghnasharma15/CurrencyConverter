package src.com.currency.converter;

import java.util.Scanner;

public class CurrencyConverter {
    static double inrToUsdRate = 0.012;
    static double inrToEurRate = 0.011;
    static double inrToGbpRate = 0.0089;

    static double usdToInrRate = 83.69;
    static double eurToInrRate = 93.42;
    static double gbpToInrRate = 112.05;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueConversion = true;

        while (continueConversion) {
            System.out.println("Welcome to the Currency Converter!");
            System.out.println("Choose the conversion type:");
            System.out.println("1. INR to USD");
            System.out.println("2. INR to EUR");
            System.out.println("3. INR to GBP");
            System.out.println("4. USD to INR");
            System.out.println("5. EUR to INR");
            System.out.println("6. GBP to INR");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid choice. Please select a valid option (1-6).");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();

            if (choice < 1 || choice > 6) {
                System.out.println("Invalid choice. Please select a valid option (1-6).");
                continue;
            }

            System.out.println("Enter the amount you want to convert:");

            if (!sc.hasNextDouble()) {
                System.out.println("Invalid amount. Please enter a valid number.");
                sc.next();
                continue;
            }

            double amount = sc.nextDouble();
            double convertedAmount = 0;

            switch (choice) {
                case 1:
                    convertedAmount = inrToUsd(amount);
                    System.out.printf("%.4f INR = %.4f USD\n", amount, convertedAmount);
                    break;
                case 2:
                    convertedAmount = inrToEur(amount);
                    System.out.printf("%.4f INR = %.4f EUR\n", amount, convertedAmount);
                    break;
                case 3:
                    convertedAmount = inrToGbp(amount);
                    System.out.printf("%.4f INR = %.4f GBP\n", amount, convertedAmount);
                    break;
                case 4:
                    convertedAmount = usdToInr(amount);
                    System.out.printf("%.4f USD = %.4f INR\n", amount, convertedAmount);
                    break;
                case 5:
                    convertedAmount = eurToInr(amount);
                    System.out.printf("%.4f EUR = %.4f INR\n", amount, convertedAmount);
                    break;
                case 6:
                    convertedAmount = gbpToInr(amount);
                    System.out.printf("%.4f GBP = %.4f INR\n", amount, convertedAmount);
                    break;
            }

            System.out.println("Do you want to convert again? (yes/no)");
            String response = sc.next();

            if (response.equalsIgnoreCase("no")) {
                continueConversion = false;
            }
        }

        sc.close();
        System.out.println("Thank you for using the Currency Converter!");
    }

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