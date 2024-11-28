import java.util.Scanner;
import java.util.Arrays;


public class ArrayRunner {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        int [] list = null;
        System.out.print("How many numbers do you want to type: ");
        int spots = keys.nextInt();
        list = new int[spots];

        for (int i = 0; i<spots; i++){
            System.out.print("\nChoose a number: ");
            list[i] = keys.nextInt();
        }
        Array method = new Array(list);
        System.out.println(Arrays.toString(list));

        // sum of spots
        for (int i = 1; i<=2; i++){
            System.out.println("\nChoose a starting number: ");
            int begin =  keys.nextInt();
            System.out.println("Choose a ending number: ");
            int end =  keys.nextInt();
            System.out.print("The total of numbers " + begin +" - " + end + " is " + method.sum(begin,end));
    }
    for (int i = 1; i<= 3; i++ ){
    System.out.println("\nWhat number do you want to search for:");
    int number = keys.nextInt();
    System.out.println("The total amount of " + number + "'s in the array is " + method.countNumbers(number, list));
    
}
int remNum = 0;
System.out.println("What number do you want to remove from the list: ");
remNum = keys.nextInt();
method.remove(remNum);

        keys.close();
       

        
    }
}
