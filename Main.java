package CalculatorProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner question = new Scanner(System.in);

        try {
            System.out.println("Number 1: ");
            int myNumber = question.nextInt();

            System.out.println("Number 2: ");
            int secondNumber = question.nextInt();

            System.out.println("Operation (+, -, *, /): ");
            String symbol = question.next();

            if (symbol.equals("+")) {
                System.out.println(myNumber + secondNumber);
            } else if (symbol.equals("-")) {
                System.out.println(myNumber - secondNumber);
            } else if (symbol.equals("*")) {
                System.out.println(myNumber * secondNumber);
            } else if (symbol.equals("/")) {
                if (secondNumber != 0) {
                    System.out.println(myNumber / secondNumber);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
            } else {
                System.out.println("Error: Invalid operation.");
            }
        } finally {
            question.close();
        }
    }
}
