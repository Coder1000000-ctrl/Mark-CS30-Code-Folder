import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        List<String> names = new ArrayList<String>();
        System.out.println("Do you want to play a game..");
        Thread.sleep(1600);
        System.out.print("Y/N: ");
        Scanner keys = new Scanner(System.in);
        String yesOrNo = keys.nextLine();
        if (yesOrNo.equals("Y") || yesOrNo.equals("y")) { 
            Thread.sleep(1600);
            System.out.println("Good...");
        }
        else {
            System.out.println("Well you'r playing anyways.");
        }
        Thread.sleep(1600);
        System.out.println("\nYou will put names in a hat and if they get picked...");
        Thread.sleep(1600);
        System.out.println("They lose!!!");
        Thread.sleep(1600);
        System.out.print("How many names do you want to enter: ");
        int numNames = keys.nextInt();
        keys.nextLine();
        for ( int i = 0; i<numNames;i++){
            System.out.print("Name " + (i+1) + "= ");
            names.add(keys.nextLine());
        }
        System.out.println(names);
        for ( int i = 0; i<numNames-1;i++){
            Thread.sleep(1600);
            System.out.print("I am not picking a name...");
            int randNum = (int)Math.random()*numNames-i;
            System.out.println();names.get(randNum);
            
        }

    }
}
