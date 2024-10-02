public class App {
    public static void main(String[] args) throws Exception {
        boolean isCold = true;

        if (isCold) { //or (isCold==true)
            System.out.println("Where a coat");
            System.out.println("Wear Gloves");
        }

        

        System.out.println("Bye");


        int x = 2;
        int y = 3;
    
        // NOT A & B Short Circut law
        //( !(x > 0 && y<2) )
        //( !(x > 0) || !(y<2))
        if ( !(x > 0) || !(y<2)) {
            System.out.println("Where a coat");
            System.out.println("Wear Gloves");
        }

        

        System.out.println("Bye");
    }
}
