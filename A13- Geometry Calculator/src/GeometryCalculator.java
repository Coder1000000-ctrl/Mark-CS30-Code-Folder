
public class GeometryCalculator {
    private double surfaceArea = 0;


    public double circle(double rad){
        surfaceArea = Math.PI * (rad * rad);
        return surfaceArea;
    }
    public double cube(double side){
        surfaceArea = 6* (side * side);
        
        return surfaceArea;
        
    }
    public double rectangle(double len, double wid){
        surfaceArea = len* wid;
        
        return surfaceArea;
        
    }
    public void output(double out){
        System.out.println("The surface area is " + out + "units.");
    }


}
