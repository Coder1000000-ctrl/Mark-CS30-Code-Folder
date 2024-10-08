import java.util.Scanner;
public class Sum {
    private int firstNum = 0;
    private int secondNum = 0;
    private int answer = 0;

    Scanner keys = new Scanner(System.in);
    public void setNums() {
        System.out.println("Enter a number");
        firstNum = keys.nextInt();
        keys.nextLine();

        System.out.println("Enter a number");
        secondNum = keys.nextInt();
        keys.nextLine();
    }
    public void sum() {
            answer = firstNum+ secondNum;
    }
    public void print() {
            System.out.println(answer);

    }






}

