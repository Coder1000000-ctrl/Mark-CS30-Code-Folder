// Program name: Loop Stats
// Student name: Mark Tucker
// Date: November 1, 2024
// Program Description: Calcualtes the total, even, and odd numbers in a range.

public class LoopStatsRunner {
    public static void main(String[] args) throws Exception {
        LoopStats loop = new LoopStats(); // Creates a new object called loop

        // gets input and output
        int beginning = loop.input("starting");
        int ending = loop.input("ending");

        // calculates total, even, and odd
        int total = loop.total(beginning, ending);
        int even = loop.even(beginning, ending);
        int odd = loop.odd(beginning, ending);

        // outputs the total, even, and odd
        System.out.println("The total of is " + total);
        System.out.println("The even count is " + even);
        System.out.println("The odd count is " + odd);
    }
}
