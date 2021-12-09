package task_three;

import task_two.MainMenu;

import java.util.Scanner;

public class CalculatorView {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    Scanner scn = new Scanner(System.in);
    Scanner newScanner = new Scanner(System.in);


    char operator;
    double num1, num2, result, num3, newResult;


    public static void main(String[] args) {
        CalculatorView cv = new CalculatorView();
        cv.getOperator();
    }


    private void getOperator() {

        System.out.println("Which operation would you like to perform?");
        System.out.println("You are currently able to use: +, -, * or /");
        operator = scn.next().charAt(0);

    }

    private void getFirstNumber() {
        System.out.println("What is the first number you'd like to input?");
        num1 = scn.nextDouble();
    }

    private  void getSecondNumber() {
        System.out.println("And what is the second number you would you to input?");
        num2 = scn.nextDouble();
    }

    private void getResult(){

        switch (operator) {
            case '+' -> {
                result = num1 + num2;
                System.out.println();
                System.out.println(ANSI_PURPLE + "Your answer to " + num1 + " + " + num2 + " = " + result + ANSI_RESET);
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
            }

            case '-' -> {
                result = num1 - num2;
                System.out.println();
                System.out.println(ANSI_PURPLE + "Your answer to " + num1 + " - " + num2 + " = " + result + ANSI_RESET);
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
            }

            case '*' -> {
                result = num1 * num2;
                System.out.println();
                System.out.println(ANSI_PURPLE + "Your answer to " + num1 + " * " + num2 + " = " + result + ANSI_RESET);
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();

            }
            case '/' -> {
                result = num1 / num2;
                System.out.println();
                System.out.println(ANSI_PURPLE + "Your answer to " + num1 + " / " + num2 + " = " + result + ANSI_RESET);
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();

            }
        }


        System.out.println("What would you like to do now?");
        System.out.println("1 - Perform a different Calculation");
        System.out.println("2 - Exit");

        int answer = Integer.parseInt(newScanner.nextLine());

        if (answer == 1) {
            getOperator();

        } else if (answer == 2) {
            System.out.println("Bye");
        }

    }
}







