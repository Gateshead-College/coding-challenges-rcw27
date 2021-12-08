package task_one;


import java.util.Scanner;

public class AgeChecker {

    Scanner scn = new Scanner(System.in);

    public static void main(String [] args){
        AgeChecker a = new AgeChecker();
        a.getAgeChecker();


    }

    private void getAgeChecker() {
        System.out.println("How old are you?");
        int age = Integer.parseInt(scn.nextLine());
        String word = "age";
        if(age <=16){
            System.out.println("You are still so young!");
        }
        else{
            System.out.println("You are old!");
        }


    }


}
