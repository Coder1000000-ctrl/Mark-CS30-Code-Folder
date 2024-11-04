// Program name: Box Word
// Student name: Mark Tucker
// Date: November 4, 2024
// Program Description: Repeats a word for every letter in that word

public class BoxWordRunner {
    public static void main(String[] args) throws Exception {
        BoxWord box = new BoxWord(); // creates a new object called box
        String words = box.input(); // gets the word
        int letters = box.calc(words); // calculates the number of letters
        box.output(words, letters); // repeats a word for every letter in that word
    }
}
