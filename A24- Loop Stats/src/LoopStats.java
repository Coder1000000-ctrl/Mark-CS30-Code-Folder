import java.util.Scanner; //imports a scanner

public class LoopStats {
    Scanner keys = new Scanner(System.in); // reates a scanner

    // gets input
    public int input(String type) {
        System.out.print("What is your " + type + " number: ");
        int number = keys.nextInt();
        return number;
    }
    // calculates total
    public int total(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++){
            count = count + i;
        }
        return count;
    }
    // calculates even 
    public int even(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++){
            if (i%2 == 0){
                count++;
            }
        }
        return count;
    }
    // calculates odd
    public int odd(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++){
            if (i%2 == 1){
                count++;
            }
        }
        return count;
    }

}
