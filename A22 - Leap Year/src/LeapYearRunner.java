// Program name: Leap Year Calculator
// Student name: Mark Tucker
// Date: Oct. 28, 2024
// Program Description: Calculates if an user input is a leap year

public class LeapYearRunner {
    public static void main(String[] args) throws Exception {
        LeapYear leap = new LeapYear(); // creates abn object called leap

        int year = leap.askYear(); // gets the user's selected year

        boolean yesOrNo = leap.isLeapYear(year); // checks if it is a leap year

        leap.answer(yesOrNo, year); // outputs if it is a leap year
}
}
