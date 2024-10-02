import java.util.Scanner;
public class BigOrSmall {

    private int firstInt;
    private int secondInt;

    private Scanner keys = new Scanner(System.in);
    public void input() {
        System.out.print("Enter a number:");
        firstInt = keys.nextInt();
        keys.nextLine();
        
        System.out.print("Enter another number:");
        secondInt = keys.nextInt();
        keys.nextLine();
    }
    public void check() {
        if (firstInt > secondInt){
            System.out.println("yes");
        }
        else if (firstInt < secondInt){
            System.out.println("no");
        }
        else if (firstInt == secondInt){
            System.out.println("equals");
        }
    }




}
