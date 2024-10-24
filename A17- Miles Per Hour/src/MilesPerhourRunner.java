// Program name: Miles Per Hour
// Student name: MArk Tucker
// Date: OCtober 24, 2024
// Program Description: Calculates the miles per hour from a time and distance.

public class MilesPerhourRunner {
    public static void main(String[] args) throws Exception {
        // creates a new object called miles
        MilesPerHour miles = new MilesPerHour();
        // creates variables and gets input
        double distance = miles.ask("Distance");
        double hours = miles.ask("Hours");
        double minute = miles.ask("Minutes");

        double newTime = hours + miles.minutes(minute); // calculates the total time in hours
        double speed = miles.milesAnHour(distance, newTime); // calculates the speed

        // outputs the rate, distance, and time rounded to a whole number.
        System.out.println(Math.round(distance) + " miles in "+ Math.round(hours) + " hours and " + Math.round(minute) + " minutes = " + Math.round(speed) + " MPH.");
    }
}
