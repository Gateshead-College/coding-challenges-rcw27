package task_three;

import task_two.MainMenu;

import java.util.Scanner;

public class CalculatorView {


    public static void main(String[] args) {
        CalculatorView cv = new CalculatorView();
        cv.printMenu();
    }


    private void printMenu() {

        char operator;
        double num1, num2, result;

        //double allows for a decimal point answer - needed for potential divide functions

        Scanner scn = new Scanner(System.in);
        Scanner newScanner = new Scanner(System.in);

        System.out.println("Which operation would you like to perform?");
        System.out.println("You are currently able to use: +, -, * or /");
        operator = scn.next().charAt(0);

        System.out.println("What is the first number you'd like to input?");
        num1 = scn.nextDouble();

        System.out.println("And what is the second number you would you to input?");
        num2 = scn.nextDouble();

        switch (operator) {
            case '+' -> {
                result = num1 + num2;
                System.out.println("Your answer to " + num1 + " + " + num2 + " = " + result);
            }
            case '-' -> {
                result = num1 - num2;
                System.out.println("Your answer to " + num1 + " - " + num2 + " = " + result);
            }
            case '*' -> {
                result = num1 * num2;
                System.out.println("Your answer to " + num1 + " * " + num2 + " = " + result);
            }
            case '/' -> {
                result = num1 / num2;
                System.out.println("Your answer to " + num1 + " / " + num2 + " = " + result);
            }

        }
        System.out.println("What would you like to do now?");
        System.out.println("1 - Another Calculation");
        System.out.println("2 - Exit");

        int answer = Integer.parseInt(newScanner.nextLine());

        if (answer == 1) {
            printMenu();
        }
        else if (answer == 2) {
            System.out.println("Bye");
        }
    }
}



