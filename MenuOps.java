// Uses both If Else and Switch

import java.util.Scanner;

public class MenuOps {
    public static void main(String[] args) {
        // For Scanner
        Scanner scanner = new Scanner(System.in);
        scanner.close();

        // Main Program
        System.out.println("Enter Number 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter Number 2: ");
        int number2 = scanner.nextInt();
        System.out.printf("So you have entered %d and %d. Select operation to perform now: ", number1, number2).println();
        System.out.println("1 - Add\n2 - Subtract\n3 - Multiply\n4 - Divide");
        int choice = scanner.nextInt();

        // According to choice perform operations
        // Comment one of the lines below
        mainOperationsWithIfElse(number1, number2, choice);
        mainOperationsWithSwitch(number1, number2, choice);
            
    }

    private static void mainOperationsWithSwitch(int number1, int number2, int choice) {
        switch (choice) {
            case 1 :
                System.out.println("Result: " + (number1 + number2));
                break;
            case 2 :
                System.out.println("Result: " + (number1 - number2));
                break;
            case 3 :
                System.out.println("Result: " + (number1 * number2));
                break;
            case 4 :
                System.out.println("Result: " + (number1 / number2));
                break;
            default :
                System.out.println("Oops! Invalid input. Try again");
                break;

        }
    }

    private static void mainOperationsWithIfElse(int number1, int number2, int choice) {
        if (choice==1) {
            System.out.println("Result: " + (number1 + number2));
        } 
        else if (choice==2) {
            System.out.println("Result: " + (number1 - number2));
        }
        else if (choice==3) {
            System.out.println("Result: " + (number1 * number2));
        }
        else if (choice==4) {
            System.out.println("Result: " + (number1 / number2));
        }
        else {
            System.out.println("Oops! Invalid input. Try again");
        }
    }
}
