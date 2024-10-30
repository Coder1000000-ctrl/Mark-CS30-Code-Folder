import java.util.Scanner;


public class CoolNumbersRunner {
    public static void main(String[] args) throws Exception {
        CoolNumbers cool = new CoolNumbers();
        Scanner keys = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = keys.nextInt();
        int total = cool.countCoolNumbers(number);
        keys.close();
        System.out.println("There are " + total + " cool numbers in 6-" + number + ".");



        
    }
}
