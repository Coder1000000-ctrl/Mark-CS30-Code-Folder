// Program name: Triangles
// Student name: Mark Tucker
// Date: October 16, 2024
// Program Description: Calculates the area of a triangle.

public class TrianglesRunner {
    public static void main(String[] args) throws Exception {
        Triangles triangle = new Triangles(); // creates a new object

        // defines variables
        double sideOne = triangle.input();
        double sideTwo = triangle.input();
        double sideThree= triangle.input();
        double surfaceArea = 0;
        // calculates area
        surfaceArea = triangle.calculate(sideOne,sideTwo,sideThree);
        // outputs area
        System.out.println("The area of the trianble is " + surfaceArea +"units.");
    }
}
