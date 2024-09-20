// Program name: Word Replacer
// Student name: Mark Tucker
// Date: Sept. 20,2024
// Program Description: Replaces or removes a word in a sentence.



public class App {
    public static void main(String[] args) throws Exception {
        String message1 = "I am very happy!";
        String target1 = "very ";
        int length1 = target1.length();
        int startOne = message1.indexOf(target1);
        System.out.println(message1.substring(0, startOne) + message1.substring((startOne + length1)));

        String message2 = "That was great - lol.";
        String target2 = "lol";
        String replacement = "laugh out loud.";
        int startTwo = message2.indexOf(target2);
        System.out.println(message2.substring(0, startTwo) + replacement);
    }
}
