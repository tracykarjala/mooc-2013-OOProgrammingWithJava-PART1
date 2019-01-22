import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        DB observations = new DB();
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        while (true) {
            System.out.print("?");
            String command = reader.nextLine();

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String latinName = reader.nextLine();
                observations.addBird(name, latinName);
            } else if (command.equals("Observation")) {
                System.out.print("What was observed:? ");
                String name = reader.nextLine();
                observations.addObservation(name);
            } else if (command.equals("Statistics")) {
                observations.statistics();
            } else if (command.equals("Show")) {
                System.out.print("What? ");
                String name = reader.nextLine();
                observations.showBird(name);
            } else if (command.equals("Quit")) {
                break;
            } else {
                return;
            }
        }

    }

}
