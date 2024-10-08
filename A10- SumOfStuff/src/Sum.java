import java.util.Scanner; // imports scanner
public class Sum {
 

    Scanner keys = new Scanner(System.in); // creates a scanner

    // takes in the input
    public void setNums(int firstNum,int secondNum, int answer) {
        System.out.print("Enter a number: ");
        firstNum = keys.nextInt();
        keys.nextLine();

        System.out.print("Enter a number: ");
        secondNum = keys.nextInt();
        keys.nextLine();
        sum(firstNum,secondNum,answer);
    }
    // adds the two numbers together
    public void sum(int firstNum,int secondNum, int answer) {
            answer = firstNum+ secondNum;
            print(firstNum,secondNum,answer);
    }
    //outputs the sum
    public void print(int firstNum,int secondNum, int answer) {
            System.out.println("The sum of " + firstNum + "+" + secondNum +" is "+answer+ ".");

    }

}

