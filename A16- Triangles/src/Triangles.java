import java.util.Scanner; // imports a scanner

public class Triangles {
    Scanner keys = new Scanner(System.in); // creates a scanner
    // defines variabels
    private double s;
    private int sideNum;

    // constructor
    public Triangles(){
        s = 0;
        sideNum = 0;
    }
    // takes in input
    public double input(){
        sideNum++;
        System.out.print("What is the length of side " + sideNum + ": ");
        double num = keys.nextDouble();
        keys.nextLine();
        return num;

    }
    // calculates area
    public double calculate(double a, double b, double c){
        double perimeter = a + b + c;
        s = perimeter / 2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }

}
