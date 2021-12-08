package own_task;

import java.util.Scanner;

public class SpikeChip {
    Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        SpikeChip sc = new SpikeChip();
        sc.identifyTarget();
    }

    //get input as to what you want to kill
    private void identifyTarget() {
        System.out.println("This is the initiative chip inside your head");
        System.out.println("What kind of creature is your target?");
        String creature = scn.nextLine();

        //is it human?
        switch(creature.toLowerCase()){

            case "vampire":
                System.out.println("Oh yeah, you can definitely attack a vampire");
                System.out.println("Stake in the heart works a treat!");
                break;

            case "demon":
                System.out.println("Oh yeah, you can definitely attack a demon");
                System.out.println("What's going to be the best way to get this one though...");
                System.out.println("Meh...just start hitting it hard...you'll work it out");
                break;


            case "human":
                System.out.println("ZAAAAAAAAAAAAAAAAAAAAPPP!!");
                System.out.println("Come on! You know you can't hurt a human");
                break;

            default:
                System.out.println("We're not sure what that creature is yet");
                System.out.println("Better do more research before we attack");
        }
    }









}
