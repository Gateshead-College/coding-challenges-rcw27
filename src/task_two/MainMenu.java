package task_two;

public class MainMenu {
    public static void main(String[] args) {
        MainMenu mm = new MainMenu();
        mm.printMenu();
    }

    private void printMenu() {
        System.out.println("Welcome to our Tracy Jordan motivational quote generator");
        System.out.println("What quote would you like to see?");
        System.out.println("1 - Shark Week");
        System.out.println("2 - Pigeon");
        System.out.println("3 - Crayons");
        System.out.println("3 - Lizard");
        System.out.println("4 - Exit");
    }
}
