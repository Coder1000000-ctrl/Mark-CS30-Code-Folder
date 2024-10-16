// Program name: Geometry Calculator
// Student name: Mark Tucker
// Date: October 15, 2024
// Program Description: a program that calculates the surface area of a shape

import java.util.Scanner; // imports scanner

public class GeometryCalculatorRunner {
    public static void main(String[] args) throws Exception {
        // defines variables
        int choice = 0;
        double area = 0;
        double radius = 0;
        double sideLength = 0;
        double length = 0;
        double width = 0;
        
        GeometryCalculator calc = new GeometryCalculator(); // creates new object

        Scanner keys = new Scanner(System.in); // creates a scanner


        // takes in choice and does calculations
        System.out.print("Would you like to know the area of a \n1) Circle\n2) Cube\n3) Rectangle\nEnter Choice: ");
        choice = keys.nextInt();
        if (choice == 1){
            System.out.print("What is the radius: ");
            radius = keys.nextDouble();
            area =calc.circle(radius);
        }

        if (choice == 2){
            System.out.print("What is the side length: ");
            sideLength = keys.nextDouble();
            area =calc.cube(sideLength);
        }

        if (choice == 3){
            System.out.print("What is the length: ");
            length = keys.nextDouble();
            keys.nextLine();
            System.out.print("What is the width: ");
            width = keys.nextDouble();
            area =calc.rectangle(length, width); 
        }
        
        keys.close();
        calc.output(area); //outputs the area
        
    }
}
