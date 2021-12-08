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

        System.out.println("Firstly, which operation would you like to perform?");
        System.out.println("You are currently able to use: +, -, * or /");
        operator = scn.next().charAt(0);

        System.out.println("What is the first number you'd like to input?");
        num1 = scn.nextDouble();


        System.out.println("And what is the second number you would you to input?");
        num2 = scn.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Your answer to " + num1 + " + " + num2 + " = " + result);
                //System.out.println("Please try another sum or press '0' to exit");
                printMenu();
                case '-':
                result = num1 - num2;
                System.out.println("Your answer to " + num1 + " - " + num2 + " = " + result);
                //System.out.println("Please try another sum or press '0' to exit");
                printMenu();
                case '*':
                result = num1 * num2;
                System.out.println("Your answer to " + num1 + " * " + num2 + " = " + result);
                //System.out.println("Please try another sum or press '0' to exit");
                printMenu();
                case '/':
                result = num1 / num2;
                System.out.println("Your answer to " + num1 + " / " + num2 + " = " + result);
               // System.out.println("Please try another sum or press '0' to exit");
                printMenu();

            default:
                System.exit(0);


        }

    }
    //add in function to work out answer based on the operator the user has input
}

