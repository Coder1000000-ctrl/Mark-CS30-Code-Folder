// Program name: Big Or Small
// Student name: Mark Tucker
// Date: October 3, 2024
// Program Description: Write a program to check 2 parameters.  If a is > b, output "yes".  If b is >a, output "no".  If a is equal to b, return "equals".


public class BigOrSmallRunner {
    public static void main(String[] args) throws Exception {
        BigOrSmall number = new BigOrSmall();
        number.input(); // Takes an integer input
        number.check(); // Checks and outputs if it is bigger or smaller
    }
}
