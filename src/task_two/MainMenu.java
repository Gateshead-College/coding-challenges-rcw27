package task_two;

import java.util.Scanner;

public class MainMenu {
    Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        MainMenu mm = new MainMenu();
        mm.printMenu();
    }


    private void printMenu() {
        System.out.println("Welcome to our Tracy Jordan motivational quote generator");
        System.out.println("Which quote would you like to see?");
        System.out.println("1 - Shark Week");
        System.out.println("2 - Pigeon");
        System.out.println("3 - Crayons");
        System.out.println("4 - Lizard");
        System.out.println("5 - Random");
        System.out.println("6 - Exit");
        int input = Integer.parseInt(scn.nextLine());

        switch (input) {
            case 1:
                System.out.println("Live EVERY week like it's Shark Week!!");

                printMenu();

            case 2:
                System.out.println("STOP eating people's old french fries, Pigeon.");
                System.out.println("Have some self respect!!.");
                System.out.println("Don't you know you can fly?!.");

                printMenu();
            case 3:
                System.out.println("Heavy is the head that eats the crayons.");

                printMenu();
            case 4:
                System.out.println("I can't change.");
                System.out.println("I'm like a chameleon...");
                System.out.println("Always a lizard!.");

                printMenu();

            /*case 5:
                switch rand(3){
                    case 1:
                        System.out.println("Live EVERY week like it's Shark Week!!");
                        break;

                    case 2:
                        System.out.println("STOP eating people's old french fries, Pigeon.");
                        System.out.println("Have some self respect!!.");
                        System.out.println("Don't you know you can fly?!.");
                        break;
                    case 3:
                        System.out.println("Heavy is the head that eats the crayons.");
                        break;
                    case 4:
                        System.out.println("I can't change.");
                        System.out.println("I'm like a chameleon...");
                        System.out.println("Always a lizard!.");


            }
                printMenu();*/
            case 6:
                System.out.println("Thanks for coming.");
                System.out.println("Now i'm going to take a nap, see you in 20 hours.");
                System.out.println("ZZZZZZ ZZZZZ ZZZZZ ZZZZZZ");
                System.exit(5);

        }
    }


}
