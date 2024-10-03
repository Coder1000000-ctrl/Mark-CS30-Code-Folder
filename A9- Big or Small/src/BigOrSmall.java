import java.util.Scanner; // Imports scanner

public class BigOrSmall {

    private int firstInt; // Variable for first integer
    private int secondInt; //Variable for second integer

    //Creates a scanner
    private Scanner keys = new Scanner(System.in);
    //Takes an imput
    public void input() {
        System.out.print("Enter a number:");
        firstInt = keys.nextInt();
        keys.nextLine();
        
        System.out.print("Enter another number:");
        secondInt = keys.nextInt();
        keys.nextLine();
    }
    // Checks in number 1 is greater, smaller, or equal to number 2 and outputs the answer
    public void check() {
        if (firstInt > secondInt){
            System.out.println("Yes, "+ firstInt+ " is greater than " + secondInt +".");
        }
        else if (firstInt < secondInt){
            System.out.println("No, " + firstInt+ " is smaller than " + secondInt +".");
        }
        else if (firstInt == secondInt){
            System.out.println(firstInt+ " is equal to " + secondInt +".");
        }
    }
}
