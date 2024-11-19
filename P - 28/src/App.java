import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        System.out.println("Give me a word");
        String word = keys.nextLine();
        System.out.println(word);
        word = word.toUpperCase();
        System.out.println(word);
        int space = word.indexOf(" ");
        word = word.substring(0,space) + " -" + word.substring(space);
        System.out.println(word);
        keys.close();
        
    }
}
