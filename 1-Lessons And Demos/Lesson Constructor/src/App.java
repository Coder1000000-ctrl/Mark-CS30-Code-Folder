public class App {
    public static void main(String[] args) throws Exception {
        SubMethods test = new SubMethods();
        int num = test.myFunction();
        System.out.println("The return is " + num );
        myName();
    }
    private static void myName() {
        System.out.println("HELLO MARIO");
    }
}
