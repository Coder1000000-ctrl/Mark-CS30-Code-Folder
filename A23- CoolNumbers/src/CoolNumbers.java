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
    public boolean isCoolNum( int checkUserNum ) { // checks if it is a cool number
        if (checkUserNum%6 == 1 && checkUserNum%5 == 1 && checkUserNum%4 == 1 && checkUserNum%3 == 1){
            return true;
        }
        else {
            return false;
        }
    }
    public int countCoolNumbers( int userNum ){ // checks how many cool numbers there are in a range
        for (int i=userNum; i >= 6; i--){
            if(isCoolNum(i)){
                count++;
            }
        }
        return count;
    }

}
