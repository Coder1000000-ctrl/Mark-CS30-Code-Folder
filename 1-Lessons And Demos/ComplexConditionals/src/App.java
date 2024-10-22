import javax.sound.midi.SysexMessage;

public class App {
    public static void main(String[] args) throws Exception {
        int x = 2;
        int y = 5;
        if (x<0){
            System.out.println("x is negative");
        }
        else if (x==0) { 
            System.out.println("x is zero");
        }
        else {
            System.out.println("x is positive");
        }
        if (x>0) {
            if (x>y){
                System.out.println("x is positive and greater than " + y);
            }
        }
        if (x>0 && x > y) {
            System.out.println("x i spositive and greater than " + y);
        }
        if (x<0) {
            System.out.println("Not a winner");
    
        }
        else if (x> 5) {
            System.out.println("Not a winner");
        }
        else {
                System.out.println("This is a winning number");
        }
        
        if (x < 0 || x>5) {
            System.out.println("Not a winner");
        }
        else (
            System.out.println("winner");
        )
    }
}
