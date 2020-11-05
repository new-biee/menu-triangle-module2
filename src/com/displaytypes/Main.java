package com.displaytypes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int choice;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle: ");
            System.out.println("2. Print the rectangle at bottom-left: ");
            System.out.println("3. Print the rectangle at bottom-right: ");
            System.out.println("4. Print the rectangle at top-left:");
            System.out.println("5. Print the rectangle at top-right:");
            System.out.println("6. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter width: ");
                    int width = scanner.nextInt();
                    System.out.print("Enter height: ");
                    int height = scanner.nextInt();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.print("Enter height: ");
                    height = scanner.nextInt();

                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("Enter height: ");
                    height = scanner.nextInt();

                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height - i; j++) {
                            System.out.print("  ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.print("Enter rows: ");
                    height = scanner.nextInt();

                    for (int i = height; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.print("Enter rows: ");
                    height = scanner.nextInt();

                    for (int i = height; i >= 1; i--) {
                        for (int j = height; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 6:
                    System.out.print("Enter rows: ");
                    height = scanner.nextInt();

                    for (int i = 0; i < height; i++) {
                        for (int j = height - i; j > 1; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
