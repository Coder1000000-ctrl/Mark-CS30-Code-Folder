import java.util.Scanner; // imports scanner

public class CoolNumbers {
    int count; // creates count

    public int input(){ // takes in input
        Scanner keys = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = keys.nextInt();
        keys.close();
        return number;
    }
    public boolean isCoolNum( int checkN ) { // checks if it is a cool number
        if (checkN%6 == 1 && checkN%5 == 1 && checkN%4 == 1 && checkN%3 == 1){
            return true;
        }
        else {
            return false;
        }
    }
    public int countCoolNumbers( int n ){ // checks how many cool numbers there are in a range
        for (int i=n; i >= 6; i--){
            if(isCoolNum(i)){
                count++;
            }
        }
        return count;
    }

}
