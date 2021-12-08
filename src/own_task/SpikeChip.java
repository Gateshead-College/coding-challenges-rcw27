package own_task;

import java.util.Scanner;

public class SpikeChip {
    Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        SpikeChip sc = new SpikeChip();
        sc.identifyTarget();
    }
    private void identifyTarget() {
        System.out.println("What kind of creature is your target?");
        String creature = scn.nextLine();


        switch(creature.toLowerCase()){

            case "vampire":
                createVampire();
                break;

            case "demon":
                createDemon();
                break;

            case "human":
                createHuman();
                break;

            default:
                System.out.println("We're not sure what that creature is yet");
                System.out.println("Better do more research before we attack");
        }
    }

    private void createHuman() {
    }

    private void createDemon() {
    }

    private void createVampire() {
    }


    //get input as to what you want to kill
    //is it human?
    //if human than zaaaaaap
    //if not human then allow
    //
}
