// Program name: CoolNumbers
// Student name: Mark Tucker
// Date: October 31, 2024
// Program Description: Checks how many numbers are divisible by 3,4,5, and 6 in a range.

public class CoolNumbersRunner {
    public static void main(String[] args) throws Exception {
        CoolNumbers cool = new CoolNumbers(); // creates a new object called cool

        int userNumber = cool.input(); // takes in input
        int total = cool.countCoolNumbers(userNumber); // calculates the total numbers divisble by 3,4,5, and 6
        System.out.println("There are " + total + " cool numbers between 6 - " + userNumber + "."); // outputs the total



        
    }
}
