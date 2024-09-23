//Imports the Scanner Class into the program
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = keys.nextInt();
        keys.nextLine();
        System.out.println("You chose " + num);

        System.out.print("What is your name? ");
        String name = keys.nextLine();
        System.out.println("You are " + name);
    }
}