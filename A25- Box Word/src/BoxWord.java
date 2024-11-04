import java.util.Scanner; // improts a scanner

public class BoxWord {
    Scanner keys = new Scanner(System.in); // creates a scanner
    // gets input
    public String input() {
        System.out.print("Enter a word: ");
        String word = keys.nextLine();
        return word;
    }
    // calculates the length
    public int calc(String word) {
        int len = word.length();
        return len;
    }
    // repeats a word for every letter in that word
    public void output(String word, int len) {
        for (int i=1; i<=len; i++ ){
            System.out.println(word);
        }
    }

}
