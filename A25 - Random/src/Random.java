// Program name: Random
// Student name: Mark Tucker
// Date: Nuvember 13, 2024
// Program Description: picks two random numbers and compares them, then outputs the bigger and smaller, repeats 10 times


public class Random {
    public static void main(String[] args) throws Exception {
        RandomMethods rand = new RandomMethods(); // imports a new object called rand

        // picks two random numbers and compares them, then outputs the bigger and smaller, repeats 10 times
        for (int i = 1; i <=10; i++){
        rand.calulateAndOutput();
        System.out.println();
        }
    }
}
