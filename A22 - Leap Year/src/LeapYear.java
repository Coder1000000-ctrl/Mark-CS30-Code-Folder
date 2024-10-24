import java.util.Scanner;
public class LeapYear {
    Scanner keys = new Scanner(System.in);
    // input
    public int askYear(){
        System.out.print("Enter a year: ");
        int selectedYear = keys.nextInt();
        return selectedYear;

    }

    // divisble by 4 and not by 100
    public boolean four(int theYear){
    int remainder = theYear % 4;
    if (remainder == 0 && (theYear%100) != 0) {
        return true;
    }
    else{
        return false;
    }
}

    // divisble by 400
    public boolean fourHundred(int theYear){
        int remainder = theYear % 400;
        if (remainder == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
}
