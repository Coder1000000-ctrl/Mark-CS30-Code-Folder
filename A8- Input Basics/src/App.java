// Program name: Small Calculator
// Student name: Mark Tucker
// Date: Sept.24, 2024
// Program Description: Does two addition sequences.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Creates the Scanner
        Scanner keys = new Scanner(System.in);

        //Takes in the four numbers
        System.out.print("integer one = ");
        int integerOne = keys.nextInt();
        keys.nextLine();

        System.out.print("integer two = ");
        int integerTwo = keys.nextInt();
        keys.nextLine();

        System.out.print("double one = ");
        double doubleOne = keys.nextDouble();
        keys.nextLine();

        System.out.print("double two = ");
        double doubleTwo = keys.nextDouble();

        //Final Outputs
        System.out.println("intOne + intTwo = " + (integerOne + integerTwo));
        System.out.println("doubleOne + doubleTwo = " + (doubleOne + doubleTwo));
    }

}
