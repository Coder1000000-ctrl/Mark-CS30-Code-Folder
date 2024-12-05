import java.util.Arrays; // imports arrays

public class Array {
    // initializes array
     int[] arrayList = null;
        public Array(int[] array) {
            arrayList = array;
        }
    
        // counts the sum of s[ots]
        public  int sum(int start, int stop){
            int sum = 0;
            for (int i = start; i<=stop;i++){
                sum = sum + arrayList[i];

        }
        return sum;
        // searches for a number
    }
    public  int countNumbers(int search, int[] searchArray) {
        int count = 0;
        for (int i= 0; i< searchArray.length; i++) {
            if (searchArray[i] == search) {
                count++;
            }
        }
        return count;
    }
    // removes a number
    public  void remove(int takeAway){
        int[] newArray = null;
        int length = arrayList.length - countNumbers(takeAway, arrayList);
        newArray = new int[length];
        int check = 0;
        int i =0;
            while (i<=arrayList.length-1){ // loops through the array and takes the muber if it is not equal to the one that the user wants to remove
            if (arrayList[i] != takeAway){
            newArray[check] = arrayList[i];
            check++;
            i++;
            }
            else {
                i++;
            }
        
        }
        System.out.println("\n" + Arrays.toString(newArray));
        System.out.println("Number of " + takeAway+ "'s = " + countNumbers(takeAway, newArray));
    }

    
}

