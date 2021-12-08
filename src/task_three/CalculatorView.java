package task_three;

import java.util.Scanner;

public class CalculatorView {

    public static void main(String[] args) {

        char operator;
        double num1, num2, result;

        //double allows for a decimal point answer - needed for potential divide functions

        Scanner scn = new Scanner(System.in);

        System.out.println("What is the first number you'd like to input?");
        num1 = scn.nextDouble();

        System.out.println("Which operation would you like to perform?");
        System.out.println("You are currently able to use: +, -, * or /");
        operator = scn.next().charAt(0);

        System.out.println("And what is the second number you would you to input?");
        num2 = scn.nextDouble();


        }
        //add in function to work out answer based on the operator input
    }
}
