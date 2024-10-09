import java.util.Scanner; // imports scanner
public class Sum {
 

    private Scanner keys = new Scanner(System.in); // creates a scanner

    // defines variables
    private int firstNum;
    private int secondNum;
    private int answer;

    // takes in the input
    public void setNums() {
        System.out.print("Enter a number: ");
        firstNum = keys.nextInt();
        keys.nextLine();

        System.out.print("Enter a number: ");
        secondNum = keys.nextInt();
        keys.nextLine();
    }
    // adds the two numbers together
    public void sum() {
        answer = firstNum+ secondNum;     
    }
    
    // outputs the sum
    public void print() {
            System.out.println("The sum of " + firstNum + "+" + secondNum + " is " + answer + ".");
    }
}