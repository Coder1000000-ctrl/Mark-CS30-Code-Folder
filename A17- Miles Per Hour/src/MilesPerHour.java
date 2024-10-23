import java.util.Scanner;
public class MilesPerHour {
    Scanner keys = new Scanner(System.in);

    public int ask(String asking) {
        System.out.print("Enter the " + asking + ": ");
        int answer = keys. nextInt();
        return answer;
    }
   

}
