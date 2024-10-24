import java.util.Scanner; // imports scanner

public class MilesPerHour {
    // creates a scanner
    Scanner keys = new Scanner(System.in);

    // takes in input
    public double ask(String asking) {
        System.out.print("Enter the " + asking + ": ");
        double answer = keys.nextDouble();
        return answer;
    }
    // calculates time
    public double minutes(double time) {
        time = time / 60;
        return time;
    }
    // calculates rate
    public double milesAnHour(double far, double totalTime){
        double rate = far / totalTime;
        return rate;
    }
   

}
