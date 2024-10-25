import java.util.Scanner; // imports a scanner

public class LeapYear {
    Scanner keys = new Scanner(System.in); // creates a scanner

    // takes in user input
    public int askYear(){
        System.out.print("Enter a year: ");
        int selectedYear = keys.nextInt();
        return selectedYear;

    }

    // checks if the year is a leap year
    public boolean isLeapYear(int theYear){
        if ((theYear%4) == 0 && (theYear%100) != 0){
            return true;
        }
        if ((theYear%400) == 0){
            return true;
        }
        else {
            return false;
        }
    }
    // outputs if it is  leap year or not
    public void answer(boolean wasItLeap, int theYear){
        if (wasItLeap == false){
            System.out.println(theYear + " is NOT a leap year.");
        }
        if (wasItLeap == true){
            System.out.println(theYear + " is a leap year.");
        }
    }

    }
    

