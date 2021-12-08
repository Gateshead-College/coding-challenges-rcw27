package task_four;

import java.util.Scanner;

public class DataEntry {
    Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        DataEntry cd = new DataEntry();
        cd.getData();
    }
    private void getData(){
        System.out.println("What would you like to do?");
        String query = scn.nextLine();

        private void printMenu() {
            System.out.println("Welcome to our database system");
            System.out.println("What would you like to do?");
            System.out.println("1 - Enter details for new employee");
            System.out.println("2 - View a list of the current employees");
            System.out.println("3 - Edit the details of existing employee");
            System.out.println("4 - Delete an existing employee");
            System.out.println("5 - Exit");

            int input = Integer.parseInt(scn.nextLine());

        switch (query){

            case

        }



        private void createEmployee() {
            System.out.println("What is their First Name?");
            String firstName = scn.nextLine();
            System.out.println("What is their Second Name?");
            String secondName = scn.nextLine();
            System.out.println("What day were they born on?");
            int day = Integer.parseInt(scn.nextLine());
            System.out.println("Which month were they born in");
            String month = scn.nextLine();
            System.out.println("What year were they born in?");
            int year = Integer.parseInt(scn.nextLine());
            System.out.println("Which department will they be assigned to?");
            String department = scn.nextLine();
            System.out.println("Compiling employee details now...");
            System.out.println("Please hold...");
            System.out.println("...nearly there...");
            Employee newEmployee = new Employee(firstName, secondName, day, month, year, department);
        }
    }
}
