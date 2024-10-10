// Program name: Farenheit to Celsius
// Student name: Mark Tucker
// Date: October 10, 2024
// Program Description: Converts Farenheit to Celsius

import java.util.Scanner; // imports a scanner

public class FarenheitRunner {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in); // creates a scanner
        double input; // creates variable called input
        Farenheit converter = new Farenheit(); // imports methods

        System.out.print("What temperature in farenheit do you want to convert to celsius: ");
        input = keys.nextDouble(); // takes in input

        // calculates and outputs the conversion
        converter. calculate(input);
        converter. output(input);
    }
}
