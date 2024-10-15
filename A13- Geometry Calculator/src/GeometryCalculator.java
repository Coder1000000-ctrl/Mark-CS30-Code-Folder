public class GeometryCalculator {

    // defines variables
    private double surfaceArea = 0;

    // runs calcualtions for circle
    public double circle(double rad){
        surfaceArea = Math.PI * (rad * rad);
        return surfaceArea;
    }
    // runes calculations for cube
    public double cube(double side){
        surfaceArea = 6* (side * side);
        
        return surfaceArea;
        
    }
    // runes calculations for cube
    public double rectangle(double len, double wid){
        surfaceArea = len* wid;
        
        return surfaceArea;
        
    }
    //outputs the area
    public void output(double out){
        System.out.println("The surface area is " + out + " units.");
    }


}
