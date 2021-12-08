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
        if(age <16){
            System.out.println("You are so wittle and cute XD!");
        }
        if(age>=16 && age <20){
            System.out.println("You are still young, don't wish it away Padawan.");
        }
        if(age>=20 && age <25){
            System.out.println("You can now eat whatever you want for breakfast, you're in charge!");
        }
        if(age>=25 && age <30){
            System.out.println("It's really not THAT scary being 30 but maybe start using an eye cream.");
        }
        if(age>=30 && age <40){
            System.out.println("You are who you are now, well done for discovering that. You're awesome!");
        }
        if(age>=40 && age <50){
            System.out.println("About time for a mid-life crisis? Yeah, go buy something crazy...like a lion or a sports car. Or...A LION IN A SPORTS CAR!!!");
        }if(age>=50){
            System.out.println("AND...relax. Just do what you want now mate. You earned it.");        }



    }


}
