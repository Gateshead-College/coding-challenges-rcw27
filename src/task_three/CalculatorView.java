package task_three;

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


    String operator;
    double num1, num2, result, num3, newResult;


    public static void main(String[] args) {
        CalculatorView cv = new CalculatorView();
        cv.getOperator();
    }


    private void getOperator() {

        System.out.println("Which operation would you like to perform?");
        System.out.println("You are currently able to use: + , - , * , / , pow (power of), sq (Square), sqrt (square root), rec (reciprocal)");
        operator = scn.nextLine();
        if (!requiresSecond()) {
            getSecondNumber();
        } else {
            getFirstNumber();
        }
    }

    private void getFirstNumber() {
        System.out.println("What is the first number you'd like to input?");
        num1 = scn.nextDouble();
    }

    private void getSecondNumber() {
        System.out.println(num1 + " " + operator);
        num2 = scn.nextDouble();
    }

    getResult();


    private void getResult() {
        if (requiresSecond()) {
            System.out.println(num1 + " " + operator + " " + num2);
        } else {
            System.out.println(operator + " of " + num2);
        }
        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println();
                System.out.println(ANSI_PURPLE + "Your answer to " + num1 + " + " + num2 + " = " + result + ANSI_RESET);
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                break;


            case "-":
                result = num1 - num2;
                System.out.println();
                System.out.println(ANSI_PURPLE + "Your answer to " + num1 + " - " + num2 + " = " + result + ANSI_RESET);
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                break;


            case "*":
                result = num1 * num2;
                System.out.println();
                System.out.println(ANSI_PURPLE + "Your answer to " + num1 + " * " + num2 + " = " + result + ANSI_RESET);
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                break;


            case "/":
                result = num1 / num2;
                System.out.println();
                System.out.println(ANSI_PURPLE + "Your answer to " + num1 + " / " + num2 + " = " + result + ANSI_RESET);
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                break;

            case "pow":
                result = Math.pow(num1, num2);
                System.out.println();
                System.out.println(ANSI_PURPLE + "Your answer to " + num1 + " to the power of " + num2 + " = " + result + ANSI_RESET);
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                break;

            case "sqrt":
                result = Math.sqrt(num2);
                System.out.println();
                System.out.println(ANSI_PURPLE + "Your answer to the square root of " + num2 + " = " + result + ANSI_RESET);
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                break;

            case "sq":
                result = (num2 * num2);
                System.out.println();
                System.out.println(ANSI_PURPLE + "Your answer to " + num2 + " squared = " + result + ANSI_RESET);
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                break;

            case "rec":
                result = 1 / num2;
                System.out.println();
                System.out.println(ANSI_PURPLE + "Your answer to the reciprocal of " + num2 + " = " + result + ANSI_RESET);
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                break;


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

    private boolean requiresSecond() {
        switch (operator) {
            case "sqrt":
            case "sq":
            case "rec":
                return false;
        }
        return true;

    }
}







